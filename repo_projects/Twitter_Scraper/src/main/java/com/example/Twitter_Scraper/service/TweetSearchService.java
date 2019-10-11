package com.example.Twitter_Scraper.service;

import twitter4j.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TweetSearchService {


    public static void searchTweets(Twitter twitter, String queryGiven) throws TwitterException, IOException {
        Query query = new Query(queryGiven);
        QueryResult result = twitter.search(query);
        List<Status> tweets = result.getTweets();
        StringBuilder stringBuilder = new StringBuilder(2);
        for (Status tweet : tweets) {
            String formattedTweet = "@" + tweet.getUser().getScreenName() + ":" + tweet.getText();
            stringBuilder.append(formattedTweet);


        }

        String fileContent = stringBuilder.toString();
        FileWriter myWriter = new FileWriter("repo_tweets.txt");
        myWriter.write(fileContent);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }


    public static void searchUserByNumberOfFollowers(Twitter twitter, int page, String nameOfUser, int numOfFollowers) throws TwitterException, IOException {

        ResponseList<User> users = twitter.searchUsers(nameOfUser, page);
        StringBuilder stringBuilder = new StringBuilder(2);
        for (User user : users) {
            if (user.getStatus() != null && user.getFollowersCount() >= numOfFollowers) {
                users.add(user);
                String formattedTweet = "@" + user.getScreenName() + " : " + user.getStatus().getText() + " : " + user.getFollowersCount();
                stringBuilder.append(formattedTweet);

            }
            String fileContent = stringBuilder.toString();
            FileWriter myWriter = new FileWriter("repo_users.txt");
            myWriter.write(fileContent);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
    }
}




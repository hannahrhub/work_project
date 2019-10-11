package com.example.Twitter_Scraper;

import com.example.Twitter_Scraper.configuration.TwitterConfiguration;
import com.example.Twitter_Scraper.service.TweetSearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import twitter4j.*;

import java.io.*;

@SpringBootApplication
public class TwitterScraperApplication {

	public static void main(String[] args) throws TwitterException, IOException {
		SpringApplication.run(TwitterScraperApplication.class, args);

		Twitter tweets = TwitterConfiguration.getTwitterInstance();


		TweetSearchService.searchTweets(tweets, "kittens");
		TweetSearchService.searchTweets(tweets, "puppies");
		TweetSearchService.searchUserByNumberOfFollowers(tweets, 5, "Jill", 100);
		TweetSearchService.searchUserByNumberOfFollowers(tweets, 2, "Jill", 5000);


	}
}



















package com.example.Twitter_Scraper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


@Configuration
public class TwitterConfiguration {

    static final String CONSUMER_KEY = "IwtJeljk5Aqfw6A3kf8VrXnve";
    static final String CONSUMER_SECRET = "jjD9C41SpVwPdaR3huiR1ftUf8KcMFN3SfF9WCxSLj2EU22hHM";
    static final String ACCESS_TOKEN = "1040252764314644487-5Iai5FcRgVsOx2VqXUf0mqwwZmyg3f";
    static final String ACCESS_TOKEN_SECRET = "JDW1zwHrNZB0DBrBUFEtUO4DitE9Ses6tydmuYrpN9Ux3";
@Bean
    public static Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setJSONStoreEnabled(true);
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }


}




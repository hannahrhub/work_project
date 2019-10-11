package com.example.Twitter_Scraper.model.RawTweet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entities {

    private List<Object> hashtags = null;
    private List<Object> symbols = null;
    private List<UserMention> userMentions = null;
    private List<Object> urls = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

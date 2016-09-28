package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tothd on 9/27/2016.
 */
public class TweetList {
    List<Tweet> tweets = new ArrayList<Tweet>();
    public void addTweet(Tweet tweet) {

            if (tweets.contains(tweet)) {
                throw new IllegalArgumentException();
            } else {
                tweets.add(tweet);
            }

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void deleteTweet(Tweet a) {

        tweets.remove(a);
    }

    public int getCount(){
        return tweets.size();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}

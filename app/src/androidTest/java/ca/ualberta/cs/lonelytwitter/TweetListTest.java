package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tothd on 9/27/2016.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);

    }
    public void testAddTweet(){
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }
    public void testHasTweet(){
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");

        assertFalse(list.hasTweet(tweet));
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }
    public void testGetTweet(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        list.addTweet(a);
        list.addTweet(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));
    }

    public void testGetTweets(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hey!");
        Tweet c = new NormalTweet("Howdy!");

        list.addTweet(a);
        list.addTweet(b);
        list.addTweet(c);
        List<Tweet> nList = list.getTweets();
        assertEquals(a, nList.get(0));
        assertEquals(b,nList.get(1));
        assertEquals(c,nList.get(2));
    }

    public void testDeleteTweet(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        list.addTweet(a);
        assertTrue(list.hasTweet(a));
        list.deleteTweet(a);
        assertFalse(list.hasTweet(a));
    }

    public void testCountTweet(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hey!");
        Tweet c = new NormalTweet("Howdy!");

        list.addTweet(a);
        list.addTweet(b);
        list.addTweet(c);

        assertEquals(3, list.getCount());
    }
}

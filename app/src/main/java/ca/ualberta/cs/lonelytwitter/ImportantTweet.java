package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 * Used to specify a tweet that is Important
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message or tweet that this class contains
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}

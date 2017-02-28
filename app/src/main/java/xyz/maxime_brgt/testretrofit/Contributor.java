package xyz.maxime_brgt.testretrofit;

/**
 * Created by maxim on 21/02/2017.
 */

public class Contributor {

    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}

package xyz.maxime_brgt.testretrofit;

/**
 * Created by maxim on 21/02/2017.
 */

public class Tag {
    boolean success;
    int status;

    private DataTag data;

    @Override
    public String toString() {
        return success + " - " + status + " - " + data;
    }
}

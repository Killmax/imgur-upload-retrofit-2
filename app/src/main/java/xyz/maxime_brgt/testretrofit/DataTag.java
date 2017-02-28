package xyz.maxime_brgt.testretrofit;

/**
 * Created by maxim on 21/02/2017.
 */

public class DataTag {
//    "name": "cat",
//            "display_name": "cat",
//            "followers": 389,
//            "total_items": 73623,
//            "following": false,
    String name;
    String display_name;
    int followers;
    int total_items;

    @Override
    public String toString() {
        return name + " - " + followers + " followers - " + total_items + " items";
    }
}

package xyz.maxime_brgt.testretrofit;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by maxim on 21/02/2017.
 */

interface ImgurService {
    @Headers("Authorization: Client-ID 0b5e46b0ac7b39f")
    @GET("gallery/t/{tag}/viral/{number}")
    Call<Tag> getTag(
            @Path("tag") String tag,
            @Path("number") int number);

    @Multipart
    @Headers({
            "Authorization: Client-ID 0b5e46b0ac7b39f"
    })
    @POST("image")
    Call<ImageResponse> postImage(
            @Query("title") String title,
            @Query("description") String description,
            @Query("album") String albumId,
            @Query("account_url") String username,
            @Part MultipartBody.Part file);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.imgur.com/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

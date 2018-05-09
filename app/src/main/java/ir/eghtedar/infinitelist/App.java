package ir.eghtedar.infinitelist;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.squareup.picasso.Picasso;

import java.io.File;

import ir.eghtedar.infinitelist.net.ApiService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;



public class App extends Application {

    private static final String DIGI ="digiCach" ;
    private Context context;
    private Picasso picasso;
    private ApiService apiService;


    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();

        File file=new File(getCacheDir(),DIGI);

        Cache cache=new Cache(file,1024*1024*5);

        OkHttpClient client=new OkHttpClient.Builder()
                .cache(cache)
                .build();


        picasso= new Picasso.Builder(this)
                .build();


        apiService=getRetrofit(client).create(ApiService.class);



    }

    public  Context getContext(){
        return  context;
    }

    public static App getAplication(Activity activity){
        return (App)activity.getApplication();

    }

    public Picasso getPicasso() {
        return picasso;
    }

    public  ApiService getApiService() {
        return apiService;
    }

    private Retrofit getRetrofit(OkHttpClient client){

        return new Retrofit.Builder()
                .baseUrl(Constant.url)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



}

package ir.eghtedar.infinitelist.net;

import io.reactivex.Flowable;
import ir.eghtedar.infinitelist.datamodel.Good;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ApiService {

    @GET("0/48240")
    Flowable<Good> getDataModel(
            @Query("page") int  page
    );
}

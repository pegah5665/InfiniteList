package ir.eghtedar.infinitelist.mvp;

import android.app.Activity;

import io.reactivex.Flowable;
import ir.eghtedar.infinitelist.datamodel.Good;
import ir.eghtedar.infinitelist.net.ApiService;



public class ModelInfinite {

    private ApiService apiService;
    private Activity activity;

    public ModelInfinite( Activity activity,ApiService apiService) {
        this.apiService = apiService;
        this.activity = activity;
    }

    public Flowable<Good>  getDataList(int page){

        return apiService.getDataModel(page);

    }
}

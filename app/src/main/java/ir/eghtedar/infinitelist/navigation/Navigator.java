package ir.eghtedar.infinitelist.navigation;

import android.content.Context;
import android.content.Intent;

import ir.eghtedar.infinitelist.MainActivity;

/**
 * Created by Pegah on 4/24/2018.
 */

public class Navigator {

    public void navigteToMainActivity(Context context){
        if(context!=null){
        Intent intent= MainActivity.start(context);
        context.startActivity(intent);}
    }
}

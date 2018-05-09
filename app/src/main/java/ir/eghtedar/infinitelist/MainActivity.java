package ir.eghtedar.infinitelist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.eghtedar.infinitelist.mvp.ModelInfinite;
import ir.eghtedar.infinitelist.mvp.PresenterInfinite;
import ir.eghtedar.infinitelist.mvp.view.AdapterInfinite;
import ir.eghtedar.infinitelist.mvp.view.ViewInfinite;

public class MainActivity extends AppCompatActivity {

    private PresenterInfinite presenter;

    public static Intent start(Context ctx){
        return new Intent(ctx,MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        AdapterInfinite adapter=new AdapterInfinite(this);

        ModelInfinite model=new ModelInfinite(this,App.getAplication(this).getApiService());
        ViewInfinite view =new ViewInfinite(this,adapter);

        setContentView(view);

        presenter=new PresenterInfinite(model,view);
        presenter.onCreat();


    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }
}

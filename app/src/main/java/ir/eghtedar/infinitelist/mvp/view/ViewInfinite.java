package ir.eghtedar.infinitelist.mvp.view;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.eghtedar.infinitelist.datamodel.Item;
import ir.eghtedar.infinitelist.R;
import ir.eghtedar.infinitelist.customRecycler.ListenEndScroll;
import ir.eghtedar.infinitelist.customRecycler.MyRecyclerView;


public class ViewInfinite extends FrameLayout {

    @BindView(R.id.rcl_main)
    MyRecyclerView recyclerView;

    @BindView(R.id.progress_main)
    ProgressBar progress;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private AppCompatActivity activity;
    private AdapterInfinite adapter;

      //be jaye context activity ra dar voroodi saznde migirim, baraye toolbar niyaz darim
    //(hatman AppCompatActivity ta dar version haye az toolbar betoonim estefase konim
     public ViewInfinite(@NonNull AppCompatActivity activity, AdapterInfinite adapter) {
        super(activity);
         this.activity=activity;
         this.adapter=adapter;

         LayoutInflater.from(getContext()).inflate(R.layout.activity_main,this,true);
        //inflate(getContext(),R.layout.activity_main,this,);
        ButterKnife.bind(this);
         setToolbar();
         init();
    }




    private void init() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        final SwipeRefreshLayout swipeRefreshLayout=findViewById(R.id.swipe_refresh_list);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },2000);
            }
        });

        swipeRefreshLayout.setColorSchemeColors(ContextCompat.getColor(activity,R.color.colorAccent)
                ,ContextCompat.getColor(activity,R.color.colorPrimary)
        );
    }

    private void setToolbar() {

        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setHomeButtonEnabled(true);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void showLoding(boolean loading){
        if (loading)
            progress.setVisibility(VISIBLE);
        else
            progress.setVisibility(INVISIBLE);
    }

    public void setDatatoRecycler(List<Item>  list){

        adapter.setData(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLoading(false);

    }

    //az  inteface Laoding baraye in estefade mikonim ke, vaghti dar mvp, view ra az activity joda mikonim
    //baraye goosh dadne be residan be entehaye list, dar presenter be recycler dastresi nadarim,
    //vaghti be entahaye list residim methode in  in interface  seda zade mishavad
    public void loadAtEndList(final Laoding on){

        recyclerView.setListenEndScroll(new ListenEndScroll() {
            @Override
            public void MoreLoad() {
                on.load();
            }
        });
    }


    public interface Laoding{
        void load();
    }
}

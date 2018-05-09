package ir.eghtedar.infinitelist.customRecycler;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;


public class MyRecyclerView extends android.support.v7.widget.RecyclerView {

    private MyScrollListener myScrollListener;
    private ListenEndScroll listenEndScroll;




    public void setListenEndScroll(ListenEndScroll listenEndScroll) {
        this.listenEndScroll = listenEndScroll;
    }


    public  void setLoading(boolean loading){
        myScrollListener.setLoading(loading);
    }


    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setLayoutManager(LayoutManager layout) {
        if(!(layout instanceof LinearLayoutManager)){
            throw new RuntimeException();}

        myScrollListener =new MyScrollListener(layout) {
            @Override
            void onMoreLoad() {
                if(listenEndScroll!=null){
                listenEndScroll.MoreLoad();}
            }
        };

        addOnScrollListener(myScrollListener);

        super.setLayoutManager(layout);
    }
}

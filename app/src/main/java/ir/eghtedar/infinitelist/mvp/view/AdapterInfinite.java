package ir.eghtedar.infinitelist.mvp.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ir.eghtedar.infinitelist.R;
import ir.eghtedar.infinitelist.datamodel.Item;


public class AdapterInfinite extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;

    public AdapterInfinite(Context context) {

        this.context = context;
    }

    private List<Item> list=new ArrayList<>();


    public void setData(List<Item> list) {
        this.list.addAll(list) ;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolderInfinite(LayoutInflater.from(context).inflate(R.layout.row_infinite,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderInfinite myHolder=(ViewHolderInfinite)holder;
        myHolder.setData(list.get(position));

    }

    @Override
    public int getItemCount() {

        return list.size();
    }
}

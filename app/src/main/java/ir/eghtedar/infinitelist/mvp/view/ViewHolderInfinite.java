package ir.eghtedar.infinitelist.mvp.view;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.eghtedar.infinitelist.App;
import ir.eghtedar.infinitelist.datamodel.Item;
import ir.eghtedar.infinitelist.R;

/**
 * Created by Pegah on 4/24/2018.
 */

public class ViewHolderInfinite extends RecyclerView.ViewHolder {

    @BindView(R.id.txtId)
    TextView txtId;

    @BindView(R.id.txtName)
    TextView txtName;

    @BindView(R.id.txtDetaile)
    TextView txtDetaile;


    @BindView(R.id.imageView)
    ImageView imageView;

    public ViewHolderInfinite(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setData(Item item) {
        txtId.setText(item.getGoodid()+"");
        txtName.setText(item.getGoodname());
        txtDetaile.setText(item.getGooddescription());

        Picasso picasso = App.getAplication((Activity) itemView.getContext()).getPicasso();
        picasso.load(item.getImageurl()).into(imageView);

    }
}

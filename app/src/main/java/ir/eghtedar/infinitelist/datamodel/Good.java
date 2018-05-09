package ir.eghtedar.infinitelist.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Arash on 4/24/2018.
 */
public class Good {
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public  List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

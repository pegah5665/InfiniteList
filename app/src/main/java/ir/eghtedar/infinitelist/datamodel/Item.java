package ir.eghtedar.infinitelist.datamodel;

import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("goodid")
    @Expose
    private Integer goodid;
    @SerializedName("goodcode")
    @Expose
    private String goodcode;
    @SerializedName("goodname")
    @Expose
    private String goodname;
    @SerializedName("goodlatinname")
    @Expose
    private String goodlatinname;
    @SerializedName("goodnationalitycode")
    @Expose
    private String goodnationalitycode;
    @SerializedName("gooddescription")
    @Expose
    private String gooddescription;
    @SerializedName("goodgooglekeyword")
    @Expose
    private String goodgooglekeyword;
    @SerializedName("goodtechinfo")
    @Expose
    private String goodtechinfo;
    @SerializedName("goodunitid")
    @Expose
    private Integer goodunitid;
    @SerializedName("goodbrandid")
    @Expose
    private Integer goodbrandid;
    @SerializedName("goodwidth")
    @Expose
    private Integer goodwidth;
    @SerializedName("goodheight")
    @Expose
    private Integer goodheight;
    @SerializedName("goodlength")
    @Expose
    private Integer goodlength;
    @SerializedName("goodweight")
    @Expose
    private Integer goodweight;
    @SerializedName("goodbarcode")
    @Expose
    private String goodbarcode;
    @SerializedName("imageurl")
    @Expose
    private String imageurl;
    @SerializedName("unitname")
    @Expose
    private String unitname;
    @SerializedName("brandname")
    @Expose
    private String brandname;
    @SerializedName("pricinglistid")
    @Expose
    private Integer pricinglistid;
    @SerializedName("unitprice")
    @Expose
    private String unitprice;
    @SerializedName("goodcolumnid")
    @Expose
    private Integer goodcolumnid;
    @SerializedName("priceexpiredate")
    @Expose
    private String priceexpiredate;
    @SerializedName("goodcategoryid")
    @Expose
    private Integer goodcategoryid;
    @SerializedName("sumfavorite")
    @Expose
    private Integer sumfavorite;
    @SerializedName("sumwish")
    @Expose
    private Integer sumwish;
    @SerializedName("sumbuyers")
    @Expose
    private Integer sumbuyers;
    @SerializedName("sumsales")
    @Expose
    private Integer sumsales;
    @SerializedName("hasuserfavorite")
    @Expose
    private Integer hasuserfavorite;
    @SerializedName("hasuserwish")
    @Expose
    private Integer hasuserwish;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getGoodcode() {
        return goodcode;
    }

    public void setGoodcode(String goodcode) {
        this.goodcode = goodcode;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getGoodlatinname() {
        return goodlatinname;
    }

    public void setGoodlatinname(String goodlatinname) {
        this.goodlatinname = goodlatinname;
    }

    public String getGoodnationalitycode() {
        return goodnationalitycode;
    }

    public void setGoodnationalitycode(String goodnationalitycode) {
        this.goodnationalitycode = goodnationalitycode;
    }

    public String getGooddescription() {
        return gooddescription;
    }

    public void setGooddescription(String gooddescription) {
        this.gooddescription = gooddescription;
    }

    public String getGoodgooglekeyword() {
        return goodgooglekeyword;
    }

    public void setGoodgooglekeyword(String goodgooglekeyword) {
        this.goodgooglekeyword = goodgooglekeyword;
    }

    public String getGoodtechinfo() {
        return goodtechinfo;
    }

    public void setGoodtechinfo(String goodtechinfo) {
        this.goodtechinfo = goodtechinfo;
    }

    public Integer getGoodunitid() {
        return goodunitid;
    }

    public void setGoodunitid(Integer goodunitid) {
        this.goodunitid = goodunitid;
    }

    public Integer getGoodbrandid() {
        return goodbrandid;
    }

    public void setGoodbrandid(Integer goodbrandid) {
        this.goodbrandid = goodbrandid;
    }

    public Integer getGoodwidth() {
        return goodwidth;
    }

    public void setGoodwidth(Integer goodwidth) {
        this.goodwidth = goodwidth;
    }

    public Integer getGoodheight() {
        return goodheight;
    }

    public void setGoodheight(Integer goodheight) {
        this.goodheight = goodheight;
    }

    public Integer getGoodlength() {
        return goodlength;
    }

    public void setGoodlength(Integer goodlength) {
        this.goodlength = goodlength;
    }

    public Integer getGoodweight() {
        return goodweight;
    }

    public void setGoodweight(Integer goodweight) {
        this.goodweight = goodweight;
    }

    public String getGoodbarcode() {
        return goodbarcode;
    }

    public void setGoodbarcode(String goodbarcode) {
        this.goodbarcode = goodbarcode;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Integer getPricinglistid() {
        return pricinglistid;
    }

    public void setPricinglistid(Integer pricinglistid) {
        this.pricinglistid = pricinglistid;
    }

    public String getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getGoodcolumnid() {
        return goodcolumnid;
    }

    public void setGoodcolumnid(Integer goodcolumnid) {
        this.goodcolumnid = goodcolumnid;
    }

    public String getPriceexpiredate() {
        return priceexpiredate;
    }

    public void setPriceexpiredate(String priceexpiredate) {
        this.priceexpiredate = priceexpiredate;
    }

    public Integer getGoodcategoryid() {
        return goodcategoryid;
    }

    public void setGoodcategoryid(Integer goodcategoryid) {
        this.goodcategoryid = goodcategoryid;
    }

    public Integer getSumfavorite() {
        return sumfavorite;
    }

    public void setSumfavorite(Integer sumfavorite) {
        this.sumfavorite = sumfavorite;
    }

    public Integer getSumwish() {
        return sumwish;
    }

    public void setSumwish(Integer sumwish) {
        this.sumwish = sumwish;
    }

    public Integer getSumbuyers() {
        return sumbuyers;
    }

    public void setSumbuyers(Integer sumbuyers) {
        this.sumbuyers = sumbuyers;
    }

    public Integer getSumsales() {
        return sumsales;
    }

    public void setSumsales(Integer sumsales) {
        this.sumsales = sumsales;
    }

    public Integer getHasuserfavorite() {
        return hasuserfavorite;
    }

    public void setHasuserfavorite(Integer hasuserfavorite) {
        this.hasuserfavorite = hasuserfavorite;
    }

    public Integer getHasuserwish() {
        return hasuserwish;
    }

    public void setHasuserwish(Integer hasuserwish) {
        this.hasuserwish = hasuserwish;
    }

}
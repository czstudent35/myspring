package cn.myspring.po;


import org.springframework.stereotype.Repository;

import java.util.*;


public class Item {

    /**
     * Created by user on 2017/12/4.
     */

        private  String item_id;
        private  String item_name;
        private  String item_standard;
        private  String item_unit;
        private  int   standard_number;
        private  String customer_id;
        private  int   safey_stock;
        private  String item_type;
        private  String item_status;


    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_standard() {
        return item_standard;
    }

    public void setItem_standard(String item_standard) {
        this.item_standard = item_standard;
    }

    public String getItem_unit() {
        return item_unit;
    }

    public void setItem_unit(String item_unit) {
        this.item_unit = item_unit;
    }

    public int getStandard_number() {
        return standard_number;
    }

    public void setStandard_number(int standard_number) {
        this.standard_number = standard_number;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public int getSafey_stock() {
        return safey_stock;
    }

    public void setSafey_stock(int safey_stock) {
        this.safey_stock = safey_stock;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getItem_status() {
        return item_status;
    }

    public void setItem_status(String item_status) {
        this.item_status = item_status;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_id='" + item_id + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_standard='" + item_standard + '\'' +
                ", item_unit='" + item_unit + '\'' +
                ", standard_number=" + standard_number +
                ", customer_id='" + customer_id + '\'' +
                ", safey_stock=" + safey_stock +
                ", item_type='" + item_type + '\'' +
                ", item_status='" + item_status + '\'' +
                '}';
    }
}

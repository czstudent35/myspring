package cn.myspring.po;

import java.util.*;

/**
 * Created by user on 2017/12/5.
 */
public class QueryItem {
    private Item item;
    private List<String> listID;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<String> getListID() {
        return listID;
    }

    public void setListID(List<String> listID) {
        this.listID = listID;
    }
}

package cn.myspring.service;
import java.util.*;
import cn.myspring.po.Item;

/**
 * Created by user on 2017/12/8.
 */
public interface ItemService  {
    public Item findItemById(String item_id)throws Exception;

}

package cn.myspring.mapper;

import cn.myspring.po.Item;
import cn.myspring.po.QueryItem;

import java.util.*;

/**
 * Created by user on 2017/12/4.
 */
public interface ItemMapper {
     Item findItemById(String item_id)throws Exception;
     List<Item> findItemByItemName(String item_name)throws Exception;
     void addItem(Item item)throws Exception;
    void updateItem(Item item)throws Exception;
    void deleteItem(String id)throws Exception;
     List<Item> queryItem(QueryItem queryItem)throws Exception;
    List<Item> queryItem1(List list)throws Exception;


}

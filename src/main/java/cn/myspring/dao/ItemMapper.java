package cn.myspring.dao;

import cn.myspring.po.Item;

/**
 * Created by user on 2017/12/4.
 */
public interface ItemMapper {
   public  Item findItemById(String id)throws Exception;



}

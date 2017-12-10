package cn.myspring.mapper;

import cn.myspring.po.Item;

import java.util.*;

/**
 * Created by user on 2017/12/4.
 */
public interface ItemMapper {
     Item findItemById(String item_id)throws Exception;



}

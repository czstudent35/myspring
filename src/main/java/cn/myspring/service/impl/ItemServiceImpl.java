package cn.myspring.service.impl;

import cn.myspring.mapper.ItemMapper;
import cn.myspring.po.Item;
import cn.myspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 2017/12/8.
 */
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;


    public Item findItemById(String item_id) throws Exception {
       Item item=itemMapper.findItemById(item_id);
        return item;


    }
}

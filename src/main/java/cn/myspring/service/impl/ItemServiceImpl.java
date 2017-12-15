package cn.myspring.service.impl;

import cn.myspring.dao.ItemMapper;
import cn.myspring.po.Item;
import cn.myspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user on 2017/12/12.
 */

public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;


    public Item findItemById(String id) throws Exception {
       Item item=itemMapper.findItemById(id);

        return item;
    }
}

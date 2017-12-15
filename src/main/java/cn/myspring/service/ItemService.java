package cn.myspring.service;

import cn.myspring.po.Item;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2017/12/12.
 */
@Service
public interface ItemService {
    Item findItemById(String id) throws Exception;
}

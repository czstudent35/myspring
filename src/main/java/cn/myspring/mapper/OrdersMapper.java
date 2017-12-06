package cn.myspring.mapper;
import java.util.*;

import cn.myspring.po.Orders;


/**
 * Created by user on 2017/12/6.
 */
public interface OrdersMapper {
   List<Orders> queryOrders()throws Exception;


}

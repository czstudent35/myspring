package cn.myspring.mapper;

import cn.myspring.po.Orders;
import cn.myspring.po.OrdersUser;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.util.*;
import java.io.InputStream;

/**
 * Created by user on 2017/12/6.
 */
public class OrdersMapperTest extends TestCase {
    SqlSessionFactory sqlSessionFactory=null;
    public void setUp()throws Exception{
        String resource="sqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        super.setUp();
    }
    @Test
    public void testqueryOrders() throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{

            OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
           List<Orders> list1 =ordersMapper.queryOrders() ;
            System.out.println(list1.get(1).toString());

        }finally {
            sqlSession.close();
        }
    }


}
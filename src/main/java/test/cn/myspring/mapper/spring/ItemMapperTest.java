package test.cn.myspring.mapper.spring;

import cn.myspring.dao.ItemMapper;
import cn.myspring.dao.UserMapper;
import cn.myspring.po.Item;
import cn.myspring.po.User;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 2017/12/12.
 */
public class ItemMapperTest {
   public ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception{
        applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext_test.xml");

    }
    @Test
    public void     testFindItemById()throws Exception{
        ItemMapper itemMapper= (ItemMapper) applicationContext.getBean("itemMapper");
        Item item=itemMapper.findItemById("12008");
        System.out.println(item);

    }

    @Test
    public void   testFindUserByName()throws Exception{
        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
        List<User> userList= userMapper.findUserByName("张");
        System.out.println(userList.size());

    }


}
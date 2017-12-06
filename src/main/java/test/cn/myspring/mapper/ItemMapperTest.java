package cn.myspring.mapper;

import cn.myspring.po.Customer;
import cn.myspring.po.Item;
import cn.myspring.po.QueryItem;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.awt.event.ItemListener;
import java.util.*;
import java.io.InputStream;

/**
 * Created by user on 2017/12/4.
 */
public class ItemMapperTest extends TestCase {

    private SqlSessionFactory sqlSessionFactory;
    public void setUp() throws Exception {
        String resource="sqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        super.setUp();

    }
    @Test
    public void testqueryItem()throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
//            QueryItem queryItem=new QueryItem();
            List<Item> itemList=new ArrayList<Item>();
            Item item1=new Item();
            Item item2=new Item();
            Item item3=new Item();
            Item item4=new Item();
            item1.setItem_id("12004");
            item2.setItem_id("12008");
            item3.setItem_id("12009");
            item4.setItem_id("12010");
            itemList.add(item1);
            itemList.add(item2);
            itemList.add(item3);
            itemList.add(item4);

            System.out.println(itemList);
            ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
           List<Item> itemList2= itemMapper.queryItem1(itemList);
            sqlSession.commit();
            System.out.println("数据出来了，看对没有");
            System.out.println(itemList2);
        }finally {
            sqlSession.close();
        }
    }
@Test
    public void testFindItemById() throws Exception {
        SqlSession sqlSession=sqlSessionFactory.openSession();
       try {
           ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
           Item item = itemMapper.findItemById("777");
           System.out.println(item.getItem_name());
       }finally {
           sqlSession.close();
       }
    }
    @Test
//    根据名称查询
    public void testfindItemByItemName() throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
            ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
            List<Item> itemList=itemMapper.findItemByItemName("电脑");
            System.out.println(itemList.size());
            System.out.println(itemList);

        }finally {
            sqlSession.close();
        }
    }
    @Test
//    新增产品
    public void testaddItem()throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
            Item item=new Item();
            item.setItem_id("888");
            item.setItem_name("联想");
            item.setItem_standard("一台");
            item.setItem_unit("台");
            item.setStandard_number(12);
            item.setCustomer_id("12");
            item.setSafey_stock(100);
            item.setItem_type("中小企业版");
            item.setItem_status("ok");
            ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
            itemMapper.addItem(item);
            sqlSession.commit();
            System.out.println("产品明细: "+item);
        }finally {
            sqlSession.close();
        }
    }
    @Test
//    更新产品
    public void testUpdateItem()throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{
            Item item=new Item();
            item.setItem_id("888");
            item.setItem_name("财务部电脑");
            item.setItem_standard("只能标准一台");
            item.setItem_unit("台");
            item.setStandard_number(100);
            item.setCustomer_id("12");
            item.setSafey_stock(100);
            item.setItem_type("在中小企业版");
            item.setItem_status("no");
            ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
            itemMapper.updateItem(item);
            sqlSession.commit();
            System.out.println("产品更改明细: "+item);
        }finally {
            sqlSession.close();
        }
    }
    @Test
//    删除产品
    public void testdeleteItem()throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try{

            ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
            itemMapper.deleteItem("666");
            sqlSession.commit();
            System.out.println("已删除产品");
        }finally {
            sqlSession.close();
        }
    }
}
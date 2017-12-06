package item;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import cn.myspring.po.Item;

/**
 * Created by user on 2017/12/4.
 * alter:Nick Chen
 */
public class itemtest {
    //创建会话工厂
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void createSqlSessionFactory() throws IOException {
        String resource="sqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
//    产品id查找产品信息
    public void testfindItem() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            Item item = sqlSession.selectOne("test.findItemById", "30196");
            System.out.println(item);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
    @Test
//    通过名称查找产品
    public void testfindItemByName() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();

            java.util.List<Item> list=sqlSession.selectList("test.findItemByItemName", "罐身铝材");
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
    @Test
//    添加产品
    public void addItem() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            Item item=new Item();
            item.setItem_id("1111");
            item.setItem_name("手机");
            item.setItem_standard("一部，好的");
            item.setCustomer_id("12");
            item.setStandard_number(23);
            item.setSafey_stock(2);

            java.util.List<Item> list=sqlSession.selectList("test.addItem", item);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
    @Test
//    更新产品信息
    public void alterItem() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            Item item=new Item();
            item.setItem_id("1234");
            item.setItem_name("华为手机");
            item.setItem_standard("只需要一部就可以了");
            item.setCustomer_id("32");
            item.setStandard_number(11);
            item.setSafey_stock(5);

            sqlSession.update("test.alterItem",item);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
    @Test
//    删除产品信息
    public void deleteItem() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();


            sqlSession.delete("test.deleteItem", "1111");
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("this is delete OK ");
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
}

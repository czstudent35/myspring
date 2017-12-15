package test.cn.myspring.mapper;

import cn.myspring.dao.ItemMapper;
import cn.myspring.po.Item;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by user on 2017/12/11.
 */
public class ItemMapperTest extends TestCase {
    private SqlSessionFactory sqlSessionFactory;
    protected void setUp() throws Exception{
        String resource="mybatis/sqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sqlSessionFactory=new  SqlSessionFactoryBuilder().build(inputStream);
    }

    public void testFindItemById() throws Exception {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try {
            ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
            Item item = itemMapper.findItemById("11005");
            System.out.println(item);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }



    }
}
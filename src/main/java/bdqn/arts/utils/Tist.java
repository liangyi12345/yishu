package bdqn.arts.utils;

import bdqn.arts.dao.ProductMapper;
import bdqn.arts.dao.SessionMapper;
import bdqn.arts.pojo.Product;
import bdqn.arts.pojo.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Tist {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        List<Product> list = sqlSession.getMapper(ProductMapper.class).seclectAll();
        for (Product p : list) {
            System.out.println(p.getId() + p.getOriginal());


        }

    }
}

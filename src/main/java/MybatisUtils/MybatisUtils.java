package MybatisUtils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    public static SqlSessionFactory factory = null;
    static {
        try {
            InputStream config = Resources.getResourceAsStream("mybatis.xml");

            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            factory = builder.build(config);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession(){
       return factory.openSession(true);
    }
}

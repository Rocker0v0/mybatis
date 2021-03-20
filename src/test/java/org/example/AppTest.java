package org.example;


import MybatisUtils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import dao_interface.DbMethod;
import daos.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import vo.ManyTableSelect;
import vo.SelectObjectOne;

import java.util.ArrayList;
import java.util.List;

public class AppTest 
{
   //测试传递单个参数
    @Test
    public void shouldAnswerWithTrue()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod dbMethod = sqlSession.getMapper(DbMethod.class);
        User user = dbMethod.selectInfo(1002);
        System.out.println(user);
    }

    //测试传递多个参数
    @Test
    public void testSelectInfoByParams(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

       DbMethod dbMethod = sqlSession.getMapper(DbMethod.class);
      List<User> userList =  dbMethod.selectInfoByParams("Jeck",1003);
      userList.forEach(res->{
          System.out.println(res);
      });
    }

    //传递对象
    @Test
    public void testSelectInfoByObject(){

        SelectObjectOne selectObjectOne = new SelectObjectOne();
        selectObjectOne.setRname("Rocker");
        selectObjectOne.setRage(22);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod db = sqlSession.getMapper(DbMethod.class);

        List<User> userList = db.selectInfoByObject(selectObjectOne);

        userList.forEach(res->{
            System.out.println(res);
        });

    }
    //多表查询
    @Test
    public void testSelectManyTableSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod db = sqlSession.getMapper(DbMethod.class);
        List<ManyTableSelect> manyTableSelectList = db.selectManyTableSelect(4001);

        manyTableSelectList.forEach(res->{
            System.out.println(res);
        });
    }

    @Test
    public void testSelectInfoByUseWhereAndIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod db = sqlSession.getMapper(DbMethod.class);
        User user = new User();
        user.setRid(1002);
        user.setRname("Rocker");
        List<User> userList = db.selectInfoByUseWhereAndIf(user);
        userList.forEach(res->{
            System.out.println(res);
        });

    }
    //测试forEach标签
    @Test
    public void testSelectInfoByForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod db = sqlSession.getMapper(DbMethod.class);
        User user = new User();
        List<User> list = new ArrayList<>();

        user.setRid(1002);
        list.add(user);
        user = new User();
        user.setRid(1001);
        list.add(user);
        user = new User();
        user.setRid(1003);
        list.add(user);

        List<User> userList = db.selectInfoByForEach(list);
        userList.forEach(res->{
            System.out.println(res);
        });

    }

    @Test
    public void testSelectAll()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DbMethod dbMethod = sqlSession.getMapper(DbMethod.class);
        //使用分页插件，会自动根据数据库类型，在sql语句后面拼接取不同数据
        PageHelper.startPage(1,3);
        List<User> userList = dbMethod.selectAll();
        userList.forEach(res->{
           System.out.println(res);
        });
    }

}

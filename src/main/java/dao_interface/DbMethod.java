package dao_interface;

import daos.User;
import org.apache.ibatis.annotations.Param;
import vo.ManyTableSelect;
import vo.SelectObjectOne;

import java.util.List;

public interface DbMethod {

    //传递单个参数
    public User selectInfo(Integer id);

    //传递多个参数，使用Param注解，去一个别名，用来位移的表示该参数
    public List<User> selectInfoByParams(@Param("name") String Rname, @Param("id") Integer Rid);

    public List<User> selectInfoByObject(SelectObjectOne selectObjectOne);

    //多表查询
    public List<ManyTableSelect> selectManyTableSelect(@Param("Pid") Integer Pid);

    //测试where和if标签
    public List<User> selectInfoByUseWhereAndIf(User user);

    //测试foreach标签
    public List<User> selectInfoByForEach(List<User> list);

//    分页查询所有
    public List<User> selectAll();
}

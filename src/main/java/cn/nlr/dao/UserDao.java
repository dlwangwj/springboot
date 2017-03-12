package cn.nlr.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.nlr.common.BaseDao;
import cn.nlr.model.User;


public interface UserDao extends BaseDao<User>{
	
	@Select("select * from user where age = #{age}")
	public List<User> selectByAge(Integer age);
	@Select("select * from user where name = #{name}")
	public User selectByName(String name);
	//@UpdateProvider(type = User.class, method = "update")
	//public void updateUser(User user);
	@Update("update user set name = #{name} where id = #{id}")
	public void update(@Param("id")int id,@Param("name")String name);
}

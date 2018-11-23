package com.example.demo.dao.master;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.example.demo.data.User;
public interface MasterMapper {
	
	public  List<User> selectAllUser();
	
	public User selectByPrimaryKey(@Param(value="name") String name);

}

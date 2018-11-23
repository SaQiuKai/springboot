package com.example.demo.dao.cluster;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.example.demo.data.User;
public interface ClusterMapper {
	
	public  List<User> selectAllUser();
	
	public User selectByPrimaryKey(@Param(value="name") String name);

}

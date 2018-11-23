package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.data.User;

@Service
public class TestService {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public List getList(){
    	
        String sql = "select id,name,age,password from test_user";
        return (List) jdbcTemplate.query(sql, new RowMapper(){
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getString("age"));
                user.setPassword(rs.getString("password"));
                return user;
            }
 
        });
    }
}

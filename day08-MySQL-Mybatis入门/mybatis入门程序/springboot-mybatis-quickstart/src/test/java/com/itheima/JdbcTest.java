package com.itheima;

import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {
    @Test
    public void testJdbc() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/mybatis";
        String username="root";
        String password="123456";
        Connection conn = DriverManager.getConnection(url,username,password);
        Statement stmt = conn.createStatement();
        String sql="select * from user";
        ResultSet rs = stmt.executeQuery(sql);
        List<User> users = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            short age = rs.getShort("age");
            short gender = rs.getShort("gender");
            String phone = rs.getString("phone");
            users.add(new User(id,name,age,gender,phone));
        }
        stmt.close();
        conn.close();
        rs.close();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

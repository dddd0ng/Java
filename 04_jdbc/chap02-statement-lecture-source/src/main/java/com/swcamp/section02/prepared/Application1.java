package com.swcamp.section02.prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.swcamp.common.JDBCTemplate.getConnection;
import static com.swcamp.common.JDBCTemplate.close;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            pstmt = con.prepareStatement("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
            rset = pstmt.executeQuery();

            while (rset.next()) {
                System.out.println(rset.getString("EMP_ID") + "사번의 "
                        + rset.getString("EMP_NAME") + "사원");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);   // PreparedStatement는 Statement의 자식 클래스라 다형성에 의해 기존 close() 활용 가능
            close(con);
        }
    }
}
package com.swcamp.section03.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.swcamp.common.JDBCTemplate.*;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        int result = 0;

        /* 설명. soft delete*/
        String query = "UPDATE TBL_MENU SET ORDERABLE_STATUS = 'N' WHERE MENU_CODE = ?";

        /* 설명. hard delete*/
        String query1 = "DELETE FROM TBL_MENU WHERE MENU_CODE = ? ";

        try {
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,33);

            result = pstmt.executeUpdate();
            if(result==1){
                commit(con);
            }else{
                rollback(con);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
            close(con);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NGHIA
 */
public class jdbcHelper {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                 + "databaseName=QuanLyCafe;"
                 + "user=sa;password=nghia;"
                 + "encrypt=true;trustServerCertificate=true;";
    
    //nạp driver
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static PreparedStatement getStmt(String sql,Object...args) throws SQLException{
        Connection conn = DriverManager.getConnection(connectionUrl);
        PreparedStatement stmt = null;
        if(sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql);//PROC
        } else {
            stmt = conn.prepareStatement(sql);//SQL
        }
        for(int i = 0; i<args.length;i++){ 
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    
    public static ResultSet query(String sql, Object...args) { 
        try {
           PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery(); 
        } catch (Exception e) {
            throw new RuntimeException(e);
        }        
    }
    
    public static Object value(String sql,Object...args) {
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }   
        return null;
    }
    
    public static int update(String sql, Object...args){
        try {
            PreparedStatement stmt = jdbcHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } 
}

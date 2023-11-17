/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.dao;

import com.cafe.model.KhachHang;
import com.cafe.utils.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAO { 

    String INSERT_SQL = "INSERT INTO KhachHang (MaKH, TenKH, Email, SDT, GioiTinh) VALUES (?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE KhachHang SET TenKH = ?, Email = ?, SDT = ?, GioiTinh = ? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH = ?";


    public void insert(KhachHang e) {
        jdbcHelper.update(INSERT_SQL, e.getMaKH(),e.getTenKH(),e.getEmail(),e.getSDT(),e.isGioiTinh());
    }

    public void update(KhachHang e) {
        jdbcHelper.update(UPDATE_SQL, e.getTenKH(), e.getEmail(),  e.getSDT(), e.isGioiTinh(), e.getMaKH());
    }

    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        for (KhachHang nv : list) {
            if (!nv.getMaKH().equals(id)) {
                return null;
            }
        }
        return list.get(0);
    }

    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setSDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhachHang> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM KhachHang WHERE TenKH LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public boolean chechTrungMa(String ma) {
        List<KhachHang> list = this.selectAll();
        for (KhachHang nv : list) {
            if (nv.getMaKH().equals(ma)) {
                return false;
            }
        }
        return true;
    }

}

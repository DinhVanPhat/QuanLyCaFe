/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.dao;

import com.cafe.model.Ban;
import com.cafe.model.ThongKeBaoCao;
import com.cafe.utils.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ThongKeBaoCaoDAO extends CafeDAO<ThongKeBaoCao, String>{
    
    String SELECT_SQL = "SELECT A.MaSP, TenSP, LoaiSP, Gia, SUM(SoLuong) AS SoLuongBanRa , SUM(Gia) AS TongDoanhThu, NgayThanhToan\n" +
                            "FROM ChiTietHoaDon A\n" +
                            "INNER JOIN SanPham B ON B.MaSP = A.MaSP\n"+ 
                            "INNER JOIN HoaDon C ON C.MaHD = A.MaHD\n" +
                            "GROUP BY A.MaSP, TenSP, LoaiSP, Gia, NgayThanhToan";
    

    @Override
    public void insert(ThongKeBaoCao entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ThongKeBaoCao entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ThongKeBaoCao selectById(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//
    @Override
    public List<ThongKeBaoCao> selectAll() {
        return this.selectBySql(SELECT_SQL);
    }
//
    @Override
    protected List<ThongKeBaoCao> selectBySql(String sql, Object... args) {
        List<ThongKeBaoCao> list = new ArrayList<ThongKeBaoCao>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                ThongKeBaoCao b = new ThongKeBaoCao();
                b.setMaSP(rs.getString("MaSP"));
                b.setTenSP(rs.getString("TenSP"));
                b.setLoai(rs.getString("LoaiSP"));
                b.setDonGia(rs.getDouble("Gia"));
                b.setSoLuongBan(rs.getInt("SoLuongBanRa"));
                b.setTongDoanhThu(rs.getDouble("TongDoanhThu"));
                b.setNgayThanhToan(rs.getDate("NgayThanhToan"));
                list.add(b);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i = 0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Object[]> getThongKe(Date tuNgay, Date DenNgay) {
        String sql = "{CALL Proc_ThongKe(?,?)}";
        String[] cols= {"MaSP", "TenSP", "LoaiSP", "Gia","SoLuong", "TongDoanhThu", "NgayThanhToan"};
        return getListOfArray(sql, cols, tuNgay,DenNgay);
        
    }
    public List<ThongKeBaoCao> selectByLoaiSP(String keyWord) {
         String sql = "SELECT A.MaSP, TenSP, LoaiSP, Gia, SUM(SoLuong) AS SoLuongBanRa , SUM(Gia) AS TongDoanhThu, NgayThanhToan\n" +
                            "FROM ChiTietHoaDon A\n" +
                            "INNER JOIN SanPham B ON B.MaSP = A.MaSP\n"+ 
                            "INNER JOIN HoaDon C ON C.MaHD = A.MaHD\n" +
                            "Where LoaiSP LiKE ?\n"+
                            "GROUP BY A.MaSP, TenSP, LoaiSP, Gia, NgayThanhToan";
        return this.selectBySql(sql,keyWord);
        
    }
}

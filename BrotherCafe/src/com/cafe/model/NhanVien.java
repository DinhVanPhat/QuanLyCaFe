/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

/**
 *
 * @author NGHIA
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String matKhau;
    private String queQuan;
    private String SDT;
    private String email;
    private boolean gioiTinh;
    private boolean chucVu;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String matKhau, String queQuan, String SDT, String email, boolean gioiTinh, boolean chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.queQuan = queQuan;
        this.SDT = SDT;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }
    
}

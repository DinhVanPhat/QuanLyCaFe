/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ThongKeBaoCao {

    private String maSP;
    private String tenSP;
    private String loai;
    private Double donGia;
    private int soLuongBan;
    private Double tongDoanhThu;
    private Date tuNgay;
    private Date denNgay;
    private Date NgayThanhToan;
    private String theoSanPham;

    public ThongKeBaoCao() {
    }

    public ThongKeBaoCao(String maSP, String tenSP, String loai, Double donGia, int soLuongBan, Double tongDoanhThu, Date tuNgay, Date denNgay, Date NgayThanhToan, String theoSanPham) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loai = loai;
        this.donGia = donGia;
        this.soLuongBan = soLuongBan;
        this.tongDoanhThu = tongDoanhThu;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.NgayThanhToan = NgayThanhToan;
        this.theoSanPham = theoSanPham;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public Double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(Double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getTheoSanPham() {
        return theoSanPham;
    }

    public void setTheoSanPham(String theoSanPham) {
        this.theoSanPham = theoSanPham;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

/**
 *
 * @author ADMIN
 */
public class KhuVuc {
    private String maKV;
    private String tenKV;
    private boolean chonKV;

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }

    public String getTenKV() {
        return tenKV;
    }

    public void setTenKV(String tenKV) {
        this.tenKV = tenKV;
    }

    public boolean isChonKV() {
        return chonKV;
    }

    public void setChonKV(boolean chonKV) {
        this.chonKV = chonKV;
    }

    public KhuVuc() {
    }

    public KhuVuc(String maKV, String tenKV, boolean chonKV) {
        this.maKV = maKV;
        this.tenKV = tenKV;
        this.chonKV = chonKV;
    }
}

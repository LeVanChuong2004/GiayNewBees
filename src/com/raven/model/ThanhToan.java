/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author HoaiThu
 */
public class ThanhToan {
    private int id;
    private String maTT;
    private boolean hinhThucTT;
    private String ghiChu;
    private int idHD;
    private boolean trangThai;

    public ThanhToan() {
    }

    public ThanhToan(int id, String maTT, boolean hinhThucTT, String ghiChu, int idHD, boolean trangThai) {
        this.id = id;
        this.maTT = maTT;
        this.hinhThucTT = hinhThucTT;
        this.ghiChu = ghiChu;
        this.idHD = idHD;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public boolean isHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(boolean hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}

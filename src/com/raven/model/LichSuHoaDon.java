/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import java.util.Date;

/**
 *
 * @author HoaiThu
 */
public class LichSuHoaDon {
    private int id;
    private String maLSHD;
    private String liDoHuy;
    private int nguoiTao;
    private Date ngayTao;
    private boolean trangThai;
    private int idHD;

    public LichSuHoaDon() {
    }

    public LichSuHoaDon(int id, String maLSHD, String liDoHuy, int nguoiTao, Date ngayTao, boolean trangThai, int idHD) {
        this.id = id;
        this.maLSHD = maLSHD;
        this.liDoHuy = liDoHuy;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.idHD = idHD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaLSHD() {
        return maLSHD;
    }

    public void setMaLSHD(String maLSHD) {
        this.maLSHD = maLSHD;
    }

    public String getLiDoHuy() {
        return liDoHuy;
    }

    public void setLiDoHuy(String liDoHuy) {
        this.liDoHuy = liDoHuy;
    }

    public int getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(int nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }
    
}

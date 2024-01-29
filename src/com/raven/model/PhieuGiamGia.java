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
public class PhieuGiamGia {
    private int id;
    private String maPGG;
    private String tenPGG;
    private double giaTri;
    private Date ngayBD;
    private Date ngayKT;
    private int nguoiTao;
    private Date ngayTao;
    private int idHD;
    private boolean trangThai;

    public PhieuGiamGia() {
    }

    public PhieuGiamGia(int id, String maPGG, String tenPGG, double giaTri, Date ngayBD, Date ngayKT, int nguoiTao, Date ngayTao, int idHD, boolean trangThai) {
        this.id = id;
        this.maPGG = maPGG;
        this.tenPGG = tenPGG;
        this.giaTri = giaTri;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.idHD = idHD;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPGG() {
        return maPGG;
    }

    public void setMaPGG(String maPGG) {
        this.maPGG = maPGG;
    }

    public String getTenPGG() {
        return tenPGG;
    }

    public void setTenPGG(String tenPGG) {
        this.tenPGG = tenPGG;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
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

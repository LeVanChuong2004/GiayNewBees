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
public class DeGiay {
    private int id;
    private String maDeG;
    private String tenDeG;
    private int nguoiTao;
    private Date ngayTao;
    private boolean trangThai;

    public DeGiay() {
    }

    public DeGiay(int id, String maDeG, String tenDeG, int nguoiTao, Date ngayTao, boolean trangThai) {
        this.id = id;
        this.maDeG = maDeG;
        this.tenDeG = tenDeG;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaDeG() {
        return maDeG;
    }

    public void setMaDeG(String maDeG) {
        this.maDeG = maDeG;
    }

    public String getTenDeG() {
        return tenDeG;
    }

    public void setTenDeG(String tenDeG) {
        this.tenDeG = tenDeG;
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
    
}

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
public class XuatXu {
    private int id;
    private String maXX;
    private String xuatXu;
    private int nguoiTao;
    private Date ngayTao;
    private boolean trangThai;

    public XuatXu() {
    }

    public XuatXu(int id, String maXX, String xuatXu, int nguoiTao, Date ngayTao, boolean trangThai) {
        this.id = id;
        this.maXX = maXX;
        this.xuatXu = xuatXu;
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

    public String getMaXX() {
        return maXX;
    }

    public void setMaXX(String maXX) {
        this.maXX = maXX;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
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

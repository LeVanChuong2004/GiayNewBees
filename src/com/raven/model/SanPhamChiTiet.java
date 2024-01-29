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
public class SanPhamChiTiet {
    private int id;
    private String maSPCT;
    private int soLuong;
    private double giaBan;
    private String ghiChuSP;
    private String hinhSP;
    private int idSP;
    private int idMS;
    private int idKT;
    private int idTH;
    private int idCL;
    private int idDG;
    private int idDeG;
    private int idXX;
    private int nguoiTao;
    private Date ngayTao;
    private boolean trangThai;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int id, String maSPCT, int soLuong, double giaBan, String ghiChuSP, String hinhSP, int idSP, int idMS, int idKT, int idTH, int idCL, int idDG, int idDeG, int idXX, int nguoiTao, Date ngayTao, boolean trangThai) {
        this.id = id;
        this.maSPCT = maSPCT;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.ghiChuSP = ghiChuSP;
        this.hinhSP = hinhSP;
        this.idSP = idSP;
        this.idMS = idMS;
        this.idKT = idKT;
        this.idTH = idTH;
        this.idCL = idCL;
        this.idDG = idDG;
        this.idDeG = idDeG;
        this.idXX = idXX;
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

    public String getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(String maSPCT) {
        this.maSPCT = maSPCT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChuSP() {
        return ghiChuSP;
    }

    public void setGhiChuSP(String ghiChuSP) {
        this.ghiChuSP = ghiChuSP;
    }

    public String getHinhSP() {
        return hinhSP;
    }

    public void setHinhSP(String hinhSP) {
        this.hinhSP = hinhSP;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public int getIdMS() {
        return idMS;
    }

    public void setIdMS(int idMS) {
        this.idMS = idMS;
    }

    public int getIdKT() {
        return idKT;
    }

    public void setIdKT(int idKT) {
        this.idKT = idKT;
    }

    public int getIdTH() {
        return idTH;
    }

    public void setIdTH(int idTH) {
        this.idTH = idTH;
    }

    public int getIdCL() {
        return idCL;
    }

    public void setIdCL(int idCL) {
        this.idCL = idCL;
    }

    public int getIdDG() {
        return idDG;
    }

    public void setIdDG(int idDG) {
        this.idDG = idDG;
    }

    public int getIdDeG() {
        return idDeG;
    }

    public void setIdDeG(int idDeG) {
        this.idDeG = idDeG;
    }

    public int getIdXX() {
        return idXX;
    }

    public void setIdXX(int idXX) {
        this.idXX = idXX;
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

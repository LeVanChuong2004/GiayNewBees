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
public class HoaDon {
    private int id;
    private String maHD;
    private String hoTenKH;
    private String sdt;
    private String diaChi;
    private String ghiChu;
    private Date ngayDat;
    private Date ngayGiao;
    private Date ngayNhan;
    private double tongTien;
    private int nguoiTao;
    private Date ngayTao;
    private int idNV;
    private int idKH;
    private int trangThai;

    public HoaDon() {
    }

    public HoaDon(int id, String maHD, String hoTenKH, String sdt, String diaChi, String ghiChu, Date ngayDat, Date ngayGiao, Date ngayNhan, double tongTien, int nguoiTao, Date ngayTao, int idNV, int idKH, int trangThai) {
        this.id = id;
        this.maHD = maHD;
        this.hoTenKH = hoTenKH;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
        this.ngayDat = ngayDat;
        this.ngayGiao = ngayGiao;
        this.ngayNhan = ngayNhan;
        this.tongTien = tongTien;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.idNV = idNV;
        this.idKH = idKH;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
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

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}

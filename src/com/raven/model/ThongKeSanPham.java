package com.raven.model;

import java.text.DecimalFormat;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.ModelAction;
import com.raven.swing.table.ModelProfile;

public class ThongKeSanPham {
    static int dem = 0;
    String masp;
    int stt;
    String tensp;
    int soluong;
    String giaban;
    int Size;
    int soluongdaban;

    public ThongKeSanPham() {
        dem += 1;
    }

    public ThongKeSanPham(String masp, String tensp, int soluong, String giaban, int Size, int soluongdaban) {
        dem += 1;
        this.masp = masp;
        this.stt = dem;
        this.tensp = tensp;
        this.soluong = soluong;
        this.giaban = giaban;
        this.Size = Size;
        this.soluongdaban = soluongdaban;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        ThongKeSanPham.dem = dem;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getSoluongdaban() {
        return soluongdaban;
    }

    public void setSoluongdaban(int soluongdaban) {
        this.soluongdaban = soluongdaban;
    }

    public Object[] toRowTable(EventAction event) {
        return new Object[] { stt, masp, tensp, soluong, giaban,
                Size, soluongdaban };
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

}

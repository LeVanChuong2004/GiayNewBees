package com.raven.form;

import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelStudent;
import com.raven.model.ThongKeSanPham;
import com.raven.service.ConnectSqlService;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FormThongKe extends javax.swing.JPanel {
    ConnectSqlService conn;

    public FormThongKe() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {

        initCardData();
        initTableData();
    }

    private void initTableData() {

        EventAction eventAction = new EventAction() {
            @Override
            public void delete(ModelStudent student) {
                if (showMessage("Delete Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(ModelStudent student) {
                if (showMessage("Update Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }
        };
        try {
            ConnectSqlService conn = new ConnectSqlService();
            ResultSet rs = conn.ConnectSql().executeQuery(
                    "SELECT sanpham.MaSP, sanpham.TenSP, sanphamchitiet.SoLuong, sanphamchitiet.GiaBan, kichthuoc.Size,  count(sanphamchitiet.id) as Soluongdaban FROM sanphamchitiet join sanpham on sanphamchitiet.ID_SanPham = sanpham.ID join kichthuoc on sanphamchitiet.ID_KichThuoc = kichthuoc.ID join hoadonchitiet on sanphamchitiet.ID = hoadonchitiet.ID_SanPhamChiTiet group by sanpham.MaSP," +
"    sanpham.TenSP," +
"    sanphamchitiet.SoLuong," +
"    sanphamchitiet.GiaBan," +
"    kichthuoc.Size," +
"    sanphamchitiet.ID;  ");
            while (rs.next()) {
                table1.addRow(
                        new ThongKeSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                                rs.getInt(5), rs.getInt(6))
                                .toRowTable(eventAction));
                System.out.println(rs.getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void initCardData() {
        try {
            Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ADD_SHOPPING_CART, 60,
                    new Color(255, 255, 255, 100),
                    new Color(255, 255, 255, 15));
            Date date = new Date();
            SimpleDateFormat getDay = new SimpleDateFormat("dd");
            SimpleDateFormat getMonth = new SimpleDateFormat("MM");
            SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
            String strday = getDay.format(date);
            String strmonth = getMonth.format(date);
            String stryear = getYear.format(date);
            conn = new ConnectSqlService();
            ResultSet rs = conn.ConnectSql().executeQuery(
                    "SELECT SUM(TongTien), COUNT(ID) FROM hoadon WHERE DAY(NgayTao) = '" + strday
                            + "' AND YEAR(NgayTao) = '" + stryear + "' AND MONTH(NgayTao) = '" + strmonth + "';");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " 111111");
                card1.setData(new ModelCard("Tổng doanh thu ngày", rs.getInt(1), "Đã bán: " + rs.getInt(2), icon1));
            }
            Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.DATE_RANGE, 60,
                    new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
            rs = conn.ConnectSql().executeQuery(
                    "SELECT SUM(TongTien) , COUNT(ID) FROM hoadon WHERE  YEAR(NgayTao) = '" + stryear
                            + "' AND MONTH(NgayTao) = '" + strmonth + "';");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " 111111");
                card2.setData(new ModelCard("Tổng doanh thu tháng", rs.getInt(1), "Đã bán: " + rs.getInt(2), icon2));
            }
            Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.DATE_RANGE, 60,
                    new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
            rs = conn.ConnectSql().executeQuery(
                    "SELECT SUM(TongTien), COUNT(ID) FROM hoadon WHERE  YEAR(NgayTao) = '" + stryear + "';");
            while (rs.next()) {
                card3.setData(new ModelCard("Tổng doanh thu năm", rs.getInt(1), "Đã bán: " + rs.getInt(2), icon3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new com.raven.component.Card();
        jLabel1 = new javax.swing.JLabel();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.table.Table();

        card1.setColorGradient(new java.awt.Color(211, 28, 215));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Home");

        card2.setBackground(new java.awt.Color(10, 30, 214));
        card2.setColorGradient(new java.awt.Color(72, 111, 252));

        card3.setBackground(new java.awt.Color(194, 85, 1));
        card3.setColorGradient(new java.awt.Color(255, 212, 99));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "STT", "Mã SP", "Tên SP", "Số lượng", "Giá", "Size", "Số lượng bán ra"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.table.Table table1;

    // End of variables declaration//GEN-END:variables
}

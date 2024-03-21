/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.form;

import com.cafe.dao.BanDAO;
import com.cafe.dao.ChiTietHoaDonDAO;
import com.cafe.dao.HoaDonDAO;
import com.cafe.dao.KhachHangDAO;
import com.cafe.dao.NhanVienDAO;
import com.cafe.dao.SanPhamDAO;
import com.cafe.model.Ban;
import com.cafe.model.ChiTietHoaDon;
import com.cafe.model.HoaDon;
import com.cafe.model.KhachHang;
import com.cafe.model.NhanVien;
import com.cafe.model.SanPham;
import com.cafe.utils.XDate;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author NGHIA
 */
public class xuatHoaDon extends JFrame {

    public xuatHoaDon() {
        initComponents();
        setLocationRelativeTo(this);
    }
    HoaDonDAO hddao = new HoaDonDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
    SanPhamDAO spdao = new SanPhamDAO();
    BanDAO bdao = new BanDAO();

    public void XuatHoaDon(int ma) {
        DecimalFormat formatTienVND = new DecimalFormat("###,###.###");
        HoaDon hd = hddao.selectById(ma);
        NhanVien nv = nvdao.selectById(hd.getMaNV());
        Ban b = bdao.selectById(hd.getMaBan());
        String khachHang = null;
        if (hd.getMaKH() != null) {
            KhachHang kh = khdao.selectById(hd.getMaKH());
            khachHang = kh.getTenKH();
        } else {
            khachHang = "Khách lẻ";
        }
        
        String html = "<html>";
        html += "<h2 style='text-align: center;font-family:Times New Roman; margin-bottom: 5px;'>BROTHER'S COFFEE SHOP</h2>";
        html += "<p style='text-align: center;font-family:Times New Roman;margin: 0px 0px 0px 0px;'>Đ. Số 22, Thường Thạnh, Cái Răng, Cần Thơ<br /></p>";
        html += "<p style='text-align: center; font-family:Times New Roman;margin: 5px 0px 0px 0px;' >SĐT: 0791234567<br /></p>";
        html += "<h3 style='text-align: center; font-family:Times New Roman;margin: 20px 0px 0px 0px;'>HÓA ĐƠN THANH TOÁN</h3>";
        html += "<h3 style='text-align: center; font-family:Times New Roman;margin: 5px 0px 0px 0px;'>"+b.getTenBan()+"</h3>";
        html += "<table style='margin-left: auto; margin-right: auto; margin-top: 15px; text-align: center;font-family:Times New Roman;'>";
        html += "<tr>";
        html += "<td style='font-weight: bold;'>Số:</td>";
        html += "<td>" + hd.getMaHD() + "</td>";
        html += "<td style='padding-left: 30px; font-weight: bold; '>Khách hàng:</td>";
        html += "<td>" + khachHang + "</td>";
        html += "</tr>";
        html += "<tr>";
        html += "<td style='font-weight: bold;'>Ngày:</td>";
        html += "<td>" + XDate.toString(hd.getNgayThanhToan(), "yyyy-MM-dd") + "</td>";
        html += "<td style='padding-left: 30px; font-weight: bold;'>Nhân viên:</td>";
        html += "<td>" + nv.getTenNV() + "</td>";
        html += "</tr>";
        html += "<tr>";
        html += "<td style='font-weight: bold;'>Giờ vào:</td>";
        html += "<td>" + hd.getThoiGianTaoHD().substring(0, 8)+ "</td>";
        html += "<td style='padding-left: 30px; font-weight: bold;'>Giờ ra:</td>";
        html += "<td>" + hd.getThoiGianThanhToan().substring(0, 8)+ "</td>";
        html += "</tr>";
        html += "</table>";
        html += "<div style='text-align: center;font-family:Times New Roman;'>-----------------------------------------------------------------------------</div>";
        html += "<table style='margin-left: auto; margin-right: auto; width: 300px; height: 27px;font-family:Times New Roman;'>";
        html += "<tr  style='height: 27px;'>";
        html += "<th style='width: 150px; '>TÊN HÀNG</th>";
        html += "<th style='width: 30px;'>SL</th>";
        html += "<th style='width: 76px;'>Đ.GIÁ</th>";
        html += "<th style='width: 76px;'>T.TIỀN</th>";
        html += "<th style='width: 68px; text-align: left;'>G.CHÚ</th>";
        html += "</tr>";
        List<ChiTietHoaDon> cthd = cthddao.selectByMaHD(hd.getMaHD());
        for (ChiTietHoaDon cthdd : cthd) {
            SanPham sp = spdao.selectById(cthdd.getMaSP());
            String ghiChu = null;
            if(cthdd.getGhiChu()!= null){ 
                ghiChu = cthdd.getGhiChu();
            } else { 
                ghiChu = "";
            }
            html += "<tr>";
            html += "<td colspan='5' style='text-align: center; height: 5px;'>- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</td>";
            html += "</tr> ";
            html += "<tr style='text-align: center;'>";
            html += "<td>" +sp.getTenSP()+ "</td>";
            html += "<td>" +cthdd.getSoLuong()+ "</td>";
            html += "<td>" +formatTienVND.format(sp.getGia())+"</td>";
            html += "<td>" +formatTienVND.format(cthdd.getTongTienSP())+"</td>";
            html += "<td>" +ghiChu+ "</td>";
            html += "</tr>";
        }

        html += "<tr>";
        html += "<td colspan='5' style='text-align: center; height: 5px;'>-----------------------------------------------------------------------------</td>";
        html += "</tr>";
        html += "<tr>";
        html += "<th colspan='3' style='text-align: left; padding-left: 28px;'>Tổng tiền</th>";
        html += "<td colspan='2' style='padding-left: 15px;'>" +formatTienVND.format(hd.getTongTien()) + "</td>";
        html += "</tr>";
        html += "</table>";
        html += "<div style='text-align: center;font-weight: normal;font-family:Times New Roman;'>-----------------------------------------------------------------------------</div>";
        html += "<h4 style='text-align: center; margin: 10px 0px 0px 0px; font-family:Times New Roman;'>XIN CẢM ƠN - HẸN GẶP LẠI!<br></h4> ";
        html += "</html>";
        lblhoadon.setText(html);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhoadon = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnInHD = new javax.swing.JButton();
        txtForm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhoadon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblhoadon.setText("jLabel1");
        lblhoadon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblhoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 400, 470));

        btnHuy.setText("HUỶ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 149, -1));

        btnInHD.setText("IN HOÁ ĐƠN");
        btnInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHDActionPerformed(evt);
            }
        });
        getContentPane().add(btnInHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 149, -1));

        txtForm.setBackground(new java.awt.Color(255, 255, 255));
        txtForm.setOpaque(true);
        getContentPane().add(txtForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btnInHDActionPerformed(java.awt.event.ActionEvent evt) {
        FilePrintClicked(lblhoadon);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                xuatHoaDon xuatHD = new xuatHoaDon();
                xuatHD.setVisible(true);
            }
        });
    }

    public void FilePrintClicked(JLabel label) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics g, PageFormat format, int pagenum) throws PrinterException {
                if (pagenum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(format.getImageableX(), format.getImageableY());
                float pageWidth = (float) format.getImageableWidth();
                float pageHeight = (float) format.getImageableHeight();
                float imageHeight = (float) label.getHeight();
                float imageWidth = (float) label.getWidth();
                float scaleFactor = Math.min((float) pageWidth / (float) imageWidth, (float) pageHeight / (float) imageHeight);
                int scaledWidth = (int) (((float) imageWidth) * scaleFactor);
                int scaledHeight = (int) (((float) imageHeight) * scaleFactor);
                // Tạo BufferedImage với chế độ màu TYPE_INT_ARGB
                BufferedImage image = new BufferedImage(label.getWidth(), label.getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D gg = image.createGraphics();
                // Vẽ JLabel lên BufferedImage
                label.paint(gg);
                // Vẽ BufferedImage lên trang in
                g2d.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean returningResult = job.printDialog();
        if (returningResult) {
            try {
                job.print();
                dispose();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(this, "Không Thể In!");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnInHD;
    private javax.swing.JLabel lblhoadon;
    private javax.swing.JLabel txtForm;
    // End of variables declaration//GEN-END:variables
}

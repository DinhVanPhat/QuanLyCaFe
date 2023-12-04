/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cafe.form;

import com.cafe.dao.KhachHangDAO;
import com.cafe.model.Ban;
import com.cafe.model.KhachHang;
import com.cafe.utils.Auth;
import com.cafe.utils.MsgBox;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class KhachHangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhachHangJPanel
     */
    public KhachHangJPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1536, 864));

        jPanel4.setBackground(new java.awt.Color(230, 213, 193));
        jPanel4.setPreferredSize(new java.awt.Dimension(1536, 864));

        jLabel33.setBackground(new java.awt.Color(97, 67, 67));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(97, 67, 67));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("QUẢN LÝ KHÁCH HÀNG");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnTimKiem.setBackground(new java.awt.Color(191, 158, 117));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/icon/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(97, 67, 67));
        jLabel35.setText("DANH SÁCH KHÁCH HÀNG");

        jPanel2.setBackground(new java.awt.Color(230, 213, 193));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(97, 67, 67));
        jLabel32.setText("Mã khách hàng");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaKH.setPreferredSize(new java.awt.Dimension(300, 22));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(97, 67, 67));
        jLabel31.setText("Họ và tên *");

        txtHoVaTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(97, 67, 67));
        jLabel40.setText("Giới tính *");

        btgGioiTinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rdoNam.setForeground(new java.awt.Color(97, 67, 67));
        rdoNam.setText("Nam");

        btgGioiTinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rdoNu.setForeground(new java.awt.Color(97, 67, 67));
        rdoNu.setText("Nữ");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(97, 67, 67));
        jLabel34.setText("Số điện thoại");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(97, 67, 67));
        jLabel37.setText("Email");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(97, 67, 67));
        jLabel38.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoNam)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        btnXoa.setBackground(new java.awt.Color(191, 158, 117));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/icon/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(191, 158, 117));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/icon/update.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(191, 158, 117));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/icon/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(191, 158, 117));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/icon/lammoi.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Email", "Giới Tính", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 694, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (row != -1) {
            row = -1;
            updateStatus();
            btnThem.setText("Lưu");
            txtMaKH.setEditable(false);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String src = evt.getActionCommand();
        if (src.equalsIgnoreCase("Thêm")) {
            insert();
        } else if (src.equalsIgnoreCase("Lưu")) {
            update();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        timKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    KhachHangDAO khdao = new KhachHangDAO();
    int row = -1;

    private void init() {
        this.fillTable();
        this.row = -1;
        this.updateStatus();
        focusInput();
        setBorderInput();
    }

    void insert() {
        if (checkValidateForm()) {
            if (!khdao.chechTrungMa(txtMaKH.getText())) {
                MsgBox.alert(this, "Mã khách hàng đã tồn tại", JOptionPane.WARNING_MESSAGE);
            } else {
                KhachHang nv = getForm();
                try {
                    khdao.insert(nv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Thêm mới thành công!", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //throw new RuntimeException(e);
                    MsgBox.alert(this, "Thêm mới thất bại", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }

    void update() {
        if (checkValidateForm()) {
            KhachHang kh = getForm();
            try {
                khdao.update(kh);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công!", JOptionPane.INFORMATION_MESSAGE);
                this.clearForm();
            } catch (Exception e) {
                //throw new RuntimeException(e);
                MsgBox.alert(this, "Cập nhật thất bại", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa khách hàng!", JOptionPane.WARNING_MESSAGE);
        } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa khách hàng này?")) {
            String maKH = txtMaKH.getText();
            try {
                khdao.delete(maKH);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                //throw new RuntimeException(e);
                MsgBox.alert(this, "Xóa thất bại", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    void clearForm() {
        KhachHang nv = new KhachHang();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
        tblNhanVien.clearSelection();
        btgGioiTinh.clearSelection();

    }

    void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        KhachHang nv = khdao.selectById(manv);
        this.setForm(nv);
        this.updateStatus();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            String keyWord = txtTimKiem.getText();
            List<KhachHang> list = khdao.selectByKeyWord(keyWord);
            for (KhachHang nv : list) {
                Object[] row = {nv.getMaKH(), nv.getTenKH(), nv.isGioiTinh() ? "Nữ" : "Nam", nv.getSDT(), nv.getEmail(), nv.getDiaChi()};
                model.addRow(row);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
            // MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private String checkTrungMaKH(String id) {
        List<KhachHang> list = khdao.selectAll();
        Set<String> set = new HashSet<>();

        for (KhachHang kh : list) {
            set.add(kh.getMaKH());
        }

        int countTrungMa = 1;

        String ma = id + "0" + countTrungMa;
        while (set.contains(ma)) {
            countTrungMa++;
            if (countTrungMa < 10) {
                ma = id + "0" + countTrungMa;
            } else {
                ma = id + countTrungMa;
            }
        }
        return ma;
    }

    void setForm(KhachHang nv) {
        txtMaKH.setText(nv.getMaKH());
        txtHoVaTen.setText(nv.getTenKH());
        rdoNam.setSelected(!nv.isGioiTinh());
        rdoNu.setSelected(nv.isGioiTinh());
        txtEmail.setText(nv.getEmail());
        txtSDT.setText(nv.getSDT());
        txtDiaChi.setText(nv.getDiaChi());
    }

    KhachHang getForm() {
        KhachHang nv = new KhachHang();
        nv.setMaKH(checkTrungMaKH("KH"));
        nv.setTenKH(txtHoVaTen.getText());
        nv.setSDT(txtSDT.getText());
        nv.setGioiTinh(!rdoNam.isSelected());
        nv.setEmail(txtEmail.getText());
        nv.setDiaChi(txtDiaChi.getText());

        return nv;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        //Trạng thái form
        txtMaKH.setEditable(false);
        txtHoVaTen.setEditable(!edit);
        txtEmail.setEditable(!edit);
        txtSDT.setEditable(!edit);
        rdoNam.setEnabled(!edit);
        rdoNu.setEnabled(!edit);

        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnThem.setText("Thêm");

    }

    boolean checkValidateForm() {
        if (txtHoVaTen.getText().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập họ và tên!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            MsgBox.alert(this, "Vui lòng chọn giới tính!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!txtSDT.getText().isEmpty()) {
            try {
                int sdt = Integer.parseInt(txtSDT.getText());
            } catch (Exception e) {
                MsgBox.alert(this, "Số điện thoại phải là số!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            String patternSDT = "^(0[3-9])\\d{8}$";
            if (!txtSDT.getText().matches(patternSDT)) {
                MsgBox.alert(this, "Số điện thoại phải là 10 số!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (!txtEmail.getText().isEmpty()) {
            String patternEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,}){1,2}$";
            if (!txtEmail.getText().matches(patternEmail)) {
                MsgBox.alert(this, "Email! không hợp lệ", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }

        return true;
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }

    private void focusInput() {
        Border borderNhanVao = BorderFactory.createLineBorder(new Color(227, 188, 140), 10, true);
        Border borderKhongNhan = BorderFactory.createLineBorder(new Color(255, 255, 255), 10, true);
        txtHoVaTen.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtHoVaTen.setBackground(new Color(227, 188, 140));
                txtHoVaTen.setBorder(borderNhanVao);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtHoVaTen.setBackground(new Color(255, 255, 255));
                txtHoVaTen.setBorder(borderKhongNhan);
            }
        });
        txtEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtEmail.setBackground(new Color(227, 188, 140));
                txtEmail.setBorder(borderNhanVao);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtEmail.setBackground(new Color(255, 255, 255));
                txtEmail.setBorder(borderKhongNhan);
            }
        });
        txtDiaChi.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtDiaChi.setBackground(new Color(227, 188, 140));
                txtDiaChi.setBorder(borderNhanVao);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtDiaChi.setBackground(new Color(255, 255, 255));
                txtDiaChi.setBorder(borderKhongNhan);
            }
        });
        txtSDT.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtSDT.setBackground(new Color(227, 188, 140));
                txtSDT.setBorder(borderNhanVao);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtSDT.setBackground(new Color(255, 255, 255));
                txtSDT.setBorder(borderKhongNhan);
            }
        });
        txtTimKiem.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtTimKiem.setBackground(new Color(227, 188, 140));
                txtTimKiem.setBorder(borderNhanVao);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtTimKiem.setBackground(new Color(255, 255, 255));
                txtTimKiem.setBorder(borderKhongNhan);
            }
        });
    }

    private void setBorderInput() {
        Border border = BorderFactory.createLineBorder(new Color(255, 255, 255), 10, true);
        txtHoVaTen.setBorder(border);
        txtMaKH.setBorder(border);
        txtEmail.setBorder(border);
        txtDiaChi.setBorder(border);
        txtSDT.setBorder(border);
        txtTimKiem.setBorder(border);

    }
}

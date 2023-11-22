/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.controller;

import com.cafe.form.TrangChuJPanel;
import com.cafe.utils.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NGHIA
 */
public class MenuKhuVucListener implements ActionListener {
    TrangChuJPanel trangChu;
    List<String> list = trangChu.listTenKV;
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
       
        
        MsgBox.alert(null, src, JOptionPane.WARNING_MESSAGE);
        
    }

}

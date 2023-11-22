/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.controller;

import com.cafe.form.TrangChuJPanel;
import com.cafe.utils.MsgBox;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author NGHIA
 */
public class MenuSanPhamMouse implements MouseListener {
    TrangChuJPanel trangChu;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        String src = new TrangChuJPanel().lblMenuSP.getToolTipText();
       // MsgBox.alert(null, String.valueOf(src), JOptionPane.WARNING_MESSAGE);
            
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

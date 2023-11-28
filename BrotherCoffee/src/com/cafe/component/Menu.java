/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cafe.component;

import com.cafe.event.EventMenuSelected;
import com.cafe.model.ModelMenu;
import com.cafe.swing.MenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author NGHIA
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public void setEvent(EventMenuSelected event) {
        this.event = event;
    }

    
    private MigLayout layout;
    private JPanel panelMenu;
    private JButton cmdMenu;
    private Header header;
    private EventMenuSelected event;
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("wrap, fillx, insets 0","[fill]","3[]0[]push[60]0"));
        panelMenu = new JPanel();
        header = new Header();
        createButtonMenu();
        panelMenu.setOpaque(false);
        layout = new MigLayout("fillx,wrap","0[fill]0","0[]3[]0");
        panelMenu.setLayout(layout);
        add(cmdMenu, "pos 1al 0al 100% 50");
        add(header);
        add(panelMenu);
        
    }
    
    public void addMenu(ModelMenu menu){
        MenuItem item = new MenuItem(menu.getIcon(),menu.getMenuName(),panelMenu.getComponentCount());
        item.addEvent(new EventMenuSelected(){ 
            @Override
            public void selected(int index) {
                clearMenu(index);
            }
            
        });
        item.addEvent(event);
        panelMenu.add(item);
        
    }
    private void createButtonMenu(){
        cmdMenu = new JButton();
        cmdMenu.setContentAreaFilled(false);
        cmdMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdMenu.setIcon(new ImageIcon(getClass().getResource("/com/cafe/icon/menu.png")));
        cmdMenu.setBorder(new EmptyBorder(15, 12, 5, 12));
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gra = new GradientPaint(0, 0, Color.decode("#BF9E75"),0,getHeight(), Color.decode("#BF9E75"));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }
    
    private void clearMenu(int exceptIndex){
        for(Component com: panelMenu.getComponents()){
            MenuItem item = (MenuItem) com;
            if(item.getIndex() != exceptIndex){
                item.setSelected(false);
            }
        }
    }
    
    public void addEventMenu(ActionListener event){
        cmdMenu.addActionListener(event);
    }         
    public void setAlpha(float alpha){
        header.setAlpha(alpha);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

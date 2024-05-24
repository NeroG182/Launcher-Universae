package com.universae.launcher;

import static com.universae.launcher.Launcher.content;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;


public class Home extends javax.swing.JPanel implements MouseListener {

    static JButton[] botones;
    
    
    public Home() {
        initComponents();
        
        botones = new JButton[]{jButton1, jButton2, jButton3, jButton4, jButton5, jButton6};
        for (int i = 0; i < botones.length ; i++) {
            
            botones[i].addMouseListener(this);
        }
     }
    
    @Override
    public void mouseEntered(MouseEvent evt) {
        JButton boton = (JButton) evt.getSource(); 
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Utilidades.aumentarTamañoEvt(boton, 1);
    }
    
    @Override
    public void mouseExited(MouseEvent evt) {
        JButton boton = (JButton) evt.getSource();
        boton.setCursor(Cursor.getDefaultCursor());
        Utilidades.aumentarTamañoEvt(boton,0);
    }
    
    @Override
    public void mouseClicked(MouseEvent evt) {
        JButton boton = (JButton) evt.getSource();
        Game game = new Game();
        Utilidades.mostrarGame(boton);
        Utilidades.mostrarPanel(game, content);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(10, 38, 72));
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(1540, 870));
        setMinimumSize(new java.awt.Dimension(1540, 870));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1540, 870));

        bg.setBackground(new java.awt.Color(10, 38, 72));
        bg.setMaximumSize(new java.awt.Dimension(1550, 880));
        bg.setMinimumSize(new java.awt.Dimension(1550, 880));
        bg.setPreferredSize(new java.awt.Dimension(1550, 880));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(10, 38, 72));
        menu.setMaximumSize(new java.awt.Dimension(1210, 605));
        menu.setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton1.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton1);

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton2.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton2.setName("jButton2"); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton2);

        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton3.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton3.setName("jButton3"); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton3);

        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton4.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton4.setName("jButton4"); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton4);

        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton5.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton5.setName("jButton5"); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton5);

        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setMaximumSize(new java.awt.Dimension(400, 300));
        jButton6.setMinimumSize(new java.awt.Dimension(400, 300));
        jButton6.setName("jButton6"); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(400, 300));
        menu.add(jButton6);

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, 1470, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}

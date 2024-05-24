
package com.universae.launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author Frant
 */
public class Launcher extends javax.swing.JFrame implements MouseListener {

    JLabel[] escudos;
    ArrayList<String> escudosRoots = new ArrayList();
   
    public Launcher() {
        
        initComponents();
        
        
        
        Utilidades.setImagenLabel(Fondo, "src/com/universae/images/InterfazBase/FondoBase.png");
        
        
        escudos = new JLabel[]{icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10,icon11,icon12,icon13,icon14};
        escudosRoots = Utilidades.crearListaArchivos("src/com/universae/images/InterfazBase/Escudos/", "LauncherButton", ".png", escudos.length);
        for (int i = 0; i < escudos.length ; i++) {
            Utilidades.setImagenLabel(escudos[i], escudosRoots.get(i), new Dimension(85, 85));
            escudos[i].addMouseListener(this);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent evt) {
        JLabel iconLabel = (JLabel) evt.getSource();
        iconLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Utilidades.aumentarTamañoEvt(iconLabel, escudos, escudosRoots, 1);
    }
    
    @Override
    public void mouseExited(MouseEvent evt) {
        JLabel iconLabel = (JLabel) evt.getSource(); 
        iconLabel.setCursor(Cursor.getDefaultCursor());
        Utilidades.aumentarTamañoEvt(iconLabel, escudos, escudosRoots, 0);
        iconLabel.setCursor(Cursor.getDefaultCursor());
    }
    
    @Override
    public void mouseClicked(MouseEvent evt) {
        JLabel iconLabel = (JLabel) evt.getSource();
        Home home = new Home();
        Utilidades.mostrarHome(iconLabel);
        Utilidades.mostrarPanel(home, content);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        icon6 = new javax.swing.JLabel();
        icon7 = new javax.swing.JLabel();
        icon8 = new javax.swing.JLabel();
        icon9 = new javax.swing.JLabel();
        icon10 = new javax.swing.JLabel();
        icon11 = new javax.swing.JLabel();
        icon12 = new javax.swing.JLabel();
        icon13 = new javax.swing.JLabel();
        icon14 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 38, 72));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setForeground(java.awt.Color.gray);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        bg.setMaximumSize(new java.awt.Dimension(1920, 1080));
        bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setToolTipText("");
        navbar.setOpaque(false);
        navbar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 0));

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setAlignmentX(0.5F);
        icon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon1.setName("Grado 1"); // NOI18N
        icon1.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon1);

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setAlignmentX(0.5F);
        icon2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon2.setName("Grado 2"); // NOI18N
        icon2.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon2);

        icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon3.setAlignmentX(0.5F);
        icon3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon3.setName("Grado 3"); // NOI18N
        icon3.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon3);

        icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4.setAlignmentX(0.5F);
        icon4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon4.setName("Grado 4"); // NOI18N
        icon4.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon4);

        icon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon5.setAlignmentX(0.5F);
        icon5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon5.setName("Grado 5"); // NOI18N
        icon5.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon5);

        icon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon6.setAlignmentX(0.5F);
        icon6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon6.setName("Grado 6"); // NOI18N
        icon6.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon6);

        icon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon7.setAlignmentX(0.5F);
        icon7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon7.setName("Grado 7"); // NOI18N
        icon7.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon7);

        icon8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon8.setAlignmentX(0.5F);
        icon8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon8.setName("Grado 8"); // NOI18N
        icon8.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon8);

        icon9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon9.setAlignmentX(0.5F);
        icon9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon9.setName("Grado 9"); // NOI18N
        icon9.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon9);

        icon10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon10.setAlignmentX(0.5F);
        icon10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon10.setName("Grado 10"); // NOI18N
        icon10.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon10);

        icon11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon11.setAlignmentX(0.5F);
        icon11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon11.setName("Grado 11"); // NOI18N
        icon11.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon11);

        icon12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon12.setAlignmentX(0.5F);
        icon12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon12.setName("Grado 12"); // NOI18N
        icon12.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon12);

        icon13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon13.setAlignmentX(0.5F);
        icon13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon13.setName("Grado 13"); // NOI18N
        icon13.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon13);

        icon14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon14.setAlignmentX(0.5F);
        icon14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon14.setName("Grado 14"); // NOI18N
        icon14.setPreferredSize(new java.awt.Dimension(110, 130));
        navbar.add(icon14);

        bg.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 1560, 130));

        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        content.setMaximumSize(new java.awt.Dimension(1550, 880));
        content.setMinimumSize(new java.awt.Dimension(1550, 880));
        content.setOpaque(false);
        content.setPreferredSize(new java.awt.Dimension(1550, 880));
        content.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/InterfazBase/HeaderWebUniversae.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        content.add(jLabel1, java.awt.BorderLayout.CENTER);

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/InterfazBase/FondoBase.png"))); // NOI18N
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 2955, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel bg;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon10;
    private javax.swing.JLabel icon11;
    private javax.swing.JLabel icon12;
    private javax.swing.JLabel icon13;
    private javax.swing.JLabel icon14;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel icon9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
    
    

    @Override
    public void mousePressed(MouseEvent e) {
        }

    @Override
    public void mouseReleased(MouseEvent e) {
        }

 
}


package com.universae.launcher;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Frant
 */
public class Game extends javax.swing.JPanel {
    
    int pag = 0;
    
    JLabel[] indicadores;
    ArrayList<String> indicadoresRoots = new ArrayList();
    CardLayout cardLayout;
    
    public Game() {
        initComponents();
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/tipografia/Raleway-Black.ttf"));
            
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Titulo.setFont(customFont.deriveFont(26f)); 
        } catch (IOException | FontFormatException e) {
        }
        
        cardLayout = (CardLayout) carrusel.getLayout();
        indicadores = new JLabel[]{ind1,ind2,ind3,ind4,ind5};
        indicadoresRoots = Utilidades.crearListaArchivos("src/com/universae/images/game/", "PuntoCarruselEmpty", ".png", indicadores.length);
        for (int i = 0; i < indicadores.length ; i++) {
            Utilidades.setImagenLabel(indicadores[i], indicadoresRoots.get(i), new Dimension(15,15));
            
        }
        Utilidades.setImagenLabel(Fondo1, "src/com/universae/images/game/Cuadrado fondo enfocado.png", new Dimension(780,463));
        Utilidades.setImagenLabel(Fondo2, "src/com/universae/images/game/Cuadrado fondo enfocado.png", new Dimension(780,463));
        
        Utilidades.setImagenLabel(jButton1, "src/com/universae/images/game/Comenzar.png", new Dimension(253,44));
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        derecha = new javax.swing.JLabel();
        izquierda = new javax.swing.JLabel();
        carrusel = new javax.swing.JPanel();
        PanelFoto1 = new javax.swing.JPanel();
        Foto1 = new javax.swing.JLabel();
        PanelFoto2 = new javax.swing.JPanel();
        Foto2 = new javax.swing.JLabel();
        PanelFoto3 = new javax.swing.JPanel();
        Foto3 = new javax.swing.JLabel();
        PanelFoto4 = new javax.swing.JPanel();
        Foto4 = new javax.swing.JLabel();
        PanelFoto5 = new javax.swing.JPanel();
        Foto5 = new javax.swing.JLabel();
        indicadorFoto = new javax.swing.JPanel();
        ind1 = new javax.swing.JLabel();
        ind2 = new javax.swing.JLabel();
        ind3 = new javax.swing.JLabel();
        ind4 = new javax.swing.JLabel();
        ind5 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));
        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setPreferredSize(new java.awt.Dimension(1550, 880));

        bg.setMaximumSize(new java.awt.Dimension(1550, 880));
        bg.setMinimumSize(new java.awt.Dimension(1550, 880));
        bg.setOpaque(false);
        bg.setPreferredSize(new java.awt.Dimension(1550, 880));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 38, 72));
        jPanel1.setMaximumSize(new java.awt.Dimension(1091, 552));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        derecha.setBackground(new java.awt.Color(10, 38, 72));
        derecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/Flecha derecha.png"))); // NOI18N
        derecha.setAlignmentX(0.5F);
        derecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                derechaMouseClicked(evt);
            }
        });
        jPanel1.add(derecha, java.awt.BorderLayout.EAST);
        derecha.getAccessibleContext().setAccessibleParent(derecha);

        izquierda.setBackground(new java.awt.Color(10, 38, 72));
        izquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/Flecha izquierda.png"))); // NOI18N
        izquierda.setAlignmentX(0.5F);
        izquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izquierdaMouseClicked(evt);
            }
        });
        jPanel1.add(izquierda, java.awt.BorderLayout.WEST);
        izquierda.getAccessibleContext().setAccessibleName("");
        izquierda.getAccessibleContext().setAccessibleParent(izquierda);

        carrusel.setBackground(new java.awt.Color(10, 38, 72));
        carrusel.setMaximumSize(new java.awt.Dimension(894, 527));
        carrusel.setMinimumSize(new java.awt.Dimension(894, 527));
        carrusel.setOpaque(false);
        carrusel.setPreferredSize(new java.awt.Dimension(894, 527));
        carrusel.setLayout(new java.awt.CardLayout());

        PanelFoto1.setMaximumSize(new java.awt.Dimension(891, 525));
        PanelFoto1.setMinimumSize(new java.awt.Dimension(891, 525));
        PanelFoto1.setOpaque(false);
        PanelFoto1.setPreferredSize(new java.awt.Dimension(891, 525));
        PanelFoto1.setLayout(new java.awt.BorderLayout());

        Foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto1.setAlignmentX(0.5F);
        Foto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Foto1.setIconTextGap(0);
        Foto1.setMaximumSize(new java.awt.Dimension(891, 525));
        Foto1.setMinimumSize(new java.awt.Dimension(891, 525));
        Foto1.setPreferredSize(new java.awt.Dimension(891, 525));
        PanelFoto1.add(Foto1, java.awt.BorderLayout.CENTER);

        carrusel.add(PanelFoto1, "card7");

        PanelFoto2.setMaximumSize(new java.awt.Dimension(891, 525));
        PanelFoto2.setMinimumSize(new java.awt.Dimension(891, 525));
        PanelFoto2.setOpaque(false);
        PanelFoto2.setPreferredSize(new java.awt.Dimension(891, 525));
        PanelFoto2.setLayout(new java.awt.BorderLayout());

        Foto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/miniaturas/embarque/Embarque0.png"))); // NOI18N
        Foto2.setAlignmentY(0.0F);
        Foto2.setDisabledIcon(null);
        Foto2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Foto2.setIconTextGap(0);
        PanelFoto2.add(Foto2, java.awt.BorderLayout.CENTER);

        carrusel.add(PanelFoto2, "card7");

        PanelFoto3.setMaximumSize(new java.awt.Dimension(894, 527));
        PanelFoto3.setMinimumSize(new java.awt.Dimension(894, 527));
        PanelFoto3.setOpaque(false);
        PanelFoto3.setPreferredSize(new java.awt.Dimension(894, 527));
        PanelFoto3.setLayout(new java.awt.BorderLayout());

        Foto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/miniaturas/embarque/Embarque0.png"))); // NOI18N
        Foto3.setAlignmentY(0.0F);
        Foto3.setDisabledIcon(null);
        Foto3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Foto3.setIconTextGap(0);
        PanelFoto3.add(Foto3, java.awt.BorderLayout.CENTER);

        carrusel.add(PanelFoto3, "card7");

        PanelFoto4.setMaximumSize(new java.awt.Dimension(891, 525));
        PanelFoto4.setMinimumSize(new java.awt.Dimension(891, 525));
        PanelFoto4.setOpaque(false);
        PanelFoto4.setPreferredSize(new java.awt.Dimension(891, 525));
        PanelFoto4.setLayout(new java.awt.BorderLayout());

        Foto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/miniaturas/embarque/Embarque0.png"))); // NOI18N
        Foto4.setAlignmentY(0.0F);
        Foto4.setDisabledIcon(null);
        Foto4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Foto4.setIconTextGap(0);
        PanelFoto4.add(Foto4, java.awt.BorderLayout.CENTER);

        carrusel.add(PanelFoto4, "card7");

        PanelFoto5.setMaximumSize(new java.awt.Dimension(894, 527));
        PanelFoto5.setMinimumSize(new java.awt.Dimension(894, 527));
        PanelFoto5.setOpaque(false);
        PanelFoto5.setPreferredSize(new java.awt.Dimension(894, 527));
        PanelFoto5.setLayout(new java.awt.BorderLayout());

        Foto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/miniaturas/embarque/Embarque0.png"))); // NOI18N
        Foto5.setAlignmentY(0.0F);
        Foto5.setDisabledIcon(null);
        Foto5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Foto5.setIconTextGap(0);
        PanelFoto5.add(Foto5, java.awt.BorderLayout.CENTER);

        carrusel.add(PanelFoto5, "card7");

        jPanel1.add(carrusel, java.awt.BorderLayout.CENTER);

        indicadorFoto.setBackground(new java.awt.Color(10, 38, 72));

        ind1.setBackground(new java.awt.Color(10, 38, 72));
        ind1.setOpaque(true);
        indicadorFoto.add(ind1);

        ind2.setBackground(new java.awt.Color(10, 38, 72));
        ind2.setOpaque(true);
        indicadorFoto.add(ind2);

        ind3.setBackground(new java.awt.Color(10, 38, 72));
        ind3.setOpaque(true);
        indicadorFoto.add(ind3);

        ind4.setBackground(new java.awt.Color(10, 38, 72));
        ind4.setOpaque(true);
        indicadorFoto.add(ind4);

        ind5.setBackground(new java.awt.Color(10, 38, 72));
        ind5.setOpaque(true);
        indicadorFoto.add(ind5);

        jPanel1.add(indicadorFoto, java.awt.BorderLayout.SOUTH);

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 30, 1130, 520));

        Fondo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/Cuadrado fondo enfocado.png"))); // NOI18N
        bg.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 1020, 440));

        Fondo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/Cuadrado fondo enfocado.png"))); // NOI18N
        bg.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 1010, 440));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(253, 44));
        jButton1.setMinimumSize(new java.awt.Dimension(253, 44));
        jButton1.setPreferredSize(new java.awt.Dimension(253, 44));
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 780, -1, -1));

        Titulo.setForeground(new java.awt.Color(247, 247, 247));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universae/images/game/Barrita aislada descripción.png"))); // NOI18N
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 830, 50));

        Texto.setForeground(new java.awt.Color(247, 247, 247));
        bg.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 800, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void izquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izquierdaMouseClicked
        cardLayout.next(carrusel);
        pag--;
        if(pag == -1)
            pag = 4;
        Utilidades.funcionIndicadorFoto(pag, indicadores, indicadoresRoots);
        
    }//GEN-LAST:event_izquierdaMouseClicked

    private void derechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMouseClicked
        cardLayout.previous(carrusel);
        pag++;
        if(pag == 5)
            pag = 0;
        Utilidades.funcionIndicadorFoto(pag, indicadores, indicadoresRoots);
    
    }//GEN-LAST:event_derechaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    public static javax.swing.JLabel Foto1;
    public static javax.swing.JLabel Foto2;
    public static javax.swing.JLabel Foto3;
    public static javax.swing.JLabel Foto4;
    public static javax.swing.JLabel Foto5;
    private javax.swing.JPanel PanelFoto1;
    private javax.swing.JPanel PanelFoto2;
    private javax.swing.JPanel PanelFoto3;
    private javax.swing.JPanel PanelFoto4;
    private javax.swing.JPanel PanelFoto5;
    public static javax.swing.JLabel Texto;
    public static javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel carrusel;
    private javax.swing.JLabel derecha;
    private javax.swing.JLabel ind1;
    private javax.swing.JLabel ind2;
    private javax.swing.JLabel ind3;
    private javax.swing.JLabel ind4;
    private javax.swing.JLabel ind5;
    private javax.swing.JPanel indicadorFoto;
    private javax.swing.JLabel izquierda;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   

}

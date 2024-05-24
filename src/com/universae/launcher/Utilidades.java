package com.universae.launcher;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.*;

public class Utilidades {

    public static void setImagenLabel(JLabel label, String root) {
        ImageIcon originalIcon = new ImageIcon(root); // Crea un ImageIcon con la ruta obtenida

        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        double widthRatio = (double) labelWidth / originalWidth;
        double heightRatio = (double) labelHeight / originalHeight;

        double scaleFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label.setIcon(scaledIcon);
        label.repaint();
    }

    public static void setImagenLabel(JButton boton, String root) {
        ImageIcon originalIcon = new ImageIcon(root); // Crea un ImageIcon con la ruta obtenida

        int labelWidth = boton.getWidth();
        int labelHeight = boton.getHeight();
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        double widthRatio = (double) labelWidth / originalWidth;
        double heightRatio = (double) labelHeight / originalHeight;

        double scaleFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        boton.setIcon(scaledIcon);
        boton.repaint();
    }

    public static void setImagenLabel(JLabel label, String root, Dimension dimension) {
        ImageIcon originalIcon = new ImageIcon(root); // Crea un ImageIcon con la ruta obtenida

        int dimensionWidth = dimension.width;
        int dimensionHeight = dimension.height;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        double widthRatio = (double) dimensionWidth / originalWidth;
        double heightRatio = (double) dimensionHeight / originalHeight;

        double scaleFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label.setIcon(scaledIcon);
        label.repaint();
    }

    public static void setImagenLabel(JButton boton, String root, Dimension dimension) {
        ImageIcon originalIcon = new ImageIcon(root); // Crea un ImageIcon con la ruta obtenida

        int dimensionWidth = dimension.width;
        int dimensionHeight = dimension.height;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();

        double widthRatio = (double) dimensionWidth / originalWidth;
        double heightRatio = (double) dimensionHeight / originalHeight;

        double scaleFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        boton.setIcon(scaledIcon);
        boton.repaint();
    }

    public static ArrayList<String> crearListaArchivos(String ubicacion, String nombre, String tipo, int tamañoLista) {
        ArrayList<String> TempList = new ArrayList<>();

        for (int i = 0; i < tamañoLista; i++) {
            if (!"PuntoCarruselEmpty".equals(nombre)) {
                TempList.add(ubicacion + nombre + i + tipo);
            } else {
                if (i == 0) {
                    TempList.add(ubicacion + "PuntoCarruselFilled" + tipo);
                } else {
                    TempList.add(ubicacion + nombre + tipo);
                }
            }
        }

        return TempList;
    }

    public static void aumentarTamañoEvt(JLabel iconLabel, JLabel[] escudos, ArrayList<String> escudosRoots, int state) {
        // Verificar si el ArrayList no está vacío y el índice es válido
        if (!escudosRoots.isEmpty() && iconLabel != null && escudos.length > 0 && escudos.length == escudosRoots.size()) {
            for (int i = 0; i < escudos.length; i++) {
                if (escudos[i] == iconLabel) {
                    String rutaImagen = escudosRoots.get(i);
                    if (state == 1) {
                        Utilidades.setImagenLabel(iconLabel, rutaImagen);
                    } else {
                        Utilidades.setImagenLabel(iconLabel, rutaImagen, new Dimension(85, 85));
                    }
                    break;
                }
            }
        }
    }

    public static void aumentarTamañoEvt(JButton boton, int state) {
        // Verificar si el ArrayList no está vacío
        if (!botonesRoots.isEmpty()) {
            for (int i = 0; i < Home.botones.length; i++) {
                if (Home.botones[i] == boton) {
                    String rutaImagen = botonesRoots.get(i);
                    if (state == 1) {
                        Utilidades.setImagenLabel(boton, rutaImagen);
                    } else {
                        Utilidades.setImagenLabel(boton, rutaImagen, new Dimension(375, 285));
                    }
                    break;
                }
            }
        }
    }

    public static void mostrarPanel(JPanel panel, JPanel content) {
        panel.setSize(1550, 880);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public static void funcionIndicadorFoto(int posicion, JLabel[] indicadores, ArrayList<String> indicadoresRoots) {
        for (JLabel indicadore : indicadores) {
            setImagenLabel(indicadore, "src/com/universae/images/game/PuntoCarruselEmpty.png", new Dimension(15, 15));
        }
        setImagenLabel(indicadores[posicion], "src/com/universae/images/game/PuntoCarruselFilled.png", new Dimension(15, 15));
    }

    public static ArrayList<String> botonesRoots = new ArrayList();

    public static void mostrarHome(JLabel icono) {
        icon = icono.getName();

        try {
            // Lee el archivo JSON local
            FileReader reader = new FileReader("src/com/universae/database/DataBase.json");

            // Crea un objeto JSON a partir del archivo leído
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));
            JSONArray gradosArray = jsonObject.getJSONArray("grados");

            for (int i = 0; i < gradosArray.length(); i++) {
                JSONObject grado = gradosArray.getJSONObject(i);
                String nombreGrado = grado.getString("nombre");
                if (nombreGrado.equals(icono.getName())) {
                    // Obtener el array de juegos
                    JSONArray juegosArray = grado.getJSONArray("juegos");

                    for (int j = 0; j < juegosArray.length(); j++) {
                        JSONObject juego = juegosArray.getJSONObject(j);
                        String rutaImagenJuego = juego.getString("imagen");
                        botonesRoots.add(rutaImagenJuego);
                        setImagenLabel(Home.botones[j], rutaImagenJuego, new Dimension(375, 285));
                        Home.botones[j].setName(juego.getString("titulo"));
                    }
                }
            }
            // Cierra el lector
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static String icon;

    public static void mostrarGame(JButton boton) {
        JLabel[] miniatura = new JLabel[]{Game.Foto1, Game.Foto2, Game.Foto3, Game.Foto4, Game.Foto5};
        ArrayList<String> miniaturasRoots = new ArrayList<>();
        try {
            // Lee el archivo JSON local
            FileReader reader = new FileReader("src/com/universae/database/DataBase.json");

            // Crea un objeto JSON a partir del archivo leído
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));
            JSONArray gradosArray = jsonObject.getJSONArray("grados");

            // Itera sobre los grados
            for (int i = 0; i < gradosArray.length(); i++) {
                JSONObject grado = gradosArray.getJSONObject(i);
                String nombreGrado = grado.getString("nombre");

                // Comprueba si el nombre del grado coincide con el icono
                if (nombreGrado.equals(icon)) {
                    JSONArray juegosArray = grado.getJSONArray("juegos");

                    // Itera sobre los juegos en el grado actual
                    for (int j = 0; j < juegosArray.length(); j++) {
                        JSONObject juego = juegosArray.getJSONObject(j);
                        String nombreJuego = juego.getString("titulo");
                        String desccripcionJuego = juego.getString("descripcion");
                        Game.Titulo.setText(nombreJuego);
                        Game.Texto.setText(desccripcionJuego);

                        // Comprueba si el nombre del juego coincide con el nombre del botón
                        if (nombreJuego.equals(boton.getName())) {
                            JSONArray miniaturasArray = juego.getJSONArray("miniaturas");

                            // Itera sobre las miniaturas del juego actual
                            for (int k = 0; k < miniaturasArray.length(); k++) {
                                if (k < miniatura.length) {
                                    miniaturasRoots.add(miniaturasArray.getString(k));
                                    setImagenLabel(miniatura[k], miniaturasArray.getString(k), new Dimension(891, 525));
                                }
                            }
                        }
                    }
                }
            }
             // Cierra el lector
            reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}

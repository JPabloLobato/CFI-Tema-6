import groupId.AnalisisYOrganizacionDeInformacion;
import groupId.GestionRelaciones;
import groupId.MainIndexacionArchivos;
import groupId.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        JButton gestionDatosButton = new JButton("Gestión de Datos Dinámicos");
        gestionDatosButton.addActionListener(e -> {
            VentanaPrincipal main = new VentanaPrincipal();

        });
        menuPanel.add(gestionDatosButton);

        JButton analisisInformacionButton = new JButton("Análisis y Organización de Información");
        analisisInformacionButton.addActionListener(e -> {
            AnalisisYOrganizacionDeInformacion main = new AnalisisYOrganizacionDeInformacion();

        });
        menuPanel.add(analisisInformacionButton);

        JButton mapasAsociacionButton = new JButton("Mapas de Asociación de Datos");
        mapasAsociacionButton.addActionListener(e -> {
            GestionRelaciones main = new GestionRelaciones();

        });
        menuPanel.add(mapasAsociacionButton);

        JButton visualizacionArchivosButton = new JButton("Indexación y Visualización de Archivos");
        visualizacionArchivosButton.addActionListener(e -> {
            MainIndexacionArchivos main = new MainIndexacionArchivos();

        });
        menuPanel.add(visualizacionArchivosButton);

        frame.add(menuPanel, BorderLayout.WEST);
        frame.setVisible(true);
    }
}
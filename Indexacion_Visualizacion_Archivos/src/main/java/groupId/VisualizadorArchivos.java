package groupId;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class VisualizadorArchivos {
    private final JFrame marco;
    private final JTextArea areaDeTexto;

    public VisualizadorArchivos() {
        marco = new JFrame("Visualizador de archivos");
        areaDeTexto = new JTextArea();
        JScrollPane panelDeDesplazamiento = new JScrollPane(areaDeTexto);
        marco.add(panelDeDesplazamiento, BorderLayout.CENTER);
        marco.setSize(600,500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);

        JPanel panelInstrucciones = new JPanel();
        JLabel instrucciones = new JLabel("<html><body>1. Los archivos se muestran en el área de texto.<br>2. Cada línea representa un archivo, con su nombre y contenido.</body></html>");
        panelInstrucciones.add(instrucciones);

        marco.add(panelInstrucciones, BorderLayout.NORTH);
    }
    public void mostrarArchivo(Map<String, String> indiceDeArchivos) {
        TreeMap<String, String> indiceOrdenado = new TreeMap<>(indiceDeArchivos);
        for (Map.Entry<String, String> entrada : indiceOrdenado.entrySet()) {
            areaDeTexto.append(entrada.getKey() + " -> " + entrada.getValue() + "\n");
        }
        marco.setVisible(true);
    }
}

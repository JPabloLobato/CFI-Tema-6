package groupId;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;
import java.awt.event.ActionListener;

public class AnalisisYOrganizacionDeInformacion extends JFrame {
    private final JTextArea nombresInputArea;
    private final JTextArea nombresOutputArea;
    private final JTextArea transaccionesInputArea;
    private final JTextArea transaccionesOutputArea;
    private final TreeSet<String> nombres = new TreeSet<>();
    private final List<TransaccionVenta> transacciones = new ArrayList<>();

    public AnalisisYOrganizacionDeInformacion() {
        super("Analisis y organizacion de informacion");
        setLayout(new FlowLayout());

        JPanel panelInstrucciones = new JPanel();
        JLabel instrucciones = new JLabel("<html><body>1. Para ordenar nombres, introduzca los nombres en el área de texto superior y haga clic en 'Ordenar nombres'.<br>2. Para ordenar transacciones, introduzca las transacciones en el área de texto inferior y haga clic en 'Ordenar transacciones'.</body></html>");
        panelInstrucciones.add(instrucciones);

        getContentPane().add(panelInstrucciones, BorderLayout.NORTH);

        nombresInputArea = new JTextArea(10, 20);
        add(new JScrollPane(nombresInputArea));

        nombresOutputArea = new JTextArea(10, 20);
        add(new JScrollPane(nombresOutputArea));

        JButton ordenarNombresButton = new JButton("Ordenar nombres");
        ordenarNombresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] nombresIntroducidos = nombresInputArea.getText().split("\\s+");
                nombres.addAll(Arrays.asList(nombresIntroducidos));
                nombresOutputArea.setText(nombres.toString());
            }
        });
        add(ordenarNombresButton);

        transaccionesInputArea = new JTextArea(10, 20);
        add(new JScrollPane(transaccionesInputArea));

        transaccionesOutputArea = new JTextArea(10, 20);
        add(new JScrollPane(transaccionesOutputArea));

        JButton ordenarTransaccionesButton = new JButton("Ordenar transacciones");
        ordenarTransaccionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] transaccionesIntroducidas = transaccionesInputArea.getText().split("\\n");
                for (String transaccion : transaccionesIntroducidas) {
                    String[] partes = transaccion.split(",");
                    if (partes.length == 3) {
                        String producto = partes[0].trim();
                        double monto = Double.parseDouble(partes[1].trim());
                        String fecha = partes[2].trim();
                        transacciones.add(new TransaccionVenta(producto, monto, fecha));
                    }
                }
                transacciones.sort(Comparator.comparing(TransaccionVenta::monto));
                transaccionesOutputArea.setText(transacciones.toString());
            }
        });
        add(ordenarTransaccionesButton);
    }

    public static void main(String[] args) {
        AnalisisYOrganizacionDeInformacion window = new AnalisisYOrganizacionDeInformacion();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(760,400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

    public record TransaccionVenta(String producto, double monto, String fecha) {
        @Override
        public String toString() {
            return "TransaccionVenta{" +
                    "producto='" + producto + '\'' +
                    ", monto=" + monto +
                    ", fecha='" + fecha + '\'' +
                    '}';
        }
    }
}
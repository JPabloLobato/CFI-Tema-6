package groupId;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private final JList<String> jListParejas;
    private final DefaultListModel<String> listModel;
    private final ListaDeParejas<Integer, String> listaDeParejas;

    public VentanaPrincipal() {
        setTitle("Gestión de Datos Dinámicos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        listaDeParejas = new ListaDeParejas<>();
        listModel = new DefaultListModel<>();
        jListParejas = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(jListParejas);

        JButton btnAgregar = new JButton("Agregar Pareja");
        JButton btnEliminar = new JButton("Eliminar Pareja");

        btnAgregar.addActionListener(e -> agregarPareja());
        btnEliminar.addActionListener(e -> eliminarPareja());

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }

    private void agregarPareja() {
        String valor = JOptionPane.showInputDialog(this, "Introduce el segundo valor:");
        if (valor != null && !valor.isEmpty()) {
            Pareja<Integer, String> pareja = new Pareja<>(listaDeParejas.getLista().size() + 1, valor);
            listaDeParejas.agregarPareja(pareja);
            listModel.addElement(pareja.toString());
        }
    }


    private void eliminarPareja() {
        int indiceSeleccionado = jListParejas.getSelectedIndex();
        if (indiceSeleccionado != -1) {
            listaDeParejas.eliminarPareja(indiceSeleccionado);
            listModel.remove(indiceSeleccionado);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}


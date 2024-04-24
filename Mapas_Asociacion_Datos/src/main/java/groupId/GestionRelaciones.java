package groupId;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones extends JFrame {
    private final Map<Integer, String> mapa = new HashMap<>();
    public GestionRelaciones() {
        super("Gestión de Relaciones");
        setLayout(new FlowLayout());

        JTextField numeroField = new JTextField(10);
        add(numeroField);

        JTextField textoField = new JTextField(10);
        add(textoField);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(numeroField.getText());
                String texto = textoField.getText();
                mapa.put(numero, texto);
                numeroField.setText("");
                textoField.setText("");
            }
        });
        add(agregarButton);

        JButton recuperarButton = new JButton("Recuperar");
        recuperarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(numeroField.getText());
                String texto = mapa.get(numero);
                textoField.setText(texto);
            }
        });
        add(recuperarButton);

        JPanel panelInstrucciones = new JPanel();
        JLabel instrucciones = new JLabel("<html><body>1. Para agregar una relación, introduzca el número y el texto en los campos correspondientes y haga clic en 'Agregar'.<br>2. Para recuperar una relación, introduzca el número en el campo correspondiente y haga clic en 'Recuperar'.</body></html>");
        panelInstrucciones.add(instrucciones);
        getContentPane().add(panelInstrucciones, BorderLayout.NORTH);

        setSize(700, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GestionRelaciones();
    }
}
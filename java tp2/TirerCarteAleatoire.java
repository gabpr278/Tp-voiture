// TirerCarteAleatoire.java
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class TirerCarteAleatoire {
    private static final String[] VALEURS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private static final Random rnd = new Random();

    public static Carte tirer() {
        Couleur c = Couleur.values()[rnd.nextInt(Couleur.values().length)];
        String v = VALEURS[rnd.nextInt(VALEURS.length)];
        return new Carte(c, v);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tirer une carte");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JLabel label = new JLabel("Cliquez pour tirer une carte", SwingConstants.CENTER);
            label.setFont(label.getFont().deriveFont(16f));
            JButton tirer = new JButton("Tirer");
            tirer.addActionListener(e -> {
                Carte c = tirer();
                label.setText(c.toString());
            });

            frame.getContentPane().setLayout(new BorderLayout());
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.getContentPane().add(tirer, BorderLayout.SOUTH);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
ss
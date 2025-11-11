package id.ac.unpas.mavenproject4.Modul6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class Latihan1 {
    public static void main(String[] args) {
        // 1. Buat frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // 2. Buat layar di bagian atas menggunakan JTextField
        JTextField layar = new JTextField();
        frame.add(layar, BorderLayout.NORTH);

        // 3. Buat panel untuk tombol dengan GridLayout 4 baris, 4 kolom
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5)); // GridLayout(rows, cols, hgap, vgap)

        // 4. Tambahkan 16 tombol (0-9 dan operator +, -, *, /)
        panelTombol.add(new JButton("7"));
        panelTombol.add(new JButton("8"));
        panelTombol.add(new JButton("9"));
        panelTombol.add(new JButton("/"));

        panelTombol.add(new JButton("4"));
        panelTombol.add(new JButton("5"));
        panelTombol.add(new JButton("6"));
        panelTombol.add(new JButton("*")); // Seharusnya '*' bukan 'x'

        panelTombol.add(new JButton("1"));
        panelTombol.add(new JButton("2"));
        panelTombol.add(new JButton("3"));
        panelTombol.add(new JButton("-"));

        panelTombol.add(new JButton("0"));
        panelTombol.add(new JButton("."));
        panelTombol.add(new JButton("="));
        panelTombol.add(new JButton("+"));

        // 5. Tambahkan panel ke frame di bagian CENTER
        frame.add(panelTombol, BorderLayout.CENTER);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}
    


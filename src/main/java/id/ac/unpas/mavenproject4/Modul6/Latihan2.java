package id.ac.unpas.mavenproject4.Modul6;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Latihan2 {
        public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Konverter Suhu Celcius ke Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setLayout((LayoutManager) new FlowLayout()); // Atau bisa juga GridLayout

        // 2. Buat komponen
        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField textCelcius = new JTextField(10);
        JButton buttonKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel labelHasil = new JLabel(""); // Label kosong untuk hasil

        // 3. Buat Event Listener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil teks dari JTextField dan ubah ke double
                    double celcius = Double.parseDouble(textCelcius.getText());

                    // Hitung Fahrenheit
                    double fahrenheit = (celcius * 9 / 5) + 32;

                    // Tampilkan hasil ke JLabel
                    labelHasil.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    // Tangani input yang bukan angka
                    JOptionPane.showMessageDialog(frame,
                            "Masukkan angka yang valid!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        // 4. Daftarkan listener ke tombol
        buttonKonversi.addActionListener(listener);

        // 5. Tambahkan semua komponen ke frame
        frame.add(labelCelcius);
        frame.add(textCelcius);
        frame.add(buttonKonversi);
        frame.add(labelFahrenheit);
        frame.add(labelHasil);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}
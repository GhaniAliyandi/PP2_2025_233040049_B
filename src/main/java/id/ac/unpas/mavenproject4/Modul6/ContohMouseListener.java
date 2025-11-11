/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.mavenproject4.Modul6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ghani aliyandi
 */
public class ContohMouseListener {
    public static void main(String[] args) {
        // 1. Buat frame utama
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // 2. Buat komponen (Event Source)
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 200));

        // 3. Buat Event Listener menggunakan MouseAdapter
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Saat mouse masuk, ubah warna panel jadi biru
                panel.setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Saat mouse keluar, kembalikan ke warna semula
                panel.setBackground(Color.LIGHT_GRAY);
            }
        };

        // 4. Hubungkan listener ke panel
        panel.addMouseListener(adapter);

        // 5. Tambahkan panel ke frame
        frame.add(panel);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}

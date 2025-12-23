/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.mavenproject4.Modul10;

import id.ac.unpas.mavenproject4.Modul10.View.MahasiswaApp;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Memanggil aplikasi MahasiswaApp untuk dijalankan
        SwingUtilities.invokeLater(() -> {
            new MahasiswaApp().setVisible(true);
        });
    }
}

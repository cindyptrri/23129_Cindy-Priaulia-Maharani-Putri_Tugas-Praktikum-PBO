/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {

    // Deklarasi komponen
    private JTextField nimTF, namaTF, alamatTF, matkulTF;
    private JTextField nilai1TF, nilai2TF, nilai3TF, nilai4TF, nilai5TF, nilaiAkhirTF;
    private JButton simpanBT, hapusBT;
    private JTable mahasiswaTB;
    private DefaultTableModel tableModel;

    public MainApp() {
        setTitle("Data Mahasiswa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Label dan TextField
        JLabel nimLabel = new JLabel("NIM:");
        nimLabel.setBounds(20, 20, 100, 25);
        add(nimLabel);

        nimTF = new JTextField();
        nimTF.setBounds(120, 20, 150, 25);
        add(nimTF);

        JLabel namaLabel = new JLabel("Nama:");
        namaLabel.setBounds(20, 60, 100, 25);
        add(namaLabel);

        namaTF = new JTextField();
        namaTF.setBounds(120, 60, 150, 25);
        add(namaTF);

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatLabel.setBounds(20, 100, 100, 25);
        add(alamatLabel);

        alamatTF = new JTextField();
        alamatTF.setBounds(120, 100, 150, 25);
        add(alamatTF);

        JLabel matkulLabel = new JLabel("Mata Kuliah:");
        matkulLabel.setBounds(20, 140, 100, 25);
        add(matkulLabel);

        matkulTF = new JTextField();
        matkulTF.setBounds(120, 140, 150, 25);
        add(matkulTF);

        // TextField untuk Nilai
        JLabel nilai1Label = new JLabel("Nilai 1 [10%]:");
        nilai1Label.setBounds(300, 20, 100, 25);
        add(nilai1Label);

        nilai1TF = new JTextField();
        nilai1TF.setBounds(400, 20, 100, 25);
        add(nilai1TF);

        JLabel nilai2Label = new JLabel("Nilai 2 [15%]:");
        nilai2Label.setBounds(300, 60, 100, 25);
        add(nilai2Label);

        nilai2TF = new JTextField();
        nilai2TF.setBounds(400, 60, 100, 25);
        add(nilai2TF);

        JLabel nilai3Label = new JLabel("Nilai 3 - UTS [25%]:");
        nilai3Label.setBounds(300, 100, 150, 25);
        add(nilai3Label);

        nilai3TF = new JTextField();
        nilai3TF.setBounds(400, 100, 100, 25);
        add(nilai3TF);

        JLabel nilai4Label = new JLabel("Nilai 4 [15%]:");
        nilai4Label.setBounds(300, 140, 100, 25);
        add(nilai4Label);

        nilai4TF = new JTextField();
        nilai4TF.setBounds(400, 140, 100, 25);
        add(nilai4TF);

        JLabel nilai5Label = new JLabel("Nilai 5 [35%]:");
        nilai5Label.setBounds(300, 180, 100, 25);
        add(nilai5Label);

        nilai5TF = new JTextField();
        nilai5TF.setBounds(400, 180, 100, 25);
        add(nilai5TF);

        JLabel nilaiAkhirLabel = new JLabel("Nilai Akhir:");
        nilaiAkhirLabel.setBounds(300, 220, 100, 25);
        add(nilaiAkhirLabel);

        nilaiAkhirTF = new JTextField();
        nilaiAkhirTF.setBounds(400, 220, 100, 25);
        nilaiAkhirTF.setEditable(false);
        add(nilaiAkhirTF);

        // Tombol Simpan dan Hapus
        simpanBT = new JButton("Simpan");
        simpanBT.setBounds(550, 20, 100, 25);
        add(simpanBT);

        hapusBT = new JButton("Hapus");
        hapusBT.setBounds(550, 60, 100, 25);
        add(hapusBT);

        // Tabel
        tableModel = new DefaultTableModel(new String[]{"NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"}, 0);
        mahasiswaTB = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(mahasiswaTB);
        tableScrollPane.setBounds(20, 300, 750, 200);
        add(tableScrollPane);

        // Event Listener untuk Tombol
        simpanBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simpanData();
            }
        });

        hapusBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hapusData();
            }
        });
    }

    private void simpanData() {
        String nim = nimTF.getText();
        String nama = namaTF.getText();
        String alamat = alamatTF.getText();
        String matkul = matkulTF.getText();

        try {
            double nilai1 = Double.parseDouble(nilai1TF.getText());
            double nilai2 = Double.parseDouble(nilai2TF.getText());
            double nilai3 = Double.parseDouble(nilai3TF.getText());
            double nilai4 = Double.parseDouble(nilai4TF.getText());
            double nilai5 = Double.parseDouble(nilai5TF.getText());

            // Hitung Nilai Akhir
            double nilaiAkhir = (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
            nilaiAkhirTF.setText(String.valueOf(nilaiAkhir));

            // Tambahkan ke tabel
            tableModel.addRow(new Object[]{nim, nama, alamat, matkul, nilaiAkhir});

            clearTextFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input nilai harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapusData() {
        int selectedRow = mahasiswaTB.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearTextFields() {
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        matkulTF.setText("");
        nilai1TF.setText("");
        nilai2TF.setText("");
        nilai3TF.setText("");
        nilai4TF.setText("");
        nilai5TF.setText("");
        nilaiAkhirTF.setText("");
        nimTF.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }
}
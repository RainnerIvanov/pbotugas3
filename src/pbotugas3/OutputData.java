
package pbotugas3;


import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OutputData {

    public OutputData(String nama, String jeniskelamin, String agama, String hobby) {
        JFrame frame = new JFrame("Hasil");
        JLabel lnama = new JLabel("Nama Lengkap");
        JLabel dnama = new JLabel(nama);
        JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
        JLabel djeniskelamin = new JLabel(jeniskelamin);
        JLabel lagama = new JLabel("Agama");
        JLabel dagama = new JLabel(agama);
        JLabel lhobby = new JLabel("Hobi");
        JLabel dhobby = new JLabel(hobby);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(lnama);
        frame.add(dnama);
        frame.add(ljeniskelamin);
        frame.add(djeniskelamin);
        frame.add(lagama);
        frame.add(dagama);
        frame.add(lhobby);
        frame.add(dhobby);

        lnama.setBounds(10, 10, 120, 20);
        dnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        djeniskelamin.setBounds(130, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        dagama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        dhobby.setBounds(130, 85, 100, 20);
    }
}

package myInterfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class ManageRiderFrame extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private Cursor cursor;

    private String[] column = { "User Name", "Email", "Password", "Mobile Number", "Gender", "License Number",
            "Vehicle Type", "Date and Time" };
    private String[] rows = new String[8];

    public ManageRiderFrame(String name) {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Aiub Ridez");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Rider Data");
        label1.setBounds(225, 10, 400, 80);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(54, 418, 184, 50);
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#4a7c59"));
        c.add(btn1);

        btn2 = new JButton("Delete");
        btn2.setBounds(248, 418, 184, 50);
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#4a7c59"));
        c.add(btn2);

        btn3 = new JButton("Add");
        btn3.setBounds(442, 418, 184, 50);
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#4a7c59"));
        c.add(btn3);
        /*
         * btn4 = new JButton("Home");
         * btn4.setBounds(54, 480, 278, 50);
         * btn4.setFont(f2);
         * btn4.setCursor(cursor);
         * btn4.setForeground(Color.WHITE);
         * btn4.setBackground(Color.decode("#C00000"));
         * c.add(btn4);
         */

        btn5 = new JButton();
        btn5.setText("Back");
        btn5.setForeground(Color.decode("#386641"));
        btn5.setHorizontalTextPosition(JButton.CENTER);
        btn5.setVerticalTextPosition(JButton.BOTTOM);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.setFocusPainted(false);
        btn5.setBorderPainted(false);
        btn5.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btn5.setBounds(275, 487, 100, 60);
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/images/reply1.png"));
        btn5.setIcon(backIcon);

        c.add(btn5);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getColumnModel().getColumn(6).setPreferredWidth(200);
        table.getColumnModel().getColumn(7).setPreferredWidth(100);
        // table.getColumnModel().getColumn(8).setPreferredWidth(100);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        String file = ".\\Data\\rider_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(8); // Email
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(11); // password
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(16); // mobile number
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // gender
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(17); // license number
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(15); // vehicle type
                    rows[7] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        // Refresh Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                ManageRiderFrame frame = new ManageRiderFrame(name);
                frame.setVisible(true);

            }
        });

        // Delete Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a Rider to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4)
                                    || j == (q + 5) || j == (q + 6) || j == (q + 7))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    ManageRiderFrame frame = new ManageRiderFrame(name);
                    frame.setVisible(true);
                }

            }
        });

        // Add Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminAddRider frame = new AdminAddRider(name);
                frame.setVisible(true);
            }
        });
        /*
         * // Exit Button
         * btn4.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent ae) {
         * System.exit(0);
         * }
         * });
         */

        // Back Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminDashBoard frame = new AdminDashBoard(name);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        ManageRiderFrame frame = new ManageRiderFrame("Saron");
        frame.setVisible(true);
    }
}

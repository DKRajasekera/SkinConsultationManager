package System;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static System.WestminsterSkinConsultationManager.consultations;

public class ShowAppoinmentsGUI extends JFrame {

    private JLabel jLabel1;
    private JLabel background;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton jButton1;

    ShowAppoinmentsGUI() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        background = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jButton1 = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(300, 250));
        setTitle("Show Appoinments");

        background.setIcon(new ImageIcon("Gif-Banner.gif"));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Appoinments");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Doctor Linecence No", "Patient ID", "Consltation ID", "Date", "Time Slot Number", "Start Time", "End Time"
                }
        ));
        jTable1.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setOpaque(false);
        jTable1.setForeground(new Color(255,255,255));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0, 147, 255, 245));
        jTable1.getTableHeader().setForeground(Color.white);

        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jButton1.setText("Back");
        jButton1.setForeground(Color.white);
        jButton1.setBackground(new Color(0, 147, 255, 245));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI gui = new GUI();
                gui.show();

                dispose();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(60, 60, 60))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(471, 471, 471)
                                                .addComponent(jLabel1)))
                                .addContainerGap(111, Short.MAX_VALUE))
                        .addComponent(background)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18))
                        .addComponent(background)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }

    public void addDoctorRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[7];
        for (Consultation consultation : consultations) {
            rowData[0] = consultation.getDoctorLic();
            rowData[1] = consultation.getPatientID();
            rowData[2] = consultation.getConsultationID();
            rowData[3] = consultation.getDate();
            rowData[4] = consultation.timeSlot.getTime_slot_ID();
            rowData[5] = consultation.timeSlot.getS_Time();
            rowData[6] = consultation.timeSlot.getE_Time();
            model.addRow(rowData);
        }
    }
}
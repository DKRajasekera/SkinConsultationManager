package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static System.WestminsterSkinConsultationManager.patients;


public class AddPatientGUI extends JFrame {

    private JLabel Address;
    private JLabel DateOfBirth;
    private JLabel MobileNumber;
    private JLabel Name;
    private JLabel PatientID;
    private JLabel Surname;
    private JLabel bachgound;
    private JButton addButton;
    private JButton clearButton;
    private JButton searchButton;
    private JButton exitButton;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField txtAddress;
    private JTextField txtDateOfBirth;
    private JTextField txtMobileNumber;
    private JTextField txtName;
    private JTextField txtPatientID;
    private JTextField txtSurname;

    AddPatientGUI() {

        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        Name = new JLabel();
        Surname = new JLabel();
        DateOfBirth = new JLabel();
        MobileNumber = new JLabel();
        PatientID = new JLabel();
        Address = new JLabel();
        bachgound = new JLabel();
        txtName = new JTextField();
        txtSurname = new JTextField();
        txtDateOfBirth = new JTextField();
        txtMobileNumber = new JTextField();
        txtPatientID = new JTextField();
        txtAddress = new JTextField();
        addButton = new JButton();
        clearButton = new JButton();
        searchButton = new JButton();
        exitButton = new JButton();

        bachgound.setIcon(new ImageIcon("giphy.gif"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(new Point(600, 300));
        setTitle("Add Patients");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setText("Please enter Patient details for adding to system");

        Name.setText("Name :");
        Name.setForeground(new java.awt.Color(204, 204, 204));

        Surname.setText("Surname :");
        Surname.setForeground(new java.awt.Color(204, 204, 204));

        DateOfBirth.setText("Date Of Birth :");
        DateOfBirth.setForeground(new java.awt.Color(204, 204, 204));

        MobileNumber.setText("Mobile Number :");
        MobileNumber.setForeground(new java.awt.Color(204, 204, 204));

        PatientID.setText("Patient ID :");
        PatientID.setForeground(new java.awt.Color(204, 204, 204));

        Address.setText("Address :");
        Address.setForeground(new java.awt.Color(204, 204, 204));

        txtName.setText("Patient's Name");
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setOpaque(false);
        txtName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtName);
            }
        });

        txtSurname.setText("Patient'Surname ");
        txtSurname.setForeground(new java.awt.Color(204, 204, 204));
        txtSurname.setOpaque(false);
        txtSurname.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtSurname);
            }
        });

        txtDateOfBirth.setText("Patient's Date of birth");
        txtDateOfBirth.setForeground(new java.awt.Color(204, 204, 204));
        txtDateOfBirth.setOpaque(false);
        txtDateOfBirth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtDateOfBirth);
            }
        });

        txtMobileNumber.setText("Patient's Mobile Number");
        txtMobileNumber.setForeground(new java.awt.Color(204, 204, 204));
        txtMobileNumber.setOpaque(false);
        txtMobileNumber.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtMobileNumber);
            }
        });

        txtPatientID.setText("Patient's ID");
        txtPatientID.setForeground(new java.awt.Color(204, 204, 204));
        txtPatientID.setOpaque(false);
        txtPatientID.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtPatientID);
            }
        });

        txtAddress.setText("Patient's Address");
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setOpaque(false);
        txtAddress.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtAddress);
            }
        });

        addButton.setText("ADD");
        addButton.setForeground(Color.white);
        addButton.setBackground(new Color(0,0,0));
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPatient();
            }
        });

        clearButton.setText("CLEAR");
        clearButton.setForeground(Color.white);
        clearButton.setBackground(new Color(0,0,0));
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtName.setText("");
                txtSurname.setText("");
                txtDateOfBirth.setText("");
                txtMobileNumber.setText("");
                txtPatientID.setText("");
                txtAddress.setText("");
            }
        });

        exitButton.setText("BACK");
        exitButton.setForeground(Color.white);
        exitButton.setBackground(new Color(0,0,0));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WestminsterSkinConsultationManager wscm = new WestminsterSkinConsultationManager();
                wscm.savePatient();
                GUI gui = new GUI();
                gui.show();

                dispose();

            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Address)
                                        .addComponent(Surname)
                                        .addComponent(PatientID)
                                        .addComponent(MobileNumber)
                                        .addComponent(DateOfBirth)
                                        .addComponent(Name))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(75, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(addButton)
                                                .addGap(80, 80, 80)
                                                .addComponent(clearButton)
                                                .addGap(74, 74, 74)
                                                .addComponent(exitButton)
                                                .addGap(55, 55, 55))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(64, 64, 64))))
                        .addComponent(bachgound)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(78, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Name))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Surname)
                                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DateOfBirth)
                                        .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MobileNumber)
                                        .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PatientID)
                                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Address)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton)
                                        .addComponent(exitButton)
                                        .addComponent(clearButton))
                                .addGap(25, 25, 25))
                        .addComponent(bachgound)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public void addPatient() {
        Patient patient = new Patient();
        patient.setName(txtName.getText());
        patient.setSurname(txtSurname.getText());
        patient.setDateOfBirth(txtDateOfBirth.getText());
        patient.setMobileNo(Integer.parseInt(txtMobileNumber.getText()));
        patient.setPatientID(txtPatientID.getText());
        patient.setAddress(txtAddress.getText());
        patients.add(patient);
    }

    private JTextField cleartxt(JTextField evt) {
        evt.setText(" ");
        return evt;
    }
}

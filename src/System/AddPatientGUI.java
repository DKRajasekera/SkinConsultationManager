package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static System.WestminsterSkinConsultationManager.patients;


public class AddPatientGUI extends JFrame {

    private JLabel Address;
    private JLabel DateOfBirth;
    private JLabel MobileNumber;
    private JLabel Name;
    private JLabel PatientID;
    private JLabel Surname;
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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(new Point(600, 300));
        setTitle("Add Patients");


        jLabel1.setText("Please enter Patient details for adding to system");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(jLabel1))
        );

        Name.setText("Name :");

        Surname.setText("Surname :");

        DateOfBirth.setText("Date Of Birth :");

        MobileNumber.setText("Mobile Number :");

        PatientID.setText("Patient ID :");

        Address.setText("Address :");

        txtName.setText("Patient's Name");

        txtSurname.setText("Patient'Surname ");

        txtDateOfBirth.setText("Patient's Date of birth");

        txtMobileNumber.setText("Patient's Mobile Number");

        txtPatientID.setText("Patient's ID");

        txtAddress.setText("Patient's Address");

        addButton.setText("ADD");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPatient();
            }
        });

        clearButton.setText("CLEAR");
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

        exitButton.setText("EXIT");
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

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(addButton)
                                        .addComponent(Address)
                                        .addComponent(Surname)
                                        .addComponent(PatientID)
                                        .addComponent(MobileNumber)
                                        .addComponent(DateOfBirth)
                                        .addComponent(Name))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtPatientID, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                        .addComponent(txtSurname)
                                                                        .addComponent(txtName)
                                                                        .addComponent(txtAddress))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtMobileNumber, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                        .addComponent(txtDateOfBirth, GroupLayout.Alignment.LEADING))
                                                                .addContainerGap(90, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(clearButton)
                                                .addGap(32, 32, 32)
                                                .addComponent(exitButton)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Name)
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Surname)
                                        .addComponent(txtSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(DateOfBirth)
                                        .addComponent(txtDateOfBirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(MobileNumber)
                                        .addComponent(txtMobileNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(PatientID)
                                        .addComponent(txtPatientID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Address)
                                        .addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton)
                                        .addComponent(clearButton)
                                        .addComponent(exitButton))
                                .addGap(25, 25, 25))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
}

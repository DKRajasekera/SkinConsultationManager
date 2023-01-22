package System;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static System.WestminsterSkinConsultationManager.*;


public class AddAppoinmentGUI extends JFrame {

    private String selectedImagePath;

    private JButton AddAppButton;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JTable jTable1;
    private JTextField txtAppConsultation;
    private JTextField txtAppDLic;
    private JTextField txtAppDate;
    private JTextArea txtAppNote;
    private JTextField txtAppPID;
    private JTextField txtPID;
    private JTextField txtPName;
    private JTextField txtTSlotNo;
    private JButton jButton3;
    private JLabel jLabel12;


    AddAppoinmentGUI() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        txtPName = new JTextField();
        txtPID = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        txtAppDate = new JTextField();
        txtAppPID = new JTextField();
        txtTSlotNo = new JTextField();
        jScrollPane3 = new JScrollPane();
        txtAppNote = new JTextArea();
        AddAppButton = new JButton();
        txtAppDLic = new JTextField();
        jLabel11 = new JLabel();
        txtAppConsultation = new JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);
        setTitle("Add Appoinments");

        jLabel1.setText("Search Patient's details");

        jLabel2.setText("Patient Name :");

        jLabel3.setText("Patient ID :");

        txtPName.setText("jTextField1");

        txtPID.setText("jTextField2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Patient Name", "Patient Surname", "Patient Number", "Patient ID", "Patient Address"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchPatients();
            }
        });
        jButton2.setText("Back");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI gui = new GUI();
                gui.show();

                dispose();
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(52, 52, 52))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton2)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtPName, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                        .addComponent(txtPID)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(193, 193, 193)
                                                .addComponent(jLabel1)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtPName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(42, 42, 42))
        );

        jLabel4.setText("Add a Appoinment");

        jLabel5.setText("Date :");

        jLabel6.setText("Doctor Lincence :");

        jLabel7.setText("Time Slot Number :");

        jLabel8.setText("Patient ID :");

        jLabel9.setText("Note :");

        jLabel10.setText("Your Cost is :");

        txtAppDate.setText("jTextField1");

        txtAppPID.setText("jTextField2");

        txtTSlotNo.setText("jTextField3");

        txtAppNote.setColumns(20);
        txtAppNote.setRows(5);
        jScrollPane3.setViewportView(txtAppNote);

        AddAppButton.setText("Add a appoinment");
        AddAppButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConsultation();
                encryption();
            }
        });

        txtAppDLic.setText("jTextField1");

        jLabel11.setText("Consultation ID :");

        txtAppConsultation.setText("jTextField1");

        jButton3.setText("Browse");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser browseImage = new JFileChooser();
                FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
                browseImage.addChoosableFileFilter(fnef);
                int showOpenDialogue = browseImage.showOpenDialog(null);
                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File selectedImage = browseImage.getSelectedFile();
                    selectedImagePath = selectedImage.getAbsolutePath();
                    // display image on lable
                    ImageIcon myImage = new ImageIcon(selectedImagePath);
                    // Resize the image fit to lable
                    Image image = myImage.getImage().getScaledInstance(jLabel12.getWidth(),jLabel12.getHeight(), Image.SCALE_SMOOTH);
                    jLabel12.setIcon(new ImageIcon(image));
                }
            }
        });
        jLabel12.setText("Your picture is display here ");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(190, 190, 190))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                .addGap(96, 96, 96)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3)
                                                        .addComponent(AddAppButton))
                                                .addGap(46, 46, 46))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAppConsultation, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                                .addComponent(txtAppPID, GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTSlotNo, GroupLayout.Alignment.LEADING)
                                                .addComponent(txtAppDLic, GroupLayout.Alignment.LEADING)
                                                .addComponent(txtAppDate, GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel10))
                                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAppDLic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTSlotNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAppPID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(txtAppConsultation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(43, 43, 43)
                                                .addComponent(AddAppButton))
                                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public void showPatientToRow() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[5];
        for (Patient patient : patients) {
            rowData[0] = patient.getName();
            rowData[1] = patient.getSurname();
            rowData[2] = patient.getMobileNo();
            rowData[3] = patient.getPatientID();
            rowData[4] = patient.getAddress();
            model.addRow(rowData);
        }
    }

    public void searchPatients() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String searchPName = txtPName.getText();
        String searchPID = txtPID.getText();
        model.setRowCount(0);
        for (Patient patient : patients) {
            if (patient.getName().equals(searchPName) || patient.getPatientID().equals(searchPID)) {
                Object rowData[] = new Object[5];
                rowData[0] = patient.getName();
                rowData[1] = patient.getSurname();
                rowData[2] = patient.getMobileNo();
                rowData[3] = patient.getPatientID();
                rowData[4] = patient.getAddress();
                model.addRow(rowData);
            }
        }
    }

    public void addConsultation() {
        String Date = txtAppDate.getText();
        String DLic = txtAppDLic.getText();
        String PId = txtAppPID.getText();
        String ConId = txtAppConsultation.getText();
        int timeSlotNumber = Integer.parseInt(txtTSlotNo.getText());
        String Note = txtAppNote.getText();
        boolean isDoctorAvailable = true;
        int cost;
        boolean hasPreviousConsultations = false;
        for (int i = 0; i < consultations.size(); i++) {
            Consultation consultation = consultations.get(i);
            if (consultation.getPatientID().equals(PId)) {
                hasPreviousConsultations = true;
                break;
            }
        }
        if (hasPreviousConsultations) {
            cost = 25;
        } else {
            cost = 15;
        }
        jLabel10.setText("Your Consultation Cost is : £" + cost);
        for (int i = 0; i < consultations.size(); i++) {
            Consultation consultation = consultations.get(i);
            if (consultation.getDate().equals(Date) && consultation.getDoctorLic().equals(DLic) && consultation.timeSlot.getTime_slot_ID() == timeSlotNumber) {
                isDoctorAvailable = false;
                break;
            }
        }

        // If the chosen doctor is not available, assign a different doctor
        if (!isDoctorAvailable) {
            // Create a list of available doctors
            List<Doctor> availableDoctors = new ArrayList<>();
            for (int i = 0; i < doctors.size(); i++) {
                Doctor doc = doctors.get(i);
                if (!doc.getLinecenceNo().equals(DLic)) {
                    boolean isDoctorBooked = false;
                    for (int j = 0; j < consultations.size(); j++) {
                        Consultation consultation = consultations.get(j);
                        if (consultation.getDate().equals(Date) && consultation.getDoctorLic().equals(doc.getLinecenceNo()) && consultation.timeSlot.getTime_slot_ID() == timeSlotNumber) {
                            isDoctorBooked = true;
                            break;
                        }
                    }
                    if (!isDoctorBooked) {
                        availableDoctors.add(doc);
                    }
                }
            }

            // If there are available doctors, assign a random one
            if (!availableDoctors.isEmpty()) {
                Random random = new Random();
                int index = random.nextInt(availableDoctors.size());
                consultations.add(new Consultation(availableDoctors.get(index).getLinecenceNo(), PId, ConId, Date, timeSlotNumber, Note,cost));
                System.out.println("Successfully added the Consultation");
            } else {
                System.out.println("There are no available doctors for the given time slot on the given date.");
            }
        } else {
            // If the chosen doctor is available, add the consultation with the chosen doctor
            consultations.add(new Consultation(DLic, PId, ConId, Date, timeSlotNumber, Note,cost));
            System.out.println("Successfully added the Consultation");
        }
    }

    public void encryption (){
        try {
            FileInputStream file = new FileInputStream(selectedImagePath);
            FileOutputStream outputStream = new FileOutputStream("EncrptedPic.jpg");
            byte k [] = "Dula1234".getBytes();
            SecretKeySpec key = new SecretKeySpec(k , "DES");
            Cipher enc = Cipher.getInstance("DES");
            enc.init(Cipher.ENCRYPT_MODE, key);
            CipherOutputStream cos = new CipherOutputStream(outputStream , enc);
            byte [] buf = new byte [1024];
            int read;
            while ((read = file.read(buf)) !=-1 ){
                cos.write(buf , 0 , read);
            }
            file.close();
            outputStream.flush();
            cos.close();
            JOptionPane.showMessageDialog(null, " The image successfuly encrypted ");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
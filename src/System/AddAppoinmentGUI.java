package System;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    private JLabel background;
    private JPanel jPanel1;
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
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        background = new JLabel();
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

        background.setIcon(new ImageIcon("2044500a9a0cef20ef935c31946538a1.gif"));

        jLabel1.setText("Search Patient's details");
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Patient Name :");
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Patient ID :");
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));

        txtPName.setText("jTextField1");
        txtPName.setForeground(new java.awt.Color(204, 204, 204));
        txtPName.setOpaque(false);
        txtPName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtPName);
            }
        });

        txtPID.setText("jTextField2");
        txtPID.setForeground(new java.awt.Color(204, 204, 204));
        txtPID.setOpaque(false);
        txtPID.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtPID);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Patient Name", "Patient Surname", "Patient Number", "Patient ID", "Patient Address"
                }
        ));
        jTable1.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setOpaque(false);
        jTable1.setForeground(new Color(255,255,255));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(232, 174, 2, 203));
        jTable1.getTableHeader().setForeground(Color.white);

        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jButton1.setText("Search");
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setBackground(new Color(232, 174, 2, 203));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchPatients();
            }
        });
        jButton2.setText("Back");
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setBackground(new Color(232, 174, 2, 203));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI gui = new GUI();
                gui.show();

                dispose();
            }
        });

        jLabel4.setText("Add a Appoinment");
        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("Date :");
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Doctor Lincence :");
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Time Slot Number :");
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setText("Patient ID :");
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Note :");
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("Your Cost is :");
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));

        txtAppDate.setText("jTextField1");
        txtAppDate.setForeground(new java.awt.Color(204, 204, 204));
        txtAppDate.setOpaque(false);
        txtAppDate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtAppDate);
            }
        });

        txtAppPID.setText("jTextField2");
        txtAppPID.setForeground(new java.awt.Color(204, 204, 204));
        txtAppPID.setOpaque(false);
        txtAppPID.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtAppPID);
            }
        });

        txtTSlotNo.setText("jTextField3");
        txtTSlotNo.setForeground(new java.awt.Color(204, 204, 204));
        txtTSlotNo.setOpaque(false);
        txtTSlotNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtTSlotNo);
            }
        });

        txtAppNote.setColumns(20);
        txtAppNote.setRows(5);
        txtAppNote.setForeground(new java.awt.Color(204, 204, 204));
        txtAppNote.setBackground(new Color(0,0,0,64));
        txtAppNote.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxtArea(txtAppNote);
            }
        });

        jScrollPane3.setViewportView(txtAppNote);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setOpaque(false);

        AddAppButton.setText("Add a appoinment");
        AddAppButton.setForeground(new java.awt.Color(204, 204, 204));
        AddAppButton.setBackground(new Color(232, 174, 2, 203));
        AddAppButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConsultation();
                encryption();
            }
        });

        txtAppDLic.setText("jTextField1");
        txtAppDLic.setForeground(new java.awt.Color(204, 204, 204));
        txtAppDLic.setOpaque(false);
        txtAppDLic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtAppDLic);
            }
        });

        jLabel11.setText("Consultation ID :");
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));

        txtAppConsultation.setText("jTextField1");
        txtAppConsultation.setForeground(new java.awt.Color(204, 204, 204));
        txtAppConsultation.setOpaque(false);
        txtAppConsultation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleartxt(txtAppConsultation);
            }
        });

        jButton3.setText("Browse");
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setBackground(new Color(232, 174, 2, 203));
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
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(249, 249, 249))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3)
                                                .addGap(320, 320, 320)
                                                .addComponent(AddAppButton)
                                                .addGap(86, 86, 86)
                                                .addComponent(jButton2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txtAppPID)
                                                                                .addComponent(txtAppConsultation)
                                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(89, 89, 89)
                                                                                .addComponent(jLabel10)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(txtAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtAppDLic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTSlotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                .addGap(98, 98, 98)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(160, 160, 160))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jButton1)
                                                                                .addGap(22, 22, 22)))))))
                                .addGap(44, 44, 44))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(background)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAppDLic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTSlotNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAppPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAppConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel10)))
                                                .addGap(18, 18, 18))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(AddAppButton)
                                        .addComponent(jButton3))
                                .addGap(42, 42, 42))
                        .addComponent(background)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private JTextField cleartxt(JTextField evt) {
        evt.setText(" ");
        return evt;
    }
    private JTextArea cleartxtArea(JTextArea evt) {
        evt.setText(" ");
        return evt;
    }
}
package System;

import java.io.*;
import java.text.ParseException;
import java.util.*;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    static List<Consultation> consultations = new ArrayList<>();
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        WestminsterSkinConsultationManager wscm = new WestminsterSkinConsultationManager();
        wscm.loadDoctor(); // call to doctors load method
        wscm.loadPatient(); // call to patients load method
        wscm.loadConsultation(); // call to consultations load method
        wscm.printMenu(); // call to menu method
    }

    public void printMenu() {
        while (true) {
            String menuInput;
            System.out.print("\n----------------Welcome to Westminter Skin Consultation Manager software----------------\n" +
                    "Use A key to add a new doctor \n" +
                    "Use D key to delete a doctor \n" +
                    "Use P key to print the list of the doctors \n" +
                    "Use S key to save data to file\n" +
                    "Use G key to open the Graphical user interface(GUI)\n" +
                    "Use X key to exit the programme\n" +
                    "Use J Key to print the patients list \n" +
                    "Use E Key to Add a patients \n" +
                    "Use Q Key to Delete a patients \n" +
                    "Use C Key to Add a appoinment \n" +
                    "Use V Key to Viwe appoinment \n" +
                    "Use H Key to delete appoinment \n" +
                    "> ");
            menuInput = userInput.next();
            menuInput = menuInput.toLowerCase();
            switch (menuInput) {
                case "a":
                    addDoctor();
                    break;
                case "d":
                    deleteDoctor();
                    break;
                case "p":
                    printDoctor();
                    break;
                case "s":
                    saveDoctor();
                    savePatient();
                    saveConsultation();
                    break;
                case "g":
                    alphabeticalOrder();
                    GUI gui = new GUI();
                    gui.setVisible(true);
                    break;
                case "x":
                    exit();
                case "j":
                    printPatients();
                    break;
                case "e":
                    addPatient();
                    break;
                case "q":
                    deletePatient();
                    break;
                case "c":
                    addConsultation();
                    break;
                case "v":
                    viewConsultations();
                    break;
                case "h":
                    deleteConsultation();
                    break;
            }
        }
    }

    public void addDoctor() { // add a doctor method
        int count = 0;
        for (int i = 0; i < doctors.size(); i++) { // get a count of doctor arraylist
            count = i + 1;
        }
        if (count < 10) { // check the count
            System.out.printf("Enter Doctor fist name :");
            String name = userInput.next();
            System.out.printf("Enter Doctor surname :");
            String surname = userInput.next();
            System.out.printf("Enter Doctor date of date :");
            String dateOfBirth = userInput.next();
            System.out.printf("Enter Doctor mobile number :");
            int number = userInput.nextInt();
            System.out.printf("Enter Doctor licence no :");
            String licenceNo = userInput.next();
            System.out.printf("Enter Doctor specilisation :");
            String specilisation = userInput.next();
            Doctor doctor = new Doctor();
            doctor.setName(name);
            doctor.setSurname(surname);
            doctor.setDateOfBirth(dateOfBirth);
            doctor.setMobileNo(number);
            doctor.setLinecenceNo(licenceNo);
            doctor.setSpecialisation(specilisation);
            doctors.add(doctor);
        } else {
            System.out.println("Already Doctor count 10 exist");
            System.out.println("Please Delete a unvalid Doctor to add another Doctor");
        }
    }

    public void printDoctor() { // print doctors one by one
        alphabeticalOrder();
        int Number = 0;
        int count = 0;
        for (int i = 0; i < doctors.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            for (Doctor doctor : doctors) {
                Number += 1;
                System.out.println("------------------------ Doctor " + Number + " ------------------------------");
                System.out.print(
                                "Name           :" + doctor.getName() + "\n" +
                                "Surname        :" + doctor.getSurname() + "\n" +
                                "Date Of Birth  :" + doctor.getDateOfBirth() + "\n" +
                                "Phone Number   :" + doctor.getMobileNo() + "\n" +
                                "Linecence No   :" + doctor.getLinecenceNo() + "\n" +
                                "Specialisation :" + doctor.getSpecialisation() + "\n");
                System.out.println("-----------------------------------------------------------------");
            }
        } else { // if there are don't have a doctor to show
            System.out.println("There are no doctors available to show");
        }
    }

    public void alphabeticalOrder() { // this method user for sort doctor arraylist to alphabetical order
        doctors.sort(Comparator.comparing(Doctor::getName));

    }

    public void deleteDoctor() { // delete a doctor for system method
        int count = 0;
        for (int i = 0; i < doctors.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            System.out.print("Enter the doctor LinecenceNo to delete :\n> ");
            String licNo = userInput.next();
            Iterator<Doctor> iterator = doctors.iterator();
            while (iterator.hasNext()) {
                Doctor doctor = iterator.next();
                if (licNo.equalsIgnoreCase(doctor.getLinecenceNo())) {
                    System.out.println(
                            "Name           :" + doctor.getName() + "\n" +
                                    "Surname        :" + doctor.getSurname() + "\n" +
                                    "Date Of Birth  :" + doctor.getDateOfBirth() + "\n" +
                                    "Phone Number   :" + doctor.getMobileNo() + "\n" +
                                    "Linecence No   :" + doctor.getLinecenceNo() + "\n" +
                                    "Specialisation :" + doctor.getSpecialisation() + "\n"
                    );
                    iterator.remove();
                    System.out.println("Doctor is deleted");
                }
            }
        } else { // if there are don't have a doctor to delete
            System.out.println("There are no doctors available to delete");
        }
    }

    public void exit() { // stop the programme method
        saveDoctor();
        savePatient();
        saveConsultation();
        System.exit(0);
    }

    public void saveDoctor() { // save doctor arraylist to file
        JSONArray doctor3 = new JSONArray(); // create a Json array object

        for (Doctor doctor : doctors) {
            JSONObject doctorDetails = new JSONObject();
            doctorDetails.put("Name", doctor.getName());
            doctorDetails.put("surname", doctor.getSurname());
            doctorDetails.put("dateOfBirth", doctor.getDateOfBirth());
            doctorDetails.put("mobilenumber", doctor.getMobileNo());
            doctorDetails.put("licnecence", doctor.getLinecenceNo());
            doctorDetails.put("specislisation", doctor.getSpecialisation());

            JSONObject doctorObject = new JSONObject(); // create a Json array object
            doctorObject.put("doc", doctorDetails);
            doctor3.add(doctorObject);
        }

        //Write JSON file
        try (FileWriter file = new FileWriter("Doctors.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(doctor3.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDoctor() { // load to doctor arraylist from json file

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Doctors.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray doctor3 = (JSONArray) obj;

            //Iterate over employee array
            doctor3.forEach(doc -> {
                try {
                    parseDoctorObject((JSONObject) doc);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

    }

    private void parseDoctorObject(JSONObject doc) throws ParseException {
        JSONObject docObject = (JSONObject) doc.get("doc");
        String getName = (String) docObject.get("Name");
        String getSurname = (String) docObject.get("surname");
        String getDateOfBirth = (String) docObject.get("dateOfBirth");
        Long getMobileNo = (Long) docObject.get("mobilenumber");
        String getLinecenceNo = (String) docObject.get("licnecence");
        String getspecislisation = (String) docObject.get("specislisation");

        doctors.add(new Doctor(getName, getSurname, getDateOfBirth, getMobileNo.intValue(), getLinecenceNo, getspecislisation));

    }

    public void printPatients() { // print all patients
        alphabeticalOrder();
        int Number = 0;
        int count = 0;
        for (int i = 0; i < patients.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            for (Patient patient : patients) {
                Number += 1;
                System.out.println("------------------------ Patient " + Number + " ------------------------------");
                System.out.print(
                        "Name           :" + patient.getName() + "\n" +
                                "Surname        :" + patient.getSurname() + "\n" +
                                "Date Of Birth  :" + patient.getDateOfBirth() + "\n" +
                                "Phone Number   :" + patient.getMobileNo() + "\n" +
                                "ID             :" + patient.getPatientID() + "\n" +
                                "Address        :" + patient.getAddress() + "\n");
                System.out.println("-----------------------------------------------------------------");
            }
        } else {
            System.out.println("There are no patient available to show");
        }
    }

    public void addPatient() { // add a patient to system
        System.out.print("Enter Patient fist name :");
        String pname = userInput.next();
        System.out.print("Enter Patient surname :");
        String psurname = userInput.next();
        System.out.print("Enter Patient date of date :");
        String pdateOfBirth = userInput.next();
        System.out.print("Enter Patient mobile number :");
        int pnumber = userInput.nextInt();
        System.out.print("Enter Patient ID :");
        String pid = userInput.next();
        System.out.print("Enter Patient address :");
        String paddress = userInput.next();
        Patient patient = new Patient();
        patient.setName(pname);
        patient.setSurname(psurname);
        patient.setDateOfBirth(pdateOfBirth);
        patient.setMobileNo(pnumber);
        patient.setPatientID(pid);
        patient.setAddress(paddress);
        patients.add(patient);
    }

    public void deletePatient() { // delete a patient from the system
        int count = 0;
        for (int i = 0; i < patients.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            System.out.print("Enter the patient ID to delete :\n> ");
            String licNo = userInput.next();
            Iterator<Patient> iterator = patients.iterator();
            while (iterator.hasNext()) {
                Patient patient = iterator.next();
                if (licNo.equalsIgnoreCase(patient.getPatientID())) {
                    iterator.remove();
                    System.out.println("Patient is deleted");
                }
            }
        } else {
            System.out.println("There are no Patient available to delete");
        }
    }

    public void savePatient() { // save patient details to json file
        JSONArray patient1 = new JSONArray();

        for (Patient patient : patients) {
            JSONObject patientDetails = new JSONObject();
            patientDetails.put("Name", patient.getName());
            patientDetails.put("surname", patient.getSurname());
            patientDetails.put("dateOfBirth", patient.getDateOfBirth());
            patientDetails.put("mobilenumber", patient.getMobileNo());
            patientDetails.put("id", patient.getPatientID());
            patientDetails.put("address", patient.getAddress());

            JSONObject patientObject = new JSONObject();
            patientObject.put("pat", patientDetails);
            patient1.add(patientObject);
        }

        //Write JSON file
        try (FileWriter file = new FileWriter("Patients.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(patient1.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadPatient() { // load patient data from json file

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Patients.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray patient1 = (JSONArray) obj;

            //Iterate over employee array
            patient1.forEach(pat -> {
                try {
                    parsePatientObject((JSONObject) pat);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

    }

    private void parsePatientObject(JSONObject doc) throws ParseException {
        JSONObject patObject = (JSONObject) doc.get("pat");
        String getName = (String) patObject.get("Name");
        String getSurname = (String) patObject.get("surname");
        String getDateOfBirth = (String) patObject.get("dateOfBirth");
        Long getMobileNo = (Long) patObject.get("mobilenumber");
        String getPatientID = (String) patObject.get("id");
        String getAddress = (String) patObject.get("address");

        patients.add(new Patient(getName, getSurname, getDateOfBirth, getMobileNo.intValue(), getPatientID, getAddress));
    }

    public void addConsultation() { // add consultation to system
        System.out.print("Enter Date :");
        String Date = userInput.next();
        System.out.print("Enter Doctor Licnecence :");
        String DLic = userInput.next();
        System.out.print("Enter Patient ID :");
        String PId = userInput.next();
        System.out.print("Enter Consultation ID :");
        String ConId = userInput.next();
        System.out.print("\nChoose your time slot \n" +
                "TIMESLOT 1 : 08.00 AM - 09.00 AM : " + "\n" +
                "TIMESLOT 2 : 09.00 AM - 10.00 AM : " + "\n" +
                "TIMESLOT 3 : 10.00 AM - 11.00 AM : " + "\n" +
                "TIMESLOT 4 : 11.00 AM - 12.00 AM : " + "\n" +
                "TIMESLOT 5 : 12.00 AM - 01.00 PM : " + "\n" +
                "TIMESLOT 6 : 01.00 PM - 02.00 PM : " + "\n" +
                "TIMESLOT 7 : 02.00 PM - 03.00 PM : " + "\n" +
                "TIMESLOT 8 : 03.00 PM - 04.00 PM : " + "\n" +
                "TIMESLOT 9 : 04.00 PM - 05.00 PM : " + "\n" +
                "Enter You want time slot : \n");
        int timeSlotNumber = userInput.nextInt();
        System.out.print("Enter Consultation Note :");
        String Note = userInput.next();
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
        System.out.println("The cost of the consultation is $" + cost);
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

    public void viewConsultations() { // viwe the consaltations one by one
        int Number = 0;
        int count = 0;
        for (int i = 0; i < consultations.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            for (Consultation consultation : consultations) {
                Number += 1;
                System.out.println("------------------------ Appoinment " + Number + " ------------------------------");
                System.out.print(
                        "Patient ID           :" + consultation.getPatientID() + "\n" +
                                "Doctor Lincence      :" + consultation.getDoctorLic() + "\n" +
                                "Date Of Appoinment   :" + consultation.getDate() + "\n" +
                                "Appoinment ID        :" + consultation.getConsultationID() + "\n" +
                                "Appoinment Number    :" + consultation.timeSlot.getTime_slot_ID() + "\n" +
                                "Appoinment Note      :" + consultation.getNote() + "\n" +
                                "Appoinment Cost      : £" + consultation.getCost() + "\n"
                );
                System.out.println("-----------------------------------------------------------------");
            }
        } else {
            System.out.println("There are no Appoinment available to show");
        }
    }

    public void deleteConsultation() { //cancel consultation
        int count = 0;
        for (int i = 0; i < consultations.size(); i++) {
            count = i + 1;
        }
        if (count != 0) {
            System.out.print("Enter the consultation ID to delete :\n> ");
            String conID = userInput.next();
            Iterator<Consultation> iterator = consultations.iterator();
            while (iterator.hasNext()) {
                Consultation consultation = iterator.next();
                if (conID.equalsIgnoreCase(consultation.getConsultationID())) {
                    iterator.remove();
                    System.out.println(conID + " Consultation is canceled");
                }
            }
        } else {
            System.out.println("There are no consultation available to delete");
        }
    }

    public void saveConsultation() { // save consultation to json file
        JSONArray Consultation1 = new JSONArray();

        for (Consultation consultation : consultations) {
            JSONObject consultationDetails = new JSONObject();
            consultationDetails.put("DoctorID", consultation.getDoctorLic());
            consultationDetails.put("PatientsID", consultation.getPatientID());
            consultationDetails.put("ConsultationID", consultation.getConsultationID());
            consultationDetails.put("Date", consultation.getDate());
            consultationDetails.put("TimeSlot", consultation.timeSlot.getTime_slot_ID());
            consultationDetails.put("Note", consultation.getNote());
            consultationDetails.put("Cost", consultation.getCost());

            JSONObject doctorObject = new JSONObject();
            doctorObject.put("con", consultationDetails);
            Consultation1.add(doctorObject);
        }

        //Write JSON file
        try (FileWriter file = new FileWriter("Consultations.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(Consultation1.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadConsultation() { // load consultation data from json file

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Consultations.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray consultationDetails1 = (JSONArray) obj;

            //Iterate over employee array
            consultationDetails1.forEach(con -> {
                try {
                    parseConsultationObject((JSONObject) con);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

    }

    private void parseConsultationObject(JSONObject doc) throws ParseException {
        JSONObject conObject = (JSONObject) doc.get("con");
        String getDoctorLic = (String) conObject.get("DoctorID");
        String getPatientID = (String) conObject.get("PatientsID");
        String getConsultationID = (String) conObject.get("ConsultationID");
        String getDate = (String) conObject.get("Date");
        Long getTime_slot_ID = (Long) conObject.get("TimeSlot");
        String getNote = (String) conObject.get("Note");
        double getCost = (double) conObject.get("Cost");

        consultations.add(new Consultation(getDoctorLic, getPatientID, getConsultationID, getDate, getTime_slot_ID.intValue(), getNote,getCost));
    }
}
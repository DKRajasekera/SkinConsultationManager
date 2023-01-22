package System;

import java.text.ParseException;

public class Patient extends Person {
    private String PatientID;
    private String Address;

    public Patient(String name, String surname, String dateOfBirth, int mobileNo, String patientID, String address) throws ParseException {
        super(name, surname, dateOfBirth, mobileNo);
        this.setPatientID(patientID);
        this.setAddress(address);
    }

    public Patient() {

    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String patientID) {
        PatientID = patientID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}

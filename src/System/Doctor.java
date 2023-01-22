package System;

public class Doctor extends Person {
    private String Specialisation;
    private String LinecenceNo;


    public Doctor(String name, String surname, String dateOfBirth, int mobileNo, String lincenceNO, String specialisation) {
        super(name, surname, dateOfBirth, mobileNo);
        this.setLinecenceNo(lincenceNO);
        this.setSpecialisation(specialisation);
    }

    public Doctor() {

    }

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }

    public String getLinecenceNo() {
        return LinecenceNo;
    }

    public void setLinecenceNo(String linecenceNo) {
        LinecenceNo = linecenceNo;
    }
}


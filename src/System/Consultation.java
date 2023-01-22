package System;


public class Consultation {
    String DoctorLic;
    String PatientID;
    String ConsultationID;
    String Date;
    TimeSlot timeSlot;
    String Note;
    double Cost;


    public Consultation(String doctorLic, String patientID, String consultationID, String date, int time_slot_id, String note, double cost) {
        this.setDoctorLic(doctorLic);
        this.setPatientID(patientID);
        this.setConsultationID(consultationID);
        this.setDate(date);
        this.timeSlot = new TimeSlot(time_slot_id);
        this.setNote(note);
        this.setCost(cost);
    }

    public Consultation() {

    }

    public String getDoctorLic() {
        return DoctorLic;
    }

    public void setDoctorLic(String doctorLic) {
        DoctorLic = doctorLic;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String patientID) {
        PatientID = patientID;
    }

    public String getConsultationID() {
        return ConsultationID;
    }

    public void setConsultationID(String consultationID) {
        ConsultationID = consultationID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
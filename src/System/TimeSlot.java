package System;

public class TimeSlot {

    private String date;
    private String S_Time;
    private String E_Time;
    private int time_slot_ID;
    private boolean availablty; //if this true it taken if it false it available

    public TimeSlot(String date, String s_Time, String e_Time) {
        this.date = date;
        this.S_Time = s_Time;
        this.E_Time = e_Time;
    }

    public TimeSlot(int time_slot_ID) {
        this.time_slot_ID = time_slot_ID;
        this.availablty = true;
        switch (time_slot_ID) {
            case 1:
                this.S_Time = " 08.00 AM ";
                this.E_Time = " 09.00 AM ";
                break;
            case 2:
                this.S_Time = " 9.00 AM ";
                this.E_Time = " 10.00 AM ";
                break;
            case 3:
                this.S_Time = " 10.00 AM ";
                this.E_Time = " 11.00 AM ";
                break;
            case 4:
                this.S_Time = " 11.00 PM ";
                this.E_Time = " 12.00 PM ";
                break;
            case 5:
                this.S_Time = " 12.00 PM ";
                this.E_Time = " 01.00 PM ";
                break;
            case 6:
                this.S_Time = " 01.00 PM ";
                this.E_Time = " 02.00 PM ";
                break;
            case 7:
                this.S_Time = " 02.00 PM ";
                this.E_Time = " 03.00 PM ";
                break;
            case 8:
                this.S_Time = " 03.00 PM ";
                this.E_Time = " 04.00 PM ";
                break;
            case 9:
                this.S_Time = " 04.00 PM ";
                this.E_Time = " 05.00 PM ";
                break;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getS_Time() {
        return S_Time;
    }

    public void setS_Time(String s_Time) {
        S_Time = s_Time;
    }

    public String getE_Time() {
        return E_Time;
    }

    public void setE_Time(String e_Time) {
        E_Time = e_Time;
    }

    public int getTime_slot_ID() {
        return time_slot_ID;
    }

    public void setTime_slot_ID(int time_slot_ID) {
        this.time_slot_ID = time_slot_ID;
    }

    public boolean isAvailablty() {
        return availablty;
    }

    public void setAvailablty(boolean availablty) {
        this.availablty = availablty;
    }

}

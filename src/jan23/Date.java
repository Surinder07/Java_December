package jan23;

public class Date {
    int day;
    int month;
    int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public Date(int day) {
        this.day = day;
    }

    public void printDate(){
        System.out.println("Date : " + day + " / "+ month + " / "+ year);
    }
}






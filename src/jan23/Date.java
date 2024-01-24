package jan23;

public class Date {
    int day;
    int month;
    int year;

    // default const
    //1
    public Date(){
        day = 23;
        month = 01;
        year = 2024;
    }
    //2
    public Date(int day, int month){
         // calling default const
        this();
        this.day = day;
        this.month = month;

    }
    //3
    public Date(int day, int month, int year){
        this(day, month);// const call
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate(){
        System.out.println("Date : " + day + " / "+ month + " / "+ year);
    }
}






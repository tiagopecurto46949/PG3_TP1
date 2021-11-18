package Trab1.Grupo4;

public class Date implements Comparable<Date>{

    int day, month, year;


    public Date(){};

    public Date(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int compareTo(Date d){
        int deltaYears = this.year - d.year;
        int deltaMonths = this.month - d.month;
        int deltaDays = this.day - d.day;

        if (deltaYears != 0) return deltaYears;
        if (deltaMonths != 0) return deltaMonths;

    return deltaDays;
    }

    public String toString() {return "Data:" + this.day + "/"+ this.month + "/" + this.year; }
}

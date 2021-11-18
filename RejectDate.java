package Trab1.Grupo4;

public abstract class RejectDate implements RejectionRule{
    Date date;

    public RejectDate(Date d){
        this.date = d;
    }

    public boolean reject (User u){
        if(u.creationDate.compareTo(date) < 0) return true;
    return false;
    }

    public String getDescription(){
        return "Creation date less than" + this.date;
    }
}

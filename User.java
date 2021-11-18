package Trab1.Grupo4;

import java.awt.*;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public abstract class User implements Comparable<User>{

    public String name;
    public String nickName;
    public int likes;
    public final Date creationDate;


    protected User (String name, String nickName){
        this.name = name;
        this.nickName = nickName;
        this.creationDate = new Date();
    }

    public int incLikes(){return likes++;}

    public int getLikes(){return this.likes;}

    public String getDescription(String prefix){return "(" + prefix.toUpperCase() + this.nickName.toUpperCase() + ")"; }

    @Override
    public int compareTo(User u) {
        return this.likes - u.likes;
    }

    public abstract List getFriends(Predicate<User> f);

    public final String toString(){ return getDescription("");}

}

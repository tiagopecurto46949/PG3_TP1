package Trab1.Grupo4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SocialUser extends User{

    private RejectionRule rules[];
    private List<User> friends = new ArrayList<>();
    private User user;


    public SocialUser(String name, String nickName, RejectionRule ... rules){
        super(name, nickName);
        this.rules = rules;
    }

    public SocialUser(String name){
        super(name,name.substring(0,3));
        this.rules = new RejectionRule[0]; //ARRAY VAZIO
    }

    public RejectionRule friendRequest(SocialUser other){
        for (RejectionRule rule : rules) {
            if(rule.reject(other)) return rule;
        }
        friends.add(other);

        return null;
    }

    @Override
    public List getFriends(Predicate<User> f) {
        return null;
    }
}

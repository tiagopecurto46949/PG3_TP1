package Trab1.Grupo4;

public class RuleException extends Exception{

    public RejectionRule rule;

    public RuleException(String msg, RejectionRule r){
        super(msg + "\"" + r + "\"");
    }

    public RuleException(RejectionRule r){
        super("Rejected user by rule:" + "\"" + r + "\"");
    }

    public RejectionRule getRule(){return this.rule;};
}

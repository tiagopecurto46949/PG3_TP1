package Trab1.Grupo2;

public class PathException extends Exception{
    public PathException(){
        super("Ligação inválida");
    }
    public PathException(String mensage){
        super(mensage);
    }
}

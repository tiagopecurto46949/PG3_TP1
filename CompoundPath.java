package Trab1.Grupo2;

import java.util.Arrays;

public class CompoundPath extends Path{
    protected Path[] paths;


    //Construtor

    public CompoundPath (int n, Path ... paths) throws PathException {

        super(sumDistances(n,paths));
        this.paths = Arrays.copyOf(paths,n);

        if(n < 2 || n > paths.length) throw new PathException("Número de ligações inválido");

        for (int i = 0; i < paths.length; i++) {
            if((i+1) < paths.length){
                if(paths[i].getLastPlace().equals(paths[i+1].getFirstPlace())){
                    throw new PathException();
                };
            }
        }

    }

    @Override
    public Place getFirstPlace() {
        return this.paths[0].getFirstPlace();
    }

    @Override
    public Place getLastPlace() {
        return this.paths[paths.length-1].getLastPlace();
    }

    @Override
    public Place[] getPlaces() {



        return new Place[0];
    }

    public String toString(){
        String ret = "System.out.println(\"Localidade1 ->\");";
    return ret;};
}

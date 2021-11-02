package Trab1.Grupo2;

import java.nio.file.InvalidPathException;

public abstract class Path  {

    private final double distance;      // Distância entre as localidades terminais
    protected Path(double distance) {this.distance = distance;};
    public abstract Place getFirstPlace(); // Localidade inicial da ligação
    public abstract Place getLastPlace();  // Localidade final da ligação
    public abstract Place[] getPlaces();   // Array (sem repetições) com as localidades da ligação
    public String toString() {
        return getFirstPlace().getName() + " -> " + getLastPlace().getName() + ": " + distance + "Km";
    }
    public static double sumDistances(int n, Path... paths) throws PathException {
        double sumDist = 0;

        if(n > paths.length) throw new PathException("Número de ligações inválido");

        for (int i = 0; i < paths.length; i++) {
            if((i+1) < paths.length){
                if(paths[i].getLastPlace().equals(paths[i+1].getFirstPlace())){
                    throw new PathException();
                };
            }
            sumDist += paths[i].distance;
        }
        return sumDist;
    }
}


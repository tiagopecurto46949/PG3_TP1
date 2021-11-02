package Trab1.Grupo2;

public class SimplePath extends Path{
    private Place first;
    private Place last;

    //Construtor
    public SimplePath ( Place f, Place l, double d){
        super(d);                                   //faz ligação para o contrutor de Path (Classe Base)
        this.first = f;
        this.last = l;
    }

    @Override
    public Place getFirstPlace() {
        return this.first;
    }

    public Place getLastPlace() {
        return this.last;
    }

    public Place[] getPlaces() {
        // Place[] places = {this.first, this.last};       // Criar e inicializar um array com 2 elementos
    return new Place[] {this.first, this.last };            // Forma abreviada
    }

}

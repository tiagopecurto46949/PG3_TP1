package Trab1.Grupo1;

public class Print {
    public static void main (String[] args) {

        City c1 = new City("Faro", 64560, 202);
        System.out.println( c1);
        City c2 = new City("Faro", 64560, 202);

        System.out.println( c1 == c2 );
        System.out.println( c1.equals( c2 ) );

        City c3 = c1;

        System.out.println( c1.equals( c3 ) );

        if ( c3 != null )
            System.out.println( c1 == c3);

        System.out.println( "Densidade Populacional:" + c1.populationDensity() );
        System.out.println( "Variação Populacional:" + c1.populationChange(10) );
        System.out.println( c1.compareTo(c2) );
    }
}

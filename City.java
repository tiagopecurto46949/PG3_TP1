package Trab1.Grupo1;

import Trab1.Grupo2.Place;

import static java.lang.Integer.parseInt;

public class City implements Place {

    private final String name, country;
    private int population;
    private final int area; // Em km²

    /* Getters*/
    public String getName() {return name;}
    public String getCountry() {return country;}
    public int getPopulation() {return population;}
    public int getArea() {return area;}

    public String toString(){
        return getCountry() + ":" + getName() + " - "+ getArea() + "km²:"+getPopulation();
    }

    /*Construtor*/
    public City(String nm, int p, int a){
        this(nm,"Portugal", p, a);
    }

    public City(String nm, String country, int p, int a){
        this.name = nm;
        this.country = country;
        this.population = p;
        this.area = a;
    }

    /*métodos de instância*/
    public double populationDensity(){
        return (getPopulation()/getArea());
    }

    public double populationChange (int rate){
        return (getPopulation()*Math.exp(rate));
    }

    public int compareTo(City c2){
        return this.area - c2.area;
    }

    public boolean equals( Object o) {
        if ( o instanceof City) {
            City other = (City) o;
            return ((this.name.equals(other.name) ) && (this.country.equals(other.country)) &&(this.population == other.population) && (this.area == other.area));
        }
        return false;

    }

    public static City getCity(String x){

        int index1= x.indexOf(":",0);
        int index2 = x.indexOf("-",index1 +1);
        int index3 = x.indexOf("k",index2 +1 );
        int index4 = x.indexOf(":",index3 +1 );

        String country = x.substring(0,index1).trim();
        String city = x.substring(index1+1, index2).trim();
        String area = x.substring(index2+1, index3).trim();
        String population = x.substring(index4+1).trim();

        int areaTrimmedInt = parseInt(area);
        int populationTrimmedInt = parseInt(population);

        City newCity = new City (city, country, populationTrimmedInt,areaTrimmedInt);

    return newCity;
    }

    public static int getCountryCitiesCount (City[] cities, String country){
        int count = 0;
        for (int i = 0; i < cities.length; i++){
            if(cities[i].country.equals(country)) count ++;
        }
    return count;}

    /*
    public static City smallerCities (ArrayList<City> cities){

        int n = cities.size();
        City smaller = cities.get(0);

        for (int i = 0; i < n; i++) {
            if(cities.get(i).compareTo(cities.get(i+1)) < 0 )
                smaller = cities.get(i);
        }
    return smaller;}
    */
    public static City smallerCities (City... cities){

        if (cities.length > 0) {
            City minorCity = cities[0];
            for (int i = 0; i < cities.length; i++) {
                if ((minorCity.compareTo(cities[i])) > 0)
                    minorCity = cities[i];
            }
        return minorCity;
        }
    return null;
    }

    static void bubbleSort(City[] cities, int n){
        if(n == 1) return;
        for (int i=0; i<n-1; i++) {
            if (cities[i].compareTo(cities[i+1]) < 0) {
                City temp = cities[i];
                cities[i] = cities[i+1];
                cities[i+1] = temp;
            }
        }
        bubbleSort(cities, n-1);
    }
    public static City[] getTop10(City[] cities){
        if(cities.length <= 1) return null;

        bubbleSort(cities, cities.length);

        City[] top10 = new City[cities.length >= 10 ? 10: cities.length];
        //cities.length => 10 ? City[] top10 = new City[cities.length]:;

        for(int i = 0; i < top10.length; i++){
            top10[i]=cities[i];
        }
    return top10;}

}


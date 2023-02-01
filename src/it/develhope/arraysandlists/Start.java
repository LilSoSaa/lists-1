package it.develhope.arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        // create a not-mutable List
        List<String> cityNames = Arrays.asList("New york", "Tokyo", "London");
        System.out.println("City names: " + cityNames);


        // cityNames.add("Rome");
      //  List<String> newCity = new ArrayList<>(cityNames);
        //cityNames.add("Rome");
        //System.out.println("Cannot add element to an  unmodifiable list!");


        cityNames = new ArrayList<>(cityNames);
        cityNames.set( 1 , "Tegucigalpa");
        System.out.println("City names: " + cityNames);


        System.out.println("-------------------------");
        System.out.println("----The 7 Kings of Rome----");
//mutable list with the 7 kings of Rome


        List<String> kingsOfRome = new ArrayList<>(7);
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println(kingsOfRome);

      //  convert kingsOfRome into an array called kingsOfRomeArray

        String kingsOfRomeArray[] = kingsOfRome.toArray(new String[0]);

         kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("Kings of Rome Variation: " + Arrays.toString(kingsOfRomeArray));
    }






}




        // create a not-mutable List
        

        /*
         * The following line of code is commented because it throws an UnsupportedOperationException.
         * An exception is thrown because .add() is not supported method on a not mutable List.
         */
        // cityNames.add("Rome");

        // set is an allowed method on a not mutable List
        
        // create an empty mutable List
        

        // let's add all the 7 kings of Rome
        

        

        // do the conversion and the type of the array is defined using `new String[0]`
        

        // edit the 7th king's value
        

        

package pl.javastart.task;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList();
        customListOfStrings.add("Kot");
        customListOfStrings.add("pies");
        customListOfStrings.add("ryś");
        System.out.println(customListOfStrings.size());
        customListOfStrings.add("ptak");
        customListOfStrings.add("orzeł");
        customListOfStrings.add("karzeł");
        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings.size());
        customListOfStrings.remove(4);
        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings.size());
        customListOfStrings.add(2, "Zbigniew Zero");
        System.out.println(customListOfStrings);

        CustomList<Integer> customListOfIntegers = new CustomList();
        customListOfIntegers.add(1);
        System.out.println(customListOfIntegers.size());
        customListOfIntegers.add(2);
        customListOfIntegers.add(3);
        customListOfIntegers.add(4);
        System.out.println(customListOfIntegers);
        System.out.println(customListOfIntegers.size());
        customListOfIntegers.add(1, 50);
        System.out.println(customListOfIntegers);
        System.out.println(customListOfIntegers.size());
        customListOfIntegers.remove(1);
        System.out.println(customListOfIntegers);
        System.out.println(customListOfIntegers.size());
    }
}

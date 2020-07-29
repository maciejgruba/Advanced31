package pl.sda.advanced.collections;

import pl.sda.advanced.oop2.Countries;
import pl.sda.advanced.oop2.Person;
import pl.sda.advanced.oop2.Student;
import pl.sda.advanced.oop2.Worker;

import java.math.BigDecimal;
import java.util.*;

public class CollectionsMain {

    private static String text1 = "Napis1";
    private static String text2 = "Napis2";
    private static String text3 = "Napis3";
    private static String text4 = "Napis4";
    private static String text5 = "Napis5";
    private static String text6 = "Napis6";

    private static Student student = new Student("Jan","Nowak", BigDecimal.valueOf(200), Countries.POLAND);
    private static Worker worker = new Worker("Paweł", "Kowalski", BigDecimal.valueOf(5000), Countries.FRANCE);

    private static Plane first = new Plane("Boeing", 12,123);
    private static Plane second = new Plane("Boeing", 12,123);
    private static Plane third = new Plane("AirBus", 15,124);
    public static void main(String[] args) {

        arrayList();
        peopleArrayList();
        hashSetBasic();
        planeHashSet();
        treeSetBasic();
        planeTreeSet();
        planeHashMap();


    }

    private static void planeHashMap() {
        Map<Integer, Plane> planeHashMap = new HashMap<>();
        System.out.println(planeHashMap.put(first.getPlaneID(), first));
        System.out.println(planeHashMap.put(second.getPlaneID(), second));
        System.out.println(planeHashMap.put(third.getPlaneID(), third));
        System.out.println(planeHashMap.size());
    }

    private static void planeTreeSet() {
        Set<Plane> planes = new TreeSet<>(); // w tym przypadku elementy zostana posortowne wedlug naszej implementacji interfejsu( compareTo)
        planes.add(first);
        planes.add(second);
        planes.add(third);
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    private static void treeSetBasic() {
        Set<String> treeSet = new TreeSet<>(); // sortuje dodawane elementy według ustalonej klasy i metody compareTo w tej klasie
        treeSet.add(text2);
        treeSet.add(text1);
        treeSet.add(text5);
        treeSet.add(text4);
        treeSet.add(text2);
        System.out.println(treeSet.size());
        for (String element : treeSet) {
            System.out.println(element);
        }
    }

    private static void planeHashSet() {
        Set<Plane> planes = new HashSet<>();
        Plane first = new Plane("Boeing", 12,123);
        Plane second = new Plane("Boeing", 12,123);
        Plane third = new Plane("AirBus", 15,124);
        planes.add(first);
        planes.add(second);
        planes.add(third);
        System.out.println(planes.size());

        System.out.println(first.equals(third));
        System.out.println(first.equals(second));
    }

    private static void hashSetBasic() {
        Set<String> hashSet = new HashSet<>();
        System.out.println(hashSet.add(text1));
        System.out.println(hashSet.add(text1));
        System.out.println(hashSet.add(text2));
        System.out.println(hashSet.size());
    }

    private static void peopleArrayList() {
        List<Person> people = new ArrayList<>();
        people.add(student);
        people.add(worker);
        people.add(worker);
        for (Person person : people) {
            System.out.println(person.getLastName());
        }
        System.out.println(people.get(1));
    }

    private static void arrayList() {
        String text1 = "Napis1";
        String text2 = "Napis2";
        String text3 = "Napis3";

        List<String> arrayList = new ArrayList<>();
        arrayList.add(text1);
        arrayList.add(text2);
        arrayList.add(text3);
        System.out.println(arrayList.toString());

        for (String text : arrayList) {
            System.out.println(text);

        }

        List<String> secondArrayList = new ArrayList<>();
        String text4 = "Napis4";
        String text5 = "Napis5";
        String text6 = "Napis6";
        secondArrayList.add(text4);
        secondArrayList.add(text5);
        secondArrayList.add(text6);


        List<String> thirdArrayList = new ArrayList<>();
        thirdArrayList.addAll(arrayList);
        thirdArrayList.addAll(secondArrayList);
        System.out.println(thirdArrayList);

        thirdArrayList.addAll(arrayList);
        System.out.println(thirdArrayList);


        System.out.println(thirdArrayList.contains(text6));
        thirdArrayList.remove(text6);
        System.out.println(thirdArrayList.contains(text6));
    }
}

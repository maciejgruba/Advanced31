package pl.sda.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMain {

    private static String text1 = "Napis1";
    private static String text2 = "Napis2";
    private static String text3 = "Napis3";
    private static String text4 = "Napis4";
    private static String text5 = "Napis5";
    private static String text6 = "Napis6";

    public static void main(String[] args) {
        arrayList();
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

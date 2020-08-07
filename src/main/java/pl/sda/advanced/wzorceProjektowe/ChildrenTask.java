package pl.sda.advanced.wzorceProjektowe;

import java.util.Scanner;


public class ChildrenTask {
    public static void main(String[] args) {

        String menu = "Dokonaj wyboru \n 1.dodaj dziecko....";
        Scanner scanner = new Scanner(System.in);
        IChildren children = new ChildrenListImpl();
        System.out.println("Witaj w programie");

        while (true){
            System.out.println(menu);

            String menuPosition = scanner.nextLine();
            switch (menuPosition){
                case"1":
                    System.out.println("Podaj imie dziecka");
                    String name = scanner.nextLine();
                    System.out.println("dodaj dziecko " + name);
                    children.addChildren(name);
                    break;
                case "2":
                    System.out.println(children.getChildren());
            }
        }
    }
}

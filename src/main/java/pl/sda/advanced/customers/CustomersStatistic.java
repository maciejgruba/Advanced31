package pl.sda.advanced.customers;

import java.util.*;
import java.util.stream.Collectors;

public class CustomersStatistic {
    static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250 "),
            new Customer("Adam", "Twardowski", 33, "4100 "),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333),
            new Customer("Adam", "Nowak ", 15, null)
    };

    public static void main(String[] args) {
        for (Customer person : people) {
            System.out.println(person);
        }
        Map<Integer, List<Customer>> salaryMap = collectCustomersUsingSalary();
        System.out.println();
        System.out.println(salaryMap);

        Map<Integer, Long> jakasMapa = collectCustomersWithSalary();
        System.out.println();
        System.out.println(jakasMapa);


    }

    public List<Customer> arrayToList() {
//        List<Customer> result = new ArrayList<>();
//        for (Customer person : people) {
//            result.add(person);
//;        } return result;
//        return Arrays.stream(people)
//                .collect(Collectors.toList());

        return Arrays.asList(people);
    }

    public List<String> customersToNameList() {
        List<Customer> customers = arrayToList();
        return customers.stream()
                .map(customer -> customer.prepareFullName())// na wejsciu do metody mamy Customera ,a chcemy miec imie i nazwisko
                .collect(Collectors.toList());
    }

    public Map<Integer, Customer> customersToMap() {
        Map<Integer, Customer> resultMap = new HashMap<>();
        for (Customer person : people) {
            person.getId();
            resultMap.put(person.getId(), person);
        }
        return resultMap;
    }

    public Map<Integer, Customer> customersToMapWithStream() {
        return arrayToList().stream()
                .collect(Collectors.toMap(customer -> customer.getId(), c -> c));

    }

    //4. Napisz metodę, która zwróci mapę osób według zarobków <zarobki,osoby_z_zarobkami>
    public static Map<Integer, List<Customer>> collectCustomersUsingSalary() {
        Map<Integer, List<Customer>> resultMap = new HashMap<>();
        for (Customer person : people) {
            Integer monthSalary = person.getMonthSalary();
            if (resultMap.containsKey(monthSalary)) {
                List<Customer> customerList = resultMap.get(monthSalary);
                customerList.add(person);
            } else {
                List<Customer> customerList = new ArrayList<>();
                customerList.add(person);
                resultMap.put(monthSalary, customerList);
            }
        }
        return resultMap;

    }

    public static Map<Integer, List<Customer>> collectCustomersUsingSalaryWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy(p -> p.getMonthSalary()));
    }

    // 5. Napisz metodę, która zwróci mapę ile jest osób z danymi zarobkami <zarobki, liczba_osób>
    public static Map<Integer, Long> collectCustomersWithSalary() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy(p -> p.getMonthSalary(), Collectors.counting()));
    }

    //6. Napisz metodę, która zwróci mapę map <imię,<zarobki, liczba_osób_z_takimi_zarobkami>>
    //7. Napisz metodę, która zwróci mapę <imię,<suma_zarobków_osób_o_taki_imieniu>>

    // 8. Napisz metodę, która zwróci kolekcję unikalnych imion posortowanych alfabetycznie, ale malejącej kolejności


}






package pl.sda.advanced.customers;

public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer monthSalary;

    private static Integer counter = 0;

    public Customer(String firstName, String lastName, Integer age, int monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.monthSalary = monthSalary;
        this.id = counter++;
    }

    public Customer(String firstName, String lastName, Integer age, String monthSalary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.monthSalary = parseSalary(monthSalary);
        this.id = counter++;
    }

    private Integer parseSalary(String monthSalary) {
         return monthSalary == null ? 0 : Integer.parseInt(monthSalary.trim());
     //to samo co nizej tylko w wersji ternatu operatorem
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", monthSalary=" + monthSalary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String prepareFullName(){
        return  firstName + " " + lastName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMonthSalary() {
        return monthSalary;
    }
}


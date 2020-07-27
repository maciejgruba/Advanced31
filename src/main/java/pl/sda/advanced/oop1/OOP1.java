package pl.sda.advanced.oop1;

public class OOP1 {
    public static void main(String[] args) {
        immutableExample();

        int sum = CalculatorUtils.sum(4, 2);
        System.out.println(sum);

    }

    private static void immutableExample() {
        PersonTest personTest = new PersonTest();
        personTest.setFirstName("Anna");
        personTest.setLastName("Nowak");
        personTest.setAge(19);

        ExperimentalObject experimentalObject =
                new ExperimentalObject(1,2, personTest);
        System.out.println(experimentalObject);
        PersonTest samePersonTest = experimentalObject.getPersonTest();
        System.out.println(personTest == samePersonTest);
        System.out.println(personTest.equals(samePersonTest));

        System.out.println(personTest);
        personTest.setLastName("Kowalska");
        System.out.println(personTest);

        experimentalObject.setNotFinalImmutable(20);
        System.out.println(experimentalObject);

        Integer finalImmutable = experimentalObject.getFinalImmutable();
        finalImmutable++;
        System.out.println(experimentalObject);
    }
}

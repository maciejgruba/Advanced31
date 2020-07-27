package pl.sda.advanced.oop1;

public class ExperimentalObject {
    private Integer notFinalImmutable; // niezmienne
    private final Integer finalImmutable; // niezmianna klasa Integer
    private final PersonTest personTest; // da się zmienic wartośc, nie da się zmienić referencji

    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, PersonTest personTest) {
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.personTest = personTest;
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }

    public PersonTest getPersonTest() {
        return personTest;
    }

    @Override
    public String toString() {
        return "ExperimentalObject{" +
                "notFinalImmutable=" + notFinalImmutable +
                ", finalImmutable=" + finalImmutable +
                ", person=" + personTest +
                '}';
    }
}

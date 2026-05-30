package students;

import strategy.ArrivalStrategy;

public class Student {

    private String type;
    private ArrivalStrategy arrivalStrategy;

    public Student(String type, ArrivalStrategy arrivalStrategy) {
        this.type = type;
        this.arrivalStrategy = arrivalStrategy;
    }

    public String getType() {
        return type;
    }

    public void arrive() {
        arrivalStrategy.arrive();
    }
}

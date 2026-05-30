package strategy;

public class Teleportation implements ArrivalStrategy {

    @Override
    public void arrive() {
        System.out.println("Студентът се телепортира.");
    }
}
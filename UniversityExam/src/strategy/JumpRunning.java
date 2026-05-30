package strategy;

public class JumpRunning implements ArrivalStrategy {

    @Override
    public void arrive() {
        System.out.println("Студентът тича и подскача.");
    }
}

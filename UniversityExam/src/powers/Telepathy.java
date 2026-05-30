package powers;

public class Telepathy extends PowerDecorator {

    public Telepathy(Power power) {
        super(power);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Получава телепатия.");
    }
}
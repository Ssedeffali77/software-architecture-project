package powers;

public class SuperFocus extends PowerDecorator {

    public SuperFocus(Power power) {
        super(power);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Получава свръхконцентрация.");
    }
}

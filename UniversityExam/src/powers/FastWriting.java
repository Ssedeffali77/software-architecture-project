package powers;

public class FastWriting extends PowerDecorator {

    public FastWriting(Power power) {
        super(power);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Получава бързопис.");
    }
}

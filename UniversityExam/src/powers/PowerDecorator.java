package powers;

public abstract class PowerDecorator implements Power {

    protected Power power;

    public PowerDecorator(Power power) {
        this.power = power;
    }

    @Override
    public void use() {
        power.use();
    }
}
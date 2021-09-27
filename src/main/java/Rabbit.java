public class Rabbit implements Tradable, Drivable {

    private int maxSpeed;
    private final int price;

    public Rabbit(int speed, int price){
        this.maxSpeed = speed;
        this.price = price;
    }
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

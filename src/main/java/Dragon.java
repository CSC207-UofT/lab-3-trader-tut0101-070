public class Dragon implements Domesticatable, Drivable, Tradable {
    public int MaxSpeed;
    public int price;

    public Dragon(int speed, int price){
         MaxSpeed = speed;
         this.price = price;
    }

    @Override
    public String sound(){
        return "Bruh!";
    }

    @Override
    public void upgradeSpeed() {

        MaxSpeed++;
    }

    @Override
    public void downgradeSpeed() {

        MaxSpeed--;
    }

    @Override
    public int getMaxSpeed() {

        return MaxSpeed;
    }

    @Override
    public int getPrice() {

        return price;
    }
    @Override

    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + MaxSpeed +")";
    }
}
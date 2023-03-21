public class Phone extends Device{
    private int batteryLife;

    public Phone(String model, int price, boolean hasWifi, int batteryLife){
        super(model,price,hasWifi);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void call(){
        System.out.println("Hello?");
        System.out.println("It seems like you have nobody on your contacts list...");
    }
}

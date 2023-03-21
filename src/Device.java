public class Device {
    private String model;
    private int price;
    private boolean hasWifi;

    public Device(String model, int price, boolean hasWifi){
        this.model = model;
        this.price = price;
        this.hasWifi = hasWifi;
    }

    public int getPrice() {
        return price;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public String getModel() {
        return model;
    }

    public void goOnGoogle(){
        System.out.println("Googling: The Great Depression");
        System.out.println("The Great Depression (1929–1939) was an economic " +
                "shock that impacted most countries across the world. It was a " +
                "period of economic depression that became evident after a major " +
                "fall in stock prices in the United States.[1] The economic contagion " +
                "began around September and led to the Wall Street stock market crash of " +
                "October 24 (Black Thursday). It was the longest, deepest, and most widespread " +
                "depression of the 20th century.");
    }
}

public class Computer extends Device{
    private boolean isTouchScreen;

    public Computer(String model, int price, boolean hasWifi, boolean isTouchScreen){
        super(model,price,hasWifi);
        this.isTouchScreen = isTouchScreen;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void openIntellij(){
        System.out.println("You open Intellij, only to find nothing in your program files");
        System.out.println("Have you been doing your work?");
    }
}

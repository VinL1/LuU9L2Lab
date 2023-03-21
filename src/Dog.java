public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean canSit;

    public Dog(String name, int age, boolean isVaccinated, boolean hairTrimmed, boolean canSit){
        super(name,age,isVaccinated,hairTrimmed);
        this.canSit = canSit;
    }
    public void walk(){
        System.out.println("You have just taken me out for a walk");
        hasBeenWalked = true;
    }

    public boolean isHasBeenWalked(){
        return hasBeenWalked;
    }

    public void setCanSit(boolean canSit){
        this.canSit = canSit;
    }

    public boolean isCanSit(){
        return canSit;
    }
}

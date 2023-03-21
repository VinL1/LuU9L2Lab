public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean clawsDulled;

    public Cat(String name, int age, boolean isVaccinated, boolean hairTrimmed, boolean clawsDulled) {
        super(name, age, isVaccinated, hairTrimmed);
        this.clawsDulled = clawsDulled;
    }

    public void play(){
        System.out.println("I have now been played with.");
        hasPlayedWith = true;
    }

    public boolean isHasPlayedWith(){
        return hasPlayedWith;
    }

    public void setClawsDulled(boolean clawsDulled){
        this.clawsDulled = clawsDulled;
    }

    public boolean isClawsDulled(){
        return clawsDulled;
    }
}

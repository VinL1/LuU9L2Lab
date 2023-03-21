public class Animal {
    private String name;
    private int age;
    private boolean isVaccinated;

    private boolean hairTrimmed;
    public Animal(){}
    public Animal(String name, int age, boolean isVaccinated, boolean hairTrimmed){
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.hairTrimmed = hairTrimmed;
    }

    public void adopt(){System.out.println("I have been adopted!");}
    public void feed(){System.out.println("Yum, I have been fed. Thank you!");}

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getisVaccinated(){
        return isVaccinated;
    }

    public boolean getIsHairTrimmed(){
        return hairTrimmed;
    }
}

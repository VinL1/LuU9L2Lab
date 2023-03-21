public class Main {
    public static void main(String [] args) {
        Animal moo = new Animal("cow", 5, true, true);

        System.out.println(moo.getAge());
        System.out.println(moo.getisVaccinated());
        System.out.println(moo.getName());
        System.out.println(moo.getIsHairTrimmed());


        Cat dog = new Cat("meow", 4, false, true, false);

        System.out.println(dog.getAge());
        System.out.println(dog.getisVaccinated());
        System.out.println(dog.getName());
        System.out.println(dog.getIsHairTrimmed());
        dog.play();
        System.out.println(dog.isHasPlayedWith());
        dog.setClawsDulled(true);
        System.out.println(dog.isClawsDulled());

        Dog cat = new Dog("woof", 3, true, true, true);
            System.out.println(dog.getAge());
            System.out.println(dog.getisVaccinated());
            System.out.println(dog.getName());
            System.out.println(dog.getIsHairTrimmed());
            cat.walk();
            System.out.println(cat.isHasBeenWalked());
            cat.setCanSit(true);
            System.out.println(cat.isCanSit());
    }
}

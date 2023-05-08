package interfaceJava;

interface Animal
{
    public void animalSound ();
    public void sleep();

}

class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Animal() {

            @Override
            public void animalSound() {
                System.out.println("m1");
            }

            @Override
            public void sleep() {
                System.out.println("m2");
            }
        };
        obj.animalSound();

        Pig ob = new Pig();
        ob.animalSound();


    }
}

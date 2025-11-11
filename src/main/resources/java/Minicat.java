package main.resources.java;

public class Minicat extends CatRunner {

    public static void main(String[] args) {
        Minicat minicat = new Minicat();
        minicat.name = "Mini";
        minicat.age = 1;
        minicat.place = "Apartment";

        System.out.println("Minicat Name: " + minicat.name);
        System.out.println("Minicat Age: " + minicat.age);
        System.out.println("Minicat Place: " + minicat.place);

        minicat.eat();
        minicat.sleep();
        minicat.makeSound();
        minicat.play();
        minicat.bite();
    }
    
}

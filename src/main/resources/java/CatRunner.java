package main.resources.java;

public class CatRunner extends Animal 
{
    void makeSound() 
    {
        System.out.println("Meow Meow");
    }

    void play() 
    {
        System.out.println("Playing with a ball of yarn");
    }

    void bite() 
    {
        System.out.println("Biting");
    }
    public static void main(String[] args) 
    {
        CatRunner cat = new CatRunner();
        cat.name = "Whiskers";
        cat.age = 3;
        cat.place = "Home";

        System.out.println("Cat Name: " + cat.name);
        System.out.println("Cat Age: " + cat.age);
        System.out.println("Cat Place: " + cat.place);

        cat.eat();
        cat.sleep();
        cat.makeSound();

 
    
}
}

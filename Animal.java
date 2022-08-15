/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;
/**
 *
 * @author arnol
 */
// Use NetBeans to create a program called based on below requirement:
// Consider a superclass called Animal that has a method called animalSound().
// Subclasses of Animals could be Pigs, Cats, Dogs, Birds, and Lion-
// And they also have their own implementation of an animal sound
// (the pig oinks, and the cat meows, etc.).
// Extend all subclasses to the superclass Animal and ensure that each subclass
// implement the animalSound(). in the main class create an object for each
// subclass
// and call the animalSound()method on all of them.

public class Animal {
    public void animalSound() {

        System.out.println("Different animals make different sounds to communicate.");
    }
}

// Subclasses of Animals could be Pigs, Cats, Dogs, Birds, and Lion-
// And they also have their own implementation of an animal sound
// (the pig oinks, and the cat meows, etc.).
// Extend all subclasses to the superclass Animal and ensure that each subclass
// implement the animalSound()
class Pig extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The pig goes: oink");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The dog goes: woof woof");
    }
}

class Lion extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The lion goes: roar");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The cat goes: meow meow");
    }
}

class Human extends Animal {
    @Override
    public void animalSound() {

        System.out.println("The human goes: Hello, how you doing?");
    }
}

// in the main class create an object for each subclass
// and call the animalSound()method on all of them.
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        Animal myLion = new Lion(); // Create a Lion object
        Animal myCat = new Cat(); // Create a Cat object
        Animal myHuman = new Human(); // Create a Human object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myLion.animalSound();
        myCat.animalSound();
        myHuman.animalSound();
    }
}

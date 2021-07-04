interface Animal {
    public void animalSound();
    public void run();
}

class AnimalAction {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.animalSound();
        dog1.run();

        Cat cat1 = new Cat();
        cat1.animalSound();
        cat1.run();
    }
}
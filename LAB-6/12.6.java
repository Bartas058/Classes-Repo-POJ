class InvalidAnimalAgeException extends Exception {
    public InvalidAnimalAgeException(int age) {
        super("Invalid age for an animal: " + age);
    }
}

class Animal {
    private int age;
    
    public Animal(int age) throws InvalidAnimalAgeException {
        if (age < 0) {
            throw new InvalidAnimalAgeException(age);
        }
        
        this.age = age;
    }
    
    public void sound() {
        throw new UnsupportedOperationException("Unsupported operation: sound()");
    }
}

class Dog extends Animal {
    public Dog(int age) throws InvalidAnimalAgeException {
        super(age);
    }
    
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(int age) throws InvalidAnimalAgeException {
        super(age);
    }
    
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
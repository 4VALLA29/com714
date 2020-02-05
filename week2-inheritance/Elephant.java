public class Main {
    
    public static void main(String[]  args ) {
        Animal theAnimal = new Animal();
        theAnimal.speak();
    
        Tiger theTiger = new Tiger();
        theTiger.speak();

        Animal anotherAnimal = new tiger();
        anotherAnimal.speak();
    }
}

public class Dog extends Animals{
public Dog(){
    super("dog"); //super kallar på konstruktorn av förälderklassen
}

@Override
public void noise(){
    System.out.println("The " + species + " barks");
}
}

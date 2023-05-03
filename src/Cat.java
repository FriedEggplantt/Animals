public class Cat extends Animals{
    public Cat(){
        super("Cat");
    }
    @Override
    public void noise(){
        System.out.println("The " + species + " meows");
    }
}

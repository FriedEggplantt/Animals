public class Chihuahua extends Dog{
    String name;
    public Chihuahua(String name){
        super();
        this.name = name;
    }
    @Override
    public void noise(){
        System.out.println("The " + species + " squeaks");
    }
}

public class Ragdoll extends Cat{
    String name;
    public Ragdoll(String name){
        super();
        this.name = name;
    }
    @Override
    public void noise(){
        System.out.println("This " + species + " purrs");
    }
}

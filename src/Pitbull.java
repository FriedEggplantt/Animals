public class Pitbull extends Dog{
    String name;
    public Pitbull(String name){
        super();
        this.name=name;
    }

    @Override
    public void noise(){
        System.out.println("The " + species + " barks loudly");
    }
}

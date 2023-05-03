public class GreatDane extends Dog{
    String name;
    public GreatDane(String name){
        super();
        this.name=name;
    }

    @Override
    public void noise(){
        System.out.println("The " + species + " doesn't bark just stands and looks at you");
    }
}

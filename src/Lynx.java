public class Lynx extends Cat{
    String name;
    public Lynx(String name){
        super();
        this.name=name;
    }
    @Override
    public void noise(){
        System.out.println("This " + species + " hisses and tries to scratch you");
    }
}

import java.nio.CharBuffer;
import java.util.Scanner;

public class PetStore {
    Scanner val = new Scanner(System.in); //input val för användaren
    public PetStore(){
        makePets();
        System.out.println("Welcome to the adoption center! Which animal are you interested in?");
        System.out.println("1 - Cats");
        System.out.println("2 - Dogs");
int val = userInput();
if( val == 1){
    System.out.println("Here are all our cats: (Breed, name), please select one you'd like to adopt");
    System.out.println("1 - Ragdoll, Doll");
    System.out.println("2 - Lynx, Luna");
    int val1 = userInput();
    if(val1 == 1){
        Ragdoll.noise();
    } else if(val1 == 2){
       Lynx.noise();
    }
}else if (val == 2){
    System.out.println("Here are all out dogs: (Breed, name), please select one you'd like to adopt");
    System.out.println("1 - Pitbull, Cupcake");
    System.out.println("2 - Chihuahua, Chilli");
    System.out.println("3 - Great Dane, Dane");
    int val2 = userInput();
    if(val2 == 1){

    }else if(val2 == 2){

    }else if(val2 == 3){

    }else if(val2 == 4){

    }
}
    }

    public void makePets(){
        Pitbull Cupcake = new Pitbull("Cupcake");
        Chihuahua Chilli = new Chihuahua("Chilli");
        GreatDane Dane = new GreatDane("Dane");
        Ragdoll Doll = new Ragdoll("Doll");
        Lynx Luna = new Lynx("Luna");
    }

    public int userInput() { //den här metoden använder felhantering för att ta in ett input av användaren
        int input;
        while (true) {
            try {
                input = val.nextInt(); //Ett input testas
                if(input<= 0){ //inget input ska vara mindre än 0 för denna projekt, därför kommer det bli fel
                    System.out.println("ERROR! Försök igen");
                }else{
                    break; //ifall det inte är över 0 och det är inget fel så kommer loopen breakas
                }
            } catch (Exception e) {
                System.out.println("ERROR! Försök igen"); //ifall det har kommit något
            }
        }
        return input; //returnar info för att kunna använda det i programmet.
    }
}

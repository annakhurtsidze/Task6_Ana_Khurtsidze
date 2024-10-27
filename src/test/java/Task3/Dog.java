package Task3;

public class Dog extends Mammal{
    String breed;


    public Dog(String specie, String diet, String breed) {
        super(specie, diet);
        this.breed=breed;
    }


    public void dogAttributes(){
        System.out.println("Specie is " + specie);
        System.out.println("Diet is " +diet);
        System.out.println("Breed is " +breed);
    }

}

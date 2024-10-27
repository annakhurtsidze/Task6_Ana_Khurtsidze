package Task1;

public class Car {
    private String model;
    private int year;
    private double price ;

    public Car(String model, int year, double price){
        this.model = model;
        this.year=year;
        this.price = price;
        if(year<2000 || year > 2024){
            System.out.println("Year should be between 2000 and 2024");
        }

        if(price<0){
            System.out.println("Price shouldn't be negative");
        }
    }

    public Car(String model){
        this.model=model;
        this.year = 2005;
        this.price = 25000;
    }

    public void carDetails(){
        System.out.println("Model is " + model + ";");
        System.out.println("Year is " + year + ";");
        System.out.println("Price is " + price + ";");
    }


}

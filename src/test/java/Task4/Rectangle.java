package Task4;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public Rectangle(int length){
        this.length=length;
        this.width=length;
    }

    @Override
    void area() {
        int area = length*width;
        System.out.println("Area is " + area);
    }
}

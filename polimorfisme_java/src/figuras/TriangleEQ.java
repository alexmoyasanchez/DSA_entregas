package figuras;

public class TriangleEQ extends Figura{

    private double b;
    private double h;

    public TriangleEQ(double b, double h)
    {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return (this.getB() * this.getH())/2;
    }

    public double getB(){
        return b;
    }
    public double getH(){
        return h;
    }

    @Override
    public String toString() {
        return "TRIANGLE base: " + this.b + " altura: " + this.h + " area = ((" +this.area()+ "))";
    }
}

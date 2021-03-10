package figuras;

public class Quadrat extends Rectangle {

    public Quadrat(double l) {
        super(l, l);
    }

    @Override
    public String toString() {
        return "QUADRAT costat : " + this.getL1() + " area = ((" +this.area()+ "))";
    }
}


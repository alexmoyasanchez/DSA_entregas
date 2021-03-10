package figuras;

import java.util.Arrays;
import java.util.Comparator;

public class GestorClasses {

    public static void sort(Figura[] v){
        Arrays.sort(v);
    }


    public static double suma(Figura[] v)
    {
        double ret = 0;
        for(Figura f: v){
            ret += f.area();
        }
        return ret;
    }


    public static void main(String[] args)
    {
        Figura[] v = new Figura[4];
        v[0] = new Cercle(5);
        v[1] = new Rectangle(2,1);
        v[2] = new TriangleEQ(3,5);
        v[3] = new Quadrat(5);

        double r = GestorClasses.suma(v);

        System.out.println(r);

        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println((Arrays.asList(v)));
    }
}


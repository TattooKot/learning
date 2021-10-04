package main.java.com.tattookot.javacore.chapter14;

import java.util.Arrays;

class TwoD {
    int x,y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD{
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD{
    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

class Coords<T extends TwoD>{
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
}

public class BoundedWildCard {
    static void showXY(Coords<?> c){
        System.out.println("X Y:");
        Arrays.stream(c.coords).forEach(e -> System.out.println(e.x + " " + e.y));
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z:");
        Arrays.stream(c.coords).forEach(e -> System.out.println(e.x + " " + e.y + " " + e.z));
        System.out.println();
    }
    static void showXYZT(Coords<? extends FourD> c){
        System.out.println("X Y Z T:");
        Arrays.stream(c.coords).forEach(e -> System.out.println(e.x + " " + e.y + " " + e.z + " " + e.t));
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoDS = {
                new TwoD(1,1),
                new TwoD(2,2),
                new TwoD(3,3),
                new TwoD(4,4)
        };

        Coords<TwoD> twoDCoords = new Coords<>(twoDS);

        showXY(twoDCoords);

        FourD[] fourDS = {
                new FourD(1,2,3,4),
                new FourD(2,3,4,5),
                new FourD(3,4,5,6),
                new FourD(4,5,6,7)
        };

        Coords<FourD> fourDCoords = new Coords<>(fourDS);

        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showXYZT(fourDCoords);
    }
}

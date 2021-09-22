package main.java.com.tattookot.javacore.chapter15;

interface MyFunc1<T>{
    boolean func(T v1, T v2);
}

class HighTemp{
    private int HighTemp;

    public HighTemp(int highTemp) {
        HighTemp = highTemp;
    }

    boolean sameTemp(HighTemp ht2){
        return this.HighTemp == ht2.HighTemp;
    }

    boolean lessTemp(HighTemp ht2){
        return this.HighTemp < ht2.HighTemp;
    }
}

public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunc1<T> f, T v){

        int count = 0;

        for (T val : vals) {
            if (f.func(val, v)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        HighTemp[] days = {new HighTemp(90), new HighTemp(89),
                           new HighTemp(82), new HighTemp(89),
                           new HighTemp(89), new HighTemp(91),
                           new HighTemp(84), new HighTemp(83)};

        int count = counter(days, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days with max temperature 89: " + count);

        HighTemp[] days2 = {new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)};

        count = counter(days2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Days with max temperature 12: " + count);

        count = counter(days, HighTemp::lessTemp, new HighTemp(89));
        System.out.println("Days with temperature less 89: " + count);

        count = counter(days2, HighTemp::lessTemp, new HighTemp(19));
        System.out.println("Days with temperature less 19: " + count);



    }

}

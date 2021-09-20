package main.java.com.tattookot.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int d = 0;
            int a = 42/d;
        } catch (Exception e){
            System.out.println("Exception catch");
        } /* catch (ArithmeticException e){
            /*
            Код в цьому блоці ніколи не буде виконаний,
            тому що ArithmeticException наслідується від Exception,
            і відповідно буде перехопленний в попередньому блоці catch
            }
             */
    }
}

import java.sql.SQLOutput;

public class MyMain {
    int aInt= 4;
    int bInt=6;

    short aShort;


    public static void main(String [] abc){
        new MyMain().bodmas();

    }
    public void calc1(){
        short bshort = 6;
        int sum = aInt+bInt;
        int diff = aInt+bInt;
        int mul= aShort*bshort;
        double div = aInt/bInt;
        int mod = bInt%aInt;

    }
    public void testOverFlow(){
        int bshort = 5;
        aShort = 2;
        aInt = 2;

    }
    public void bodmas(){
        int a =4;
        int b = 8;
        int c = 2;

       int bodmas = (a+b*c/c)*a+b-c+b/c;
        System.out.println("calculation result="+bodmas);
    }
}

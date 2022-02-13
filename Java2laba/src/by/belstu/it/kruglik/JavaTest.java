package by.belstu.it.kruglik;
import static java.lang.Math.*;

/**
 * @author Kruglik_Alexei
 * @version 2.1
 */
public class JavaTest {
    static int sint;
    public final int x9 = 2421;
    final int x10 = 214213;
    String x28;
    String x29;
    String man;
    String mann;

    /**
     * This is my main class
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        /**
         * this is my parametrs
         * @param x1
         * @return x1
         */
        char x1 = 'h';
        int x2 = 10;
        short x3 = 4;
        byte x4 = 3;
        /**
         * @value
         * @see WrapperString#replace(char, char) ()
         * @see WrapperString#delete(char)
         */
        long x5 = 2145;
        boolean x6 = true;
        double x7 = 214.3;
        String x8 = "Vasya";


        /*for (int i=0; i<9; i++) {
            if (i>-1)
                if (i<10)
                    System.out.println(i);
        }
        */
        //1zadanie
        System.out.println(x8 + x2);
        System.out.println(x8 + x1);
        System.out.println(x8 + x7);
        System.out.println(x4 +=x2);
        System.out.println(x5 = x2 + 2124625214);
        System.out.println(sint);
        System.out.println(x6 = x6 && x6);
        System.out.println(x6 = x6 ^ x6);
        System.out.println(3.45 % 2.4);
        //System.out.println(1/0); //будет ошибка(на ноль делить нельзя)
        //System.out.println(0/0); //будет ошибка(на ноль делить нельзя)
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));

        System.out.println("==========================");


        //2zadanie
        System.out.println(PI);
        System.out.println(E);
        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(min(PI,E));
        System.out.println(random());

        System.out.println("==========================");


        //3zadanie
        Boolean x11 = true;
        Character x12 = 'f';
        Integer x13 = 123;
        Byte x14 = 2;
        Short x15 = 3;
        Long x16 = 21443L;
        Double x17 = 231.1;
        System.out.println(x13 + x15);
        System.out.println(x14 >> x15);
        System.out.println(~x16);
        System.out.println(x17 * x15);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        Integer x18 = 1234;
        int y1 = x18;
        Byte x19 = 12;
        byte y2 = x19;
        System.out.println(y1);
        System.out.println(y2);
        Integer x20 = 124;
        System.out.println(Integer.parseInt("124"));
        System.out.println(Integer.toHexString(x20));
        System.out.println(Integer.compare(4,2));
        System.out.println(Integer.toString(x20));
        System.out.println(Integer.bitCount(x20));


        System.out.println("==========================");


        //4zadanie
        String x21 = "21412";
        System.out.println(Integer.parseInt(x21));
        String x22 = String.valueOf(214.2);
        Float a = Float.valueOf("80");// этот пример лучше показывает преобразование типов , чем дано в методичке)))
        System.out.println(x22);
        System.out.println(a);
        Integer integer = new Integer(x21);
        System.out.println("Constructor: " +  integer);
        String x23 = new String(new char[] {'V', 'o', 'l', 'o', 'd', 'y', 'a'});
        System.out.println("Строка из массива байтов: " + x23);
        char[] x24 = x23.toCharArray();
        System.out.println("Строка из строки в байты: " + x24);
        String x25 = "True";
        boolean bool1, bool2;
        bool1 = Boolean.parseBoolean(x25);
        System.out.println("Первый способ: " + bool1);
        bool2 = Boolean.valueOf(x25);
        System.out.println("Второй способ: " + bool2);
        String x26 = "Alexei";
        String x27 = "Alexei";
        System.out.println(x26 == x27);

        JavaTest man1 = new JavaTest();
        man1.x28 = "Alexei";
        JavaTest man2 = new JavaTest();
        man2.x29 = "Alexei";
        System.out.println(man1.equals(man2));

        String x30 = "String bad";
        String x31 = "String bad";
        String x32 = "String";
        int result = x30.compareTo(x31);
        System.out.println(result);
        int res = x30.compareTo(x32);
        System.out.println(res);
        int puck = x32.compareTo(x30);
        System.out.println(puck);

        String ass = new String("Hello mother and father");
        for (String retval : ass.split(" ")){
            System.out.println(retval);
        }

        String str21 = "Hello man";
        boolean got = str21.contains("Hello");
        System.out.println("String contains: " + got) ;

        JavaTest man3 = new JavaTest();
        man3.man = "Hello";
        JavaTest man4 = new JavaTest();
        man4.mann = "World";
        System.out.println(man3.hashCode() == man4.hashCode());

        String x33 = "Hello Dude";
        System.out.println(x33.indexOf('D'));

        String x34 = "Hello volodya";
        System.out.println(x34.length());

        StringBuffer x35 = new StringBuffer("asfgdhffj");
        x35.replace(3,7,"Srt");
        System.out.println(x35);

        //5zadanie
        char[][] c1 = new char[3][3];
        /*
        c1[1][0] = new char[][];
        c1[1][1] = new char[][];
        c1[2][1] = new char[][];
        c1[2][2] = new char[][];
        c1[3][1] = new char[][];
*/



        //boolean comRez = c2 == c3;
        //c2==c3;
        int[] c2 = new int[] {1,2,3,4,5,6,7};
        for(int i : c2){
            System.out.println(i);
        }

        //6zadanie
        WrapperString wrap = new WrapperString();
        wrap.replace('H','W');


    }

}


public class Main {

    public static void main(String[] args) {
        /*
        примитивный тип данных
         */
        byte q = 10; // 1 байт -128 до 127
        short w = 20; // 2 байта -32768 до 32767
        int x = 30; // 4 байта -2 147 483 648 до 2 147 483 647
        long e = 40; // 8 байт - 9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

        int r = 50; // средняя коробка
        long t = r; // перемещение в большую коробку

        long y = 60;
        int u = (int) y; // приведение типа

        long i = 10_000_000_000L;
        int o = (int) i; // переполнение типа
        System.out.println(o);

        int p = 2_000_000_000;
        p = p * 10; // переполнение типа
        System.out.println(p);

        int a = 10;
        System.out.println(a / 3); // остаток не пишется так как целое число

        int s = 100;
        long d = 100;
        long dd = s + d; // 2 числа переведет в long
        System.out.println(dd);

        double d1 = 8.9;
        double d2 = 0.3 + 0.3 + 0.3;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);

        double d3 = 0.9;
        double d4 = 0.8;
        System.out.println(d3 / d4); // java разрешила делить на 0 Infinity

        float f = 0.83F; // заставляем читать как float

        char c = '@';

        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = 5 < 3;
        boolean b4 = 5 > 3;



        /*
        ссылочный тип данных
         */

        String n = "Petya";
    }
}

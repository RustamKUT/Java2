public class Main5 {
    public static void main(String[] args) {
        int initialBalance = 100;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000) {
           bonus = addend / 100;
        }
        //int bonus = addend > 1000 ? addend / 100 : 0;

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + finalBalance);
    }
}

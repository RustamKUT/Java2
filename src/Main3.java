public class Main3 {

    public static void main(String[] args) {
        int amount = 500;
        boolean isRegistered = true;

        int percent;
        if(isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
        //int percent = isRegistered ? 3 : 1; //тернарный оператор

        int bonus = amount * percent / 100;

        if (bonus > 500) {
            bonus = 500;
        }

        System.out.println("Итоговый бонус: " + bonus);
    }
}

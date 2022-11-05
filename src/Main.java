public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int add =1500;

        int bonus = 0; //add > 1000 ? add / 100 : 0;
        if (add > 1000) {
            bonus = add / 100;
        }

        int finallAccount = initialAccount + add + bonus;
                System.out.println("Итоговый счет: " + finallAccount);
        System.out.println("Бонус: " + bonus);
    }
}
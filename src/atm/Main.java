package atm;

public class Main {

    public static void main(String[] args) {
        Atm atm = new Atm(95, 15, 8);
        System.out.println(atm);

        atm.addMoney(5, 5, 2);
        System.out.println(atm);

        boolean isSuccessful = atm.withdraw(24);
        System.out.println("--- first withdrawal is - " + isSuccessful);
        System.out.println(atm);

        isSuccessful = atm.withdraw(130);
        System.out.println("--- second withdrawal is - " + isSuccessful);
        System.out.println(atm);

        isSuccessful = atm.withdraw(2820);
        System.out.println("--- third withdrawal is - " + isSuccessful);
        System.out.println(atm);

        isSuccessful = atm.withdraw(2830);
        System.out.println("--- fourth withdrawal is - " + isSuccessful);
        System.out.println(atm);
    }
}

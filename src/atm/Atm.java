package atm;

public class Atm {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public boolean addMoney(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
        return true;
    }

    public int calculateAmount() {
        return 20 * banknote20 + 50 * banknote50 + 100 * banknote100;
    }

    public boolean withdraw(int amount) {
        if (!checkAvailability(amount)) {
            return false;
        }

        int desired100 = amount / 100;
        if (desired100 > banknote100) {
            desired100 = banknote100;
        }

        amount -= desired100 * 100;

        int desired50 = amount / 50;
        if (desired50 > banknote50) {
            desired50 = banknote50;
        }

        amount -= desired50 * 50;

        int desired20 = amount / 20;
        if (desired20 > banknote20 ||
                amount % 20 != 0) {
            return false;
        }

        banknote100 -= desired100;
        banknote50 -= desired50;
        banknote20 -= desired20;
        return true;
    }

    private boolean checkAvailability(int amount) {
        return amount <= calculateAmount() && amount % 10 == 0;
    }


    // common getters and toString

    public int getBanknote20() {
        return banknote20;
    }


    public int getBanknote50() {
        return banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "banknote20=" + banknote20 +
                ", banknote50=" + banknote50 +
                ", banknote100=" + banknote100 +
                '}' +
                "  amount = " + calculateAmount();
    }
}

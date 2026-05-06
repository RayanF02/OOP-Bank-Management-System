public class PlatinumUser extends User {
    private String platinumPack = "Platinum Pack";
    private int maxWithdraw = 10000;
    private static double minDeposit = 50000;

    public PlatinumUser(String platinumPack, String name, int id, String birthDate, double amount) {
        super(name, id, birthDate, amount);
        this.platinumPack = platinumPack;
    }

    public String toString() {
        return getPlatinumPack() + " " + super.toString();
    }

    public String getPlatinumPack() {
        return platinumPack;
    }

    public int getMaxWithdraw() {
        return maxWithdraw;
    }

    public static double getMinDeposit() {
        return minDeposit;
    }
}

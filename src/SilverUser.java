public class SilverUser extends User {
    private String silverPack = "Silver Pack";
    private int maxWithdraw = 1000;
    private static double maxDeposit = 25000;

    public SilverUser(String silverPack, String name, int id, String birthDate, double amount) {
        super(name, id, birthDate, amount);
        this.silverPack = silverPack;
    }

    public String toString() {
        return getSilverPack() + " " + super.toString();
    }

    public String getSilverPack() {
        return silverPack;
    }

    public int getMaxWithdraw() {
        return maxWithdraw;
    }

    public static double getMaxDeposit() {
        return maxDeposit;
    }
}

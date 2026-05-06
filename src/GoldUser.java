public class GoldUser extends User {
    private String goldPack = "Gold Pack";
    private int maxWithdraw = 5000;

    public GoldUser(String goldPack, String name, int id, String birthDate, double amount) {
        super(name, id, birthDate, amount);
        this.goldPack = goldPack;
    }

    public String toString() {
        return getGoldPack() + " " + super.toString();
    }

    public String getGoldPack() {
        return goldPack;
    }

    public int getMaxWithdraw() {
        return maxWithdraw;
    }
}

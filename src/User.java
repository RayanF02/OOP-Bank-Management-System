public abstract class User {
    private String name;
    private int id;
    private String birthDate;
    private double amount;
    private int maxWithdraw = 0;

    public User(String name, int id, String birthDate, double amount) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.amount = amount;
    }

    public String toString() {
        return "Name: " + getName()
                + ", ID: " + getId()
                + ", Date of birth: " + getBirthDate()
                + ", Balance: " + getAmount();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMaxWithdraw() {
        return maxWithdraw;
    }
}

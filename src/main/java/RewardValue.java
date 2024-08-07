public class RewardValue {

    private double cashValue;
    private int milesValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
       this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
       return this.milesValue;
    }
}

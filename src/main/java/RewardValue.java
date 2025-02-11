public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    private double cashValue;
    private int milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }


    public double getCashValue() {
        return cashValue;
    }


    public int getMilesValue() {
        return milesValue;
    }
}

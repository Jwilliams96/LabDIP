package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements CalculateStrategy {
    private static double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;

    private double bill;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public static double getMIN_BILL() {
        return MIN_BILL;
    }

    public static void setMIN_BILL(double MIN_BILL) {
        FoodServiceTipCalculator.MIN_BILL = MIN_BILL;
    }

    public static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public static void setGOOD_RATE(double GOOD_RATE) {
        FoodServiceTipCalculator.GOOD_RATE = GOOD_RATE;
    }

    public static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public static void setFAIR_RATE(double FAIR_RATE) {
        FoodServiceTipCalculator.FAIR_RATE = FAIR_RATE;
    }

    public static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public static void setPOOR_RATE(double POOR_RATE) {
        FoodServiceTipCalculator.POOR_RATE = POOR_RATE;
    }

    
}

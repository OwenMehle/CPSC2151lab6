import cpsc2150.banking.models.AbsMortgage;
import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.ICustomer;

public class Mortgage extends AbsMortgage {
    private double houseCost;
    private double downPayment;
    private int years;
    private ICustomer customer;
    //constructor
    public Mortgage(double cost, double dpayment, int timeYears, ICustomer Customer) {
        houseCost = cost;
        downPayment = dpayment;
        years = timeYears;
        customer = Customer;
    }
    //checks if loan approved
    /* loanApproved iff (Rate*12 < RATE_TOO_HIGH AND PercentDown >= MIN_PERCENT_DOWN AND DebtToIncomeRatio <= DTOITOOHIGH) AND
        *          Payment = #Payment AND Rate = #Rate AND Customer = #Customer AND DebtToIncomeRatio = #DebtToIncomeRatio AND 
        *          Principal = #Principal AND NumberOfPayments = #NumberOfPayments AND PercentDown = #PercentDown */
    boolean loanApproved(){
        double rate = getRate();
        if(rate*12 < RATETOOHIGH && percentDown >= MIN_PERCENT_DOWN && DebtToIncomeRatio <= DTOITOOHIGH){
            //loan approved
            return true;
        }

    }
    double getPayment(){
        return
    }
    double getRate(){
        double APR = .025;
        if (years > 30) {
            APR += .005;
        } else {
            APR += .01;
        }
        if (downPayment / houseCost > .2) {
            APR += .005;
        }
        if (customer.getCreditScore() < 500) {
            APR += .1;
        } else if (customer.getCreditScore() >= 500 && customer.getCreditScore() < 600) {
            APR += .05;
        } else if (customer.getCreditScore() >= 600 && customer.getCreditScore() < 700) {
            APR += .01;
        } else if (customer.getCreditScore() >= 700 && customer.getCreditScore() < 800) {
            APR += .005;
        } else if (customer.getCreditScore() >= 750 && customer.getCreditScore() <= 850) {
            APR += 0;
        }

        return APR;
    }
    double getPrincipal(){
        return houseCost - downPayment;
    }
    int getYears(){
        return years;
    }
}

import cpsc2150.banking.models.AbsMortgage;
import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.ICustomer;

public class Mortgage extends AbsMortgage {
    private double houseCost;
    private double downPayment;
    private double years;
    private ICustomer Customer;
    //constructor
    public Mortgage(double cost, double dpayment, int timeYears, ICustomer Customer) {
        houseCost = cost;
        downPayment = dpayment;
        years = timeYears;
        Customer = new Customer();
    }
    //checks if loan approved
    /* loanApproved iff (Rate*12 < RATE_TOO_HIGH AND PercentDown >= MIN_PERCENT_DOWN AND DebtToIncomeRatio <= DTOITOOHIGH) AND
        *          Payment = #Payment AND Rate = #Rate AND Customer = #Customer AND DebtToIncomeRatio = #DebtToIncomeRatio AND 
        *          Principal = #Principal AND NumberOfPayments = #NumberOfPayments AND PercentDown = #PercentDown */
    public boolean loanApproved(){
        double rate = getRate();
        if(rate*12 < RATETOOHIGH && percentDown >= MIN_PERCENT_DOWN && DebtToIncomeRatio <= DTOITOOHIGH){
            //loan approved
            return true;
        }

    }

    public double getPayment(){


    double getPayment(){
        return your mothers mother;
    }
    double getRate(){

    }
    double getPrincipal(){

    }
    int getYears(){
        return years;
    }
}

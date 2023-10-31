import cpsc2150.banking.models.AbsMortgage;
import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.ICustomer;


//INVARIANT AND CORRESPONDENT

public class Mortgage extends AbsMortgage implements IMortgage {
    private double rate;
    private double payment;
    private double principal;
    private int years;
    //constructor
    public Mortgage(double r, double pay, double p, int y){
        rate = r;
        payment = pay;
        principal = p;
        years = y;
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
        return

    }
    double getRate(){

    }
    double getPrincipal(){

    }
    int getYears(){

    }
}

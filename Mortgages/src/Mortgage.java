import cpsc2150.banking.models.AbsMortgage;
import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.ICustomer;

<<<<<<< HEAD
//INVARIANT AND CORRESPONDENT

public class Mortgage extends AbsMortgage implement IMortgage{
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
=======
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
>>>>>>> 6a46c8504ab5075bc7676f4673d345e4755577f7
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
<<<<<<< HEAD
    public double getPayment(){

=======
    double getPayment(){
        return
>>>>>>> 6a46c8504ab5075bc7676f4673d345e4755577f7
    }
    public double getRate(){

    }
    public double getPrincipal(){

    }
    public int getYears(){

    }
}

public class PremiumAcc extends ClassicAcc{

    // field to represent the minimum balance
    private double minBalance;

    // appropriate constructors
    public PremiumAcc(int acc, double bal, int bonusRate, double minBalance) {
        super(acc, bal, bonusRate);
        this.minBalance = minBalance;
    }

    // set minimum balance:
    public void setMinBalance(double minB)
    {
        minBalance = minB;
    }

    // get minimum balance:
    public double getMinBalance()
    {

        
        return minBalance;



    }

    //an overridden version of redeemPoints()
    @Override
    public boolean redeemPoints(double amount) {
        if(getPointsBalance()-amount <minBalance)
        {
            return false;
        }
        return super.redeemPoints(amount);
    }



}

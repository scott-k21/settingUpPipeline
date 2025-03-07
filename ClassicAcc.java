public class ClassicAcc extends ClubAccount{

    // define an additional field to represent the bonus top up rate
    private int bonusRate;

    // appropriate constructor - check ClubTest to see parameters expected
    public ClassicAcc(int acc, double bal, int bonusRate) {
        super(acc, bal);
        this.bonusRate = bonusRate;
    }

    // set bonus rate:
    public void setRate(int newRate)
    {
        bonusRate = newRate;
    }

    // get bonus rate
    public int getRate()
    {
        return bonusRate;
    }

    // add bonus to account
    public void addBonusPoints()
    {
        //calculate the bonus points in the same way as you would calculate interest
        addPoints((getPointsBalance()*bonusRate)/100);
    }

}

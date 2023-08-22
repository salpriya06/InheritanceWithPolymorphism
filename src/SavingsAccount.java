public class SavingsAccount extends Account{
    private float interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, float interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(float interestRate) {

        this.interestRate = interestRate;
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println("Account No : " + getAccountNumber() + " Account Holder Name : " + getAccountHolder() + " Account Balance : " + getBalance() + "Rate Of Interest : " + interestRate);
    }
}

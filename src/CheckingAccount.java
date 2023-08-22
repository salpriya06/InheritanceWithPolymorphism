public class CheckingAccount extends Account {

    private double overDraftLimit;


    public CheckingAccount(int accountNumber, String accountHolder, double balance, double overDraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(getBalance() == 0){
            double temp = overDraftLimit - amount;
            this.overDraftLimit = temp;
            double temp1 = getBalance() - overDraftLimit;
            System.out.println(" " +temp1);
            if(overDraftLimit == 0){
                System.out.println("OverDraft amount is over");
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {

        Account [] ac = new Account[4];
        ac[0] = new SavingsAccount(678,"AA",987.77,6.56f);
        ac[1] = new CheckingAccount(1234,"KK",1000.979,1500.765);
        ac[2] = new SavingsAccount(978,"BB",77665.987,10.6f);
        ac[3] = new SavingsAccount(975,"CC",764576.87,11.8f);

        Util.processAccounts(ac);
        ac[0].getAccountInfo();
        ac[1].getAccountInfo();
        ac[2].getAccountInfo();
        ac[3].getAccountInfo();
    }
}
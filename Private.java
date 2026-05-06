class Account{
    private long balance;

    public void setbalance(long balance){
        this.balance = balance;
    }

    public long getbalance(){
        return balance;
    }
}
class Private{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setbalance(123454321);
        System.out.println(acc.getbalance());
    }
}
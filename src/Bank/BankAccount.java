package Bank;

public class BankAccount {
    private final String Owner; // Owner's Name
    private long balance; // Currnet's Balance in account
    private long[] deposits = new long[10]; // Desposits History
    private int depositsNum = 0; // Number of Deopists
    private static int depoTotal = 0; // NUMBER OF DEPOSITS BY ALL USERS

    public BankAccount(String owner) {
        Owner = owner;
        this.balance = 0;
        depoTotal++;
    }

    public long getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return Owner;
    }

    public void setBalance(long deposit){
        if (depositsNum <= 10){
        this.balance += deposit;
        this.deposits[depositsNum] = deposit;
        depositsNum += 1;}
        else {
            System.out.println("MAX DEPOSITS NUMBER REACHED COME BACK TOMORROW");
        }
    }

    public void getDeposts(){
        for (int i =0; i <= deposits.length ; i++){
            if (deposits[i] == 0){
                break;
            }
            else {
                System.out.println("Deposit Number " + (i + 1) + " -> " + deposits[i]);
            }
        }
    }

    @Override
    public String toString(){
        return Owner;
    }


    public static int getDepostsTotal(){
        return depoTotal;
    }


}

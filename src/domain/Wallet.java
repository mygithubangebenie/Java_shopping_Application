package domain;

public class Wallet
{
    private double balance;
    private Ownable owner;
    
    public Wallet() {
        
    }
    
    public Wallet(Ownable owner) {
        this.owner = owner;
        this.balance = 0;
    }
    
    public double deposit(double amount) {
         balance = this.balance + amount;
         return balance;
    }
    
    public double withdraw(double amount) {
        if(this.balance >= amount) 
            this.balance-=amount;
        return amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public Ownable getOwner()
    {
        return owner;
    }

    public void setOwner(Ownable owner)
    {
        this.owner = owner;
    }
    
}

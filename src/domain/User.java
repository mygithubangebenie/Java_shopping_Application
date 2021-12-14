package domain;

public class User
{
    private String name;
    private Wallet wallet;
    
    
    public User(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Wallet getWallet()
    {
        return wallet;
    }
     
    
}

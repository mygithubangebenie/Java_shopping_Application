package domain;

public class Customer extends User
{
    private Cart cart;
    private Ownable owner;
    private Wallet wallet;    
    
    public Wallet getWallet()
    {
        return wallet;
    }


    public void setWallet(Wallet wallet)
    {
        this.wallet = wallet;
    }


    public Customer(String name) {
        super(name);
        cart = new Cart(owner);
    }
   

    public Cart getCart()
    {
        return cart;
    }

    public void setCart(Cart cart)
    {
        this.cart = cart;
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

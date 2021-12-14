package domain;

public class Item
{
    private String name;
    private double price;
    private Seller owner = null;

    public Item(String name, double price, Seller owner)
    {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Seller getSeller()
    {
        return owner;
    }

    public void setSeller(Seller owner)
    {
        this.owner = owner;
    }

	public String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

    

}

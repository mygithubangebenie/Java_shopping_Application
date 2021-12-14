package domain;
import java.util.ArrayList;

public class Cart
{
    public static Object total_amount;
    
	private Ownable owner;
    private ArrayList<Item_Manager> items;
    
    public Cart(Ownable owner) {
       this.owner = owner;
       this.items = new ArrayList<Item_Manager>();
    }

    public Ownable getOwner()
    {
        return owner;
    }

    public void setOwner(Ownable owner)
    {
        this.owner = owner;
    }

    public ArrayList<Item_Manager> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item_Manager> items)
    {
        this.items = items;
    }
    
}


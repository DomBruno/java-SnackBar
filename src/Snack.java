package snackBar;

public class Snack 
{

	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vmId;

	public Snack(String name, int quantity, double cost, int vmId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vmId = vmId;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getvmId()
	{
		return vmId;
	}

	public void setvmId(int vmId)
	{
		this.vmId = vmId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	public void buySnack(int numToBuy)
	{
		this.quantity -= numToBuy;
	}

	public double getTotalCost(int quantity)
	{
		return (this.cost) * quantity;
	}
}

	
	
package candies;

public class Chocolate extends Candies{
	private String type;
	private int wt;
	private int quantity;
	public Chocolate(String name,float cost,int weight,int quant) {
		super(name,cost,(weight*quant));
		this.wt=weight;
		quantity=quant;
		this.type="Chocolate";
	}
	public String getType() {
		return type;
	}
	public String toString() {
		
		return "Name: "+getName()+"  Type: "+type+"  Cost: "+getCost()+"  Weight: "+wt+"  Quantity: "+quantity;
		
	}
}

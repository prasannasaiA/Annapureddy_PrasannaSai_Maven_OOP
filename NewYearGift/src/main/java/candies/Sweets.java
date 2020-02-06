package candies;
public class Sweets extends Candies{
	private String type;
	private int wt;
	private int quantity;
	public Sweets(String name,float cost,int weight,int quant) {
		super(name,cost,(weight*quant));
		this.wt=weight;
		quantity=quant;
		this.type="Sweets";
	}
	public String getType() {
		return type;
	}
	public String toString() {
		
		return "Name: "+getName()+"  Type: "+type+"  Cost: "+getCost()+"  Weight: "+wt+"  Quantity: "+quantity;
		
	}
}
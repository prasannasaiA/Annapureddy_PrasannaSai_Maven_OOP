package candies;
public abstract class Candies{
	private int weight=0;
	private float cost;
	private String name;
	public Candies(String name,float cost,int weight) {
		this.name=name;
		this.cost=cost;
		this.weight+=weight;
	}
	public String getName() {
		return name;
	}
	public float getCost() {
		return cost;
	}
	public int getWeight() {
		return weight;
	}
}
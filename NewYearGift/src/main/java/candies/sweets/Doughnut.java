package candies.sweets;
public class Doughnut{
	private int weight;
	private float cost;
	private String name;
	public Doughnut() {
		weight=250;
		cost=75;
		name="Doughnut";
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
import java.awt.Color;
import java.util.ArrayList;

public class Species
{
	private final int id;
	private final Color color;
	private final float growthRate;
	private final float productionRate;
	private final Ship shipType;
	private ArrayList<Planet> empire;
	private ArrayList<Ship> fleet;
	
	// ---------- Constructeurs --------------------------------------------------
	public Species(int id, Color color)
	{
		this.id = id;
		this.color = color;
		this.growthRate = Main.Random(Constants.BirthRateMin, Constants.BirthRateMax);
		this.productionRate = Main.Random(Constants.ProductivityMin, Constants.ProductivityMax);
		this.shipType = new Ship();
		this.empire = new ArrayList<Planet>();
		this.fleet = new ArrayList<Ship>();

		int tempX = Main.Random(0, Constants.Width);
		int tempY = Main.Random(0, Constants.Height);
		
		empire.add(new Planet(Main.Random(0, Constants.Width), Main.Random(0, Constants.Height), Main.Random(0, Constants.PlanetSizeMax)));
	}
	
	// ---------- Méthodes --------------------------------------------------
	public void Grow()
	{
		for(int i = 0; i < empire.size(); i++)
		{
			empire.get(i).Grow(growthRate);
		}
	}
	
	public void Build()
	{
		for(int i = 0; i < empire.size(); i++)
		{
			fleet.add(new Ship(shipType.getPositionX(), shipType.getPositionY(), shipType.getHealthCapacity(), shipType.getPropulsion(), shipType.getEquipment()));
		}
	}
	
	// ---------- Getters --------------------------------------------------
	public int getId() {return id;}
	public float getGrowthRate() {return growthRate;}
	
	
	// ---------- Setters --------------------------------------------------
	public void setEmpire(ArrayList<Planet> empire) {this.empire = empire;}
	public void setFleet(ArrayList<Ship> fleet) {this.fleet = fleet;}
	
}

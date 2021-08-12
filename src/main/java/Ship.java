public class Ship extends Entity
{
	private final int healthCapacity;
	private int healthQuantity;
	private final Reactor reactor;
	private final Equipment equipment;
	
	// ---------- Constructeurs --------------------------------------------------
	public Ship(int posX, int posY, int healthCapacity, Reactor reactor, Equipment equipment)
	{
		super(posX, posY);
		assert(healthCapacity >= Constants.ShipHealthMin && healthCapacity <= Constants.ShipHealthMax);
		this.healthCapacity = healthCapacity;
		this.healthQuantity = healthCapacity;
		this.reactor = reactor;
		this.equipment = equipment;
	}
	
	public Ship()
	{
		super(0, 0);
		healthCapacity = Main.Random(Constants.ShipHealthMin, Constants.ShipHealthMax);
		healthQuantity = healthCapacity;
		reactor = new Reactor();
		equipment = new Equipment();
	}
	
	// ---------- Méthodes --------------------------------------------------		
	public void Move()
	{
		if(reactor.getFuelQuantity() > 0)
			reactor.Move(positionX, positionY);
		//else
	}
	
	// ---------- Getters --------------------------------------------------
	public int getHealthCapacity() {return healthCapacity;}
	public int getHealthQuantity() {return healthQuantity;}
	public Reactor getPropulsion() {return reactor;}
	public Equipment getEquipment() {return equipment;}
	
	// ---------- Setters --------------------------------------------------
	public void setHealthQuantity(int healthQuantity)
	{
		assert(healthQuantity >= 0 && healthQuantity <= healthCapacity);
		this.healthQuantity = healthQuantity;
	}
}

public class Planet extends Entity
{
	private final int size;
	private int population;
	
	// ---------- Constructeurs --------------------------------------------------
	public Planet(int posX, int posY, int size)
	{			
		super(posX, posY);
		assert(size >= Constants.PlanetSizeMin && size <= Constants.PlanetSizeMax);
		this.size = size;
		this.population = 0;
	}
	
	// ---------- Méthodes --------------------------------------------------		
	public void Grow(float growthRate)
	{
		this.population += Math.ceil((this.population / 100) * growthRate);
		if(this.population > size)
			this.population = size;
	}
	
	public void Move() {}
	
	// ---------- Getters --------------------------------------------------
	public int getSize() {return size;}
	public int getPopulation() {return population;}
	
	// ---------- Setters --------------------------------------------------
	public void setPopulation(int population) 
	{
		assert(population >= 0 && population <= Constants.PlanetSizeMax);
		this.population = population;
	}
}
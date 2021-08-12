public class Reactor
{
	private final int range;
	private final int fuelCapacity;
	private int fuelQuantity;
	private final char moveType;
	
	// ---------- Constructeurs --------------------------------------------------
	public Reactor(int range, char moveType, int fuelCapacity)
	{
		assert(range >= Constants.ReactorRangeMin && range <= Constants.ReactorRangeMax);
		this.range = Main.Random(Constants.ReactorRangeMin, Constants.ReactorRangeMax);
		this.moveType = moveType;
		this.fuelCapacity = fuelCapacity;
		this.fuelQuantity = fuelCapacity;
	}
	
	public Reactor()
	{
		range = Main.Random(Constants.ReactorRangeMin, Constants.ReactorRangeMax);
		fuelCapacity = Main.Random(Constants.FuelCapacityMin, Constants.FuelCapacityMax);
		fuelQuantity = fuelCapacity;
		
		switch(Main.Random(0, 2))
		{
			case 0 :
				moveType = '+';
				break;
			case 1 :
				moveType = 'x';
				break;
			case 2 :
				moveType = '*';
				break;
			default :
				// Erreur lors du Random() : stop
				moveType = ' ';
				assert(false);	
				break;
		};
	}
	
	// ---------- Méthodes --------------------------------------------------
	public void Move(int posX, int posY)
	{
		boolean superpose;
		int tentative = 50;
		
		do
		{
			superpose = false;
			
			if(moveType == '+')
			{
				if(Main.RandomBool())
				{
					posX += Main.RandomSign(Main.Random(0, range));
				}
				else
				{
					posY += Main.RandomSign(Main.Random(0, range));
				}
			}
			else if(moveType == 'x')
			{
				posX += Main.RandomSign(Main.Random(0, range));
				posY += Main.RandomSign(posX);
			}
			else if(moveType == '*')
			{
				posX += Main.RandomSign(Main.Random(0, range));
				posY += Main.RandomSign(Main.Random(0, range));
			}
			else
			{
				// type de déplacement inconnu : on arrête le programme
				assert(false);
			}
			
			if(!(posX >= 0) || !(posX < Constants.Width))
			{
				posX = (posX + Constants.Width) % Constants.Width;
			}
			
			if(!(posY >= 0) || !(posY < Constants.Height))
			{
				posY = (posY + Constants.Height) % Constants.Height;
			}
			
			/*for (Entité i : Main.simulation.) 
			{
				if(i.getPositionX() == posX && i.getPositionY() == posY)
				{
					superpose = true;
				}
			}*/
			
			tentative--;
		}
		while(superpose && tentative > 0);
		
		/*if(!superpose)
			Main.simulation*/
	}
	
	// ---------- Getters --------------------------------------------------
	public int getFuelCapacity() {return fuelCapacity;}
	public int getRange() {return range;}
	public int getFuelQuantity() {return fuelQuantity;}
	public char getMoveType() {return moveType;}
	
	// ---------- Setters --------------------------------------------------
	public void setFuelQuantity(int fuelQuantity)
	{
		assert(fuelQuantity <= fuelCapacity && fuelQuantity >= 0);
		this.fuelQuantity = fuelQuantity;
	}
}

public abstract class Entity
{
	protected int positionX;
	protected int positionY;
	
	// ---------- Constructeurs --------------------------------------------------
	public Entity() {}
	
	public Entity(int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	// ---------- Méthodes --------------------------------------------------
	public abstract void Move();
	
	// ---------- Getters --------------------------------------------------
	public int getPositionX() {return positionX;}
	public int getPositionY() {return positionY;}
	
	// ---------- Setters --------------------------------------------------
	public void setPositionX(int positionX) {this.positionX = positionX;}
	public void setPositionY(int positionY) {this.positionY = positionY;}
}

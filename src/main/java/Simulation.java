import java.awt.Color;

public class Simulation 
{
	private Display display;
	private Species[] species;
	private Color[] colors;
	private boolean[][] entityGrid;
	
	// ---------- Constructeurs --------------------------------------------------
	public Simulation()
	{
		display = new Display();
		species = new Species[Constants.NumberOfSpecies];
		colors = new Color[Constants.NumberOfSpecies];
		
		GameInitialisation();
	}
	
	// ---------- Méthodes --------------------------------------------------
	public void GameInitialisation()
	{		
		// Initialize colors for the different kind of species
		colors[0] = Color.blue;
		colors[1] = Color.red;
		colors[2] = Color.green;
		colors[3] = Color.yellow;

		// Initialize the entity grid
		entityGrid = new boolean[Constants.Width][Constants.Height];
		for(int i = 0; i < Constants.Width; i++)
		{
			for(int j = 0; j < Constants.Height; j++)
			{
				entityGrid[i][j] = false;
			}
		}

		// Create each species
		for(int i = 0; i < Constants.NumberOfSpecies; i++)
		{
			species[i] = new Species(i, colors[i]);
		}
	}
	
	public void Grow()
	{
		for(int i = 0; i < Constants.NumberOfSpecies; i++)
		{
			species[i].Grow();
		}
	}
	
	public void Build()
	{
		for(int i = 0; i < Constants.NumberOfSpecies; i++)
		{
			species[i].Build();
		}
	}
	
	public void Move()
	{
		
	}
	
	public void Interact()
	{
		
	}
	
	public void Draw()
	{
		display.repaint();
	}
	
	// ---------- Getters --------------------------------------------------
	public Display getDisplay() {return display;}
	public Species[] getSpecies() {return species;}
	public boolean[][] getEntityGrid() {return entityGrid;}
	
	// ---------- Setters --------------------------------------------------
	public void setDisplay(Display display) {this.display = display;}
	public void setSpecies(Species[] species) {this.species = species;}
	public void setEntityGrid(boolean[][] entityGrid) {this.entityGrid = entityGrid;}
}

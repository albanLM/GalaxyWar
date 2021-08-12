public class Constants
{
	// Caractéristiques de la galaxie
	public static final int Width = 20; // largeur de la grille galactique (en nombre de cases)
	public static final int Height = 15; // hauteur de la grille galactique (en nombre de cases)
	
	// Caractéristiques des planètes
	public static final int PlanetSizeMin = 10; // taille minimale d'une planète
	public static final int PlanetSizeMax = 100; // taille maximale d'une planète
	
	// Caractéristiques des vaisseaux
	public static final int ShipHealthMin = 1; // résistance minimale d'un vaisseau
	public static final int ShipHealthMax = 10; // résistance maximale d'un vaisseau
	
	// Caractéristiques des propulsions
	public static final int ReactorRangeMin = 1; // portée minimale d'une propulsion
	public static final int ReactorRangeMax = 5; // portée maximale d'une propulsion
	public static final int FuelCapacityMin = 10; // carburant minimal d'une propulsion
	public static final int FuelCapacityMax = 20; // carburant maximal d'une propulsion

	// Paramètres de la simulation
	public static final int RoundMax = 30; // nombre de tours maximum
	public static final int RoundTime = 2000; // durée d'un tour en millisecondes
	
	// Paramètres d'affichage
	public static final int GfxCase = 40; // taille des cases en pixel
	public static final int GfxPlaneteBase = 20; // taille de base des planètes en pixels
	public static final int GfxPlaneteFacteur = 5; // proportion des planètes relative à leur taille
	public static final int GfxVaisseauBase = 5; // taille de base des vaisseaux en pixels
	public static final int GfxVaisseauFacteur = 1; // proportion des vaisseaux relative à leur résistance
	
	// Paramètres de jeu
	public static final int NumberOfPlanets = 2; // nombre de planète de départ pour chaque espèce
	public static final int NumberOfSpecies = 4; // nombre d'espèce intervenant dans le jeu
	public static final int BirthRateMin = 5; // natalité minimale d'une espèce
	public static final int BirthRateMax = 10; // natalité maximale d'une espèce
	public static final int ProductivityMin = 1; // productivité minimale d'une espèce
	public static final int ProductivityMax = 5; // productivité maximale d'une espèce
}

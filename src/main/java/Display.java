import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Display extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int displayWidth;
	private int displayHeight;
	
	
	// ---------- Constructeurs --------------------------------------------------
	public Display()
	{		
		// Calcul des dimensions du panneau en fonction des paramètres de la galaxie
		displayWidth = Constants.Width * Constants.GfxCase;
		displayHeight = Constants.Height * Constants.GfxCase;
		setPreferredSize(new Dimension(displayWidth, displayHeight));
		new Window(this);
	}
	
	// ---------- Méthodes --------------------------------------------------
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		clear(g);
		drawGrid(g);
		drawEntities(g);
	}

	public void clear(Graphics g)
	{
		g.setColor(new Color(50, 50, 50));
		g.fillRect(0, 0, displayWidth - 1, displayHeight - 1);
	}
	
	public void drawGrid(Graphics g)
	{
		for(int i = 0; i < Constants.Width - 1; i++)
		{
			for(int j = 0; j < Constants.Height - 1; j++)
			{
				g.setColor(Color.white);
				g.drawLine(i * Constants.GfxCase, j * Constants.GfxCase, (i+1) * Constants.GfxCase, j * Constants.GfxCase);
				g.drawLine(i * Constants.GfxCase, j * Constants.GfxCase, (i) * Constants.GfxCase, (j+1) * Constants.GfxCase);
			}
		}
	}
	
	private void drawEntities(Graphics g)
	{
		//ArrayList<Entité> entités = Main.simulation.();
	}
}

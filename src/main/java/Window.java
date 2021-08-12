import javax.swing.JFrame;

public class Window extends JFrame
{
	private static final long serialVersionUID = 1L;

	public Window(Display pan) {
		// titrage de la fenêtre
		super("Galaxy Wars");
		
		// réglage des paramètres
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		
		// ajout de la grille
		getContentPane().add(pan);
		pack();
		
		// affichage centré
		setVisible(true);
		setLocationRelativeTo(null);
	}
}

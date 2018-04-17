import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Cups1 extends JFrame {
	
	int startX, startY, cupWidth, cupHeight;
	int baseLength;
	int cupSpacing;
	
	public Cups1() {
		super ("Rykal's Cups");
		
		startX = 100;
		startY = 300;
		cupWidth = 25;
		cupHeight = 40;
		baseLength = 7;
		cupSpacing = 6;
	}
	
	public void paint(Graphics g) {
		super.paint(g);					
		
		for (int i = 0; i < baseLength; i++) {					
			for (int j = 0; j < baseLength - i; j++) {
				startX = startX + cupWidth + cupSpacing;
				
			if ((baseLength - i) % 2 != 0) 
				g.setColor(Color.red);
			else 
				g.setColor(Color.blue);
			
			g.fillRect(startX, startY, cupWidth, cupHeight);
			}
			startX = startX - (baseLength - i) * 31 + 31/2;
			startY = startY - cupHeight;
		}
	}
	
	public static void main (String[] args) {
		Cups1 app = new Cups1();
		app.setSize(550, 550);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Cups2 extends JFrame{
	
	int startX;
	int startY;
	int nPoint;
	int cupWidth, cupHeight;
	int baseLength;
	int cupSpacing;
	
	public Cups2() {
		super ("Rykal's Cups");
		
		startX = 100;
		startY = 300;
		cupWidth = 25;
		cupHeight = 40;
		baseLength = 7;
		cupSpacing = 6;
	}
	
	public void paint(Graphics g) {
		int currentX = startX, currentY = startY;
		int len = baseLength;
				
		int[] xPoints = new int[4];
		int[] yPoints = new int[4];
				
		for (int row = 0; row < len; row++) // Draw pattern for each row
		{			
			if (row % 2 == 0)               // Set colors
				g.setColor(Color.red);
			else
				g.setColor(Color.blue);			
			
			for (int col = 0; col < (len - row); col++)     // Finish the pattern in each row
			{
				int x = currentX + col * (cupWidth + cupSpacing);
				int y = currentY;
				
				xPoints[0] = x + 5;            
				yPoints[0] = y;
				xPoints[1] = x + cupWidth - 5; 
				yPoints[1] = y;
				xPoints[2] = x + cupWidth;     
				yPoints[2] = y + cupHeight;
				xPoints[3] = x;                
				yPoints[3] = y + cupHeight;
				
				g.fillPolygon(xPoints, yPoints, xPoints.length);
			}			
			currentX += (cupWidth + cupSpacing) / 2; // The new row
			currentY -= cupHeight;
		}
	}

	public static void main(String[] args) {
		Cups2 app = new Cups2();
		app.setSize(550, 550);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
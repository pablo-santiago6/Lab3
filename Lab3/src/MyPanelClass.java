import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, height);
                        
                      //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                     //Draw a second border
                        int border2 = 4;
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 +border2, y1 + border2, width -border2*2, height -border2*2 );
            }
}
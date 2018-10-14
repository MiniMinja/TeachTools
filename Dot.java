import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Dot extends Sprite{
	private String key; 
	public Dot(int x, int y, int r, String key) {
		super(null, x, y, key);
		this.key = key;
		init(r);
	}
	
	public void init(int r) {
		this.image = new BufferedImage(2*r, 2*r,BufferedImage.TYPE_INT_ARGB);
		Graphics g = this.image.getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, r, r);
	}
	
	public String toString() {
		return key+" x: "+x+" y: "+y;
	}
}

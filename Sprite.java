import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sprite {
	protected BufferedImage image;
	protected int x, y;
	
	public Sprite(BufferedImage image, int x, int y, String key) {
		this.image = image;
		this.x = x;
		this.y = y;

		Handler.spritesheet.addSprite(this, key);
	}
	
	public void tick() {
		
	}
	public void render(Graphics g) {
		//Handler.test_render(g);
		g.drawImage(image, x, y, null);
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void dx(int dx) {
		this.x+=dx;
	}
	public void dy(int dy) {
		this.y+=dy;
	}
	public void x(int x) {
		this.x = x;
	}
	public void y(int y) {
		this.y = y;
	}
	public void moveX(int dx) {
		Handler.spritesheet.addAction(new MoveX(this, dx));
	}
	
	public void moveY(int dy) {
		Handler.spritesheet.addAction(new MoveY(this, dy));
	}
	public void setX(int x) {
		Handler.spritesheet.addAction(new SetX(this, x));
	}
	
	public void setY(int y) {
		Handler.spritesheet.addAction(new SetY(this, y));
	}
}


public class MoveX extends Action{
	private int dx;
	
	public MoveX(Sprite sprite, int dx) {
		super(sprite);
		this.dx = dx;
	}
	
	public void tick() {
		linkedSprite.dx(dx);
	}
	
	public String toString() {
		return ""+Handler.move_x_count++;
	}
}

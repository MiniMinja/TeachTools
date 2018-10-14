
public class MoveY extends Action{
	
	private int dy;
	
	public MoveY(Sprite sprite, int dy) {
		super(sprite);
		this.dy = dy;
	}
	
	public void tick() {
		linkedSprite.dy(dy);
	}
}


public class SetY extends Action{

	private int y;
	
	public SetY(Sprite toLinkSprite, int y) {
		super(toLinkSprite);
		
		this.y = y;
	}

	public void tick() {
		this.linkedSprite.y(y);
	}

}

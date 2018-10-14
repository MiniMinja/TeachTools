
public class SetX extends Action{

	private int x;
	
	public SetX(Sprite toLinkSprite, int x) {
		super(toLinkSprite);
		this.x = x;
	}
	
	public void tick() {
		this.linkedSprite.x(x);
	}

}

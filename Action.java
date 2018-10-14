
public abstract class Action {
	protected Sprite linkedSprite;
	
	public Action(Sprite toLinkSprite) {
		this.linkedSprite = toLinkSprite;
	}
	
	public abstract void tick();
}

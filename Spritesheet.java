import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Spritesheet {
	private ArrayList<Sprite> spritesheet = new ArrayList<Sprite>();
	private HashMap<String, Sprite> sprites = new HashMap<String, Sprite>();
	
	//Queue
	private LinkedList<Action> actions = new LinkedList<Action>();
	
	public void tick() {
		if(actions.size() > 0) {
			actions.poll().tick();
		}
		else {
			//System.out.println("No more Actions!");
		}
	}
	
	public void render(Graphics g) {
		for(Sprite s: spritesheet) {
			s.render(g);
		}
	}
	
	public void addSprite(Sprite sprite, String key) {
		spritesheet.add(sprite);
		sprites.put(key, sprite);
	}
	
	public Sprite getSprite(String key) {
		return sprites.get(key);
	}
	
	public void addAction(Action a) {
		actions.add(a);
	}
	
	public LinkedList<Action> getActions(){
		return actions;
	}
	
	public ArrayList<Sprite> getSprites(){
		return spritesheet;
	}
}

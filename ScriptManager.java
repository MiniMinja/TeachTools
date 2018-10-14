import java.util.ArrayList;

public class ScriptManager {
	private ArrayList<scr> scripts = new ArrayList<scr>();
	
	public void tick() {
		for(scr script: scripts) {
			script.script();
		}
	}
	
	public void addScript(scr script) {
		scripts.add(script);
	}
}


public class Script extends scr{
	Dot dot;
	
	public void init() {
		dot = new Dot(5, 5, 10, "dot");
	}
	
	public void script() {
		for(int i = 0;i<500;i++) {
			dot.moveX(1);
		}
	}

}

public class TestScript extends scr{

	public void init() {
		Dot end = new Dot(500, 15, 20, "end");
		Dot start = new Dot(10, 10, 20, "start");
		Dot dot = new Dot(10, 10, 10, "dot");
	}

	public void script() {
		for(int i = 0;i<500;i++)
			Handler.spritesheet.getSprite("dot").moveX(1);
	}

}

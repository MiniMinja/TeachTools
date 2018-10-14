import java.awt.Graphics;

public class Handler {
	public static boolean started = false;
	public static int move_x_count = 0;
	public static boolean running = false;
	public static Spritesheet spritesheet = new Spritesheet();
	public static ScriptManager script_manager = new ScriptManager();
	
	private static int x = 50;
	public static void test_render(Graphics g) {
		g.drawString("Sample", x++, 50);
	}
}

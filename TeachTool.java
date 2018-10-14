
public class TeachTool implements Runnable{
	private Mindow m;
	private Thread thread;
	
	public TeachTool(Mindow m) {
		this.m = m;
		thread = new Thread(this);
		
		//Handler.script_manager.addScript(new TestScript());
		Handler.script_manager.addScript(new Script());
	}
	
	public void run() {
		long start= System.nanoTime();
		System.out.println("Running");
		while(true) {
			if(System.nanoTime() - start > 11_000_000) {
				Handler.spritesheet.tick();
				
				m.render();
				start = System.nanoTime();
			}
			else {
				try {
					Thread.sleep(1);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void start() {
		Handler.script_manager.tick();
		//System.out.println(Handler.spritesheet.getActions());
		System.out.println(Handler.spritesheet.getSprites());
		thread.start();
	}
}

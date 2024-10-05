import java.awt.event.ActionEvent;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class MyFirstTimer extends GraphicsProgram {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes;
	private Timer t1;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		t1 = new Timer(1000, this);
		numTimes = 0;
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		t1.setInitialDelay(3000);
		t1.start();
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		numTimes++;
		myLabel.setLabel("times called? " + numTimes);
	    myLabel.move(5, 0);
	    if(numTimes == 10) t1.stop();
	}
}
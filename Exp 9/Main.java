package exp9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JApplet 
{
  // size of the applet window
  private final int MAX_WIDTH = 1500;
  private final int MAX_HEIGHT = 1000;
  private final int HORIZON = 500;

  // timer
  private final int DELAY = 50;
  private Timer timer;
  
  // background color in applet panel
  private Color backColor;
  // color of the sea
  private Color seaColor;
  
  // rgb values for backColor
  private int r, g, b;
  private float alpha;

  // used in setting value for r
  private double time;

  // Y Coordinate of the top of the sun
  private int sh;
  private int sw;
  private int shue;
  private int yCoord;

  private int seaBlue;
  private int seaGreen;
  private int numCalls;
  /**
   * Called by the browser or applet viewer to inform 
   * this Applet that it has been loaded into the 
   * system. It is always called before the first 
   * time that the start method is called.
   */
  public void init()
  {
      timer = new Timer(DELAY, null);
      timer.addActionListener(new MyTimerListener());
      
	r = 25;
	g = 25;
	b = 112;
	
	sh = 40;
	sw = 40;
	shue = 69;
	yCoord = 500;
	time = 0;
	numCalls = 0;
	backColor = new Color(r, g, b); 
	seaBlue = 139;
	seaGreen = 87;
	seaColor = new Color(0, seaGreen, seaBlue); 
	numCalls = 0;
  }

  /**
   * Starts the animation when the applet is started.
   * Called after init.
   */
  public void start ()
  {
      timer.start();
  }
  
  /**
   * Stops the animation when the applet is stopped.
   */
  public void stop ()
  {
      timer.stop();
  }
  
  /**
   * Here, the drawing of the applet gets done. 
   * Shows the sun setting.
   * @param  g   the Graphics object for this applet
   */
  public void paint(Graphics g)
  {
	g.setColor(backColor);
	g.fillRect(0, 0, MAX_WIDTH, HORIZON);
	
	if(yCoord < HORIZON) {
	    g.setColor(new Color (255,shue,0));
	    g.fillOval(600, yCoord, sh, sw);
	}
	
	g.setColor(seaColor);
	g.fillRect(0, HORIZON, MAX_WIDTH, MAX_HEIGHT - HORIZON);
  }
  
  /**
   * An internal class to implement ActionListener.
   * It must be internal to have access to the class's variables
   * and repaint.
   */
  private class MyTimerListener implements ActionListener
  {
      public void actionPerformed (ActionEvent event)
      {
	    numCalls++;
	    
	   if(r<135) r++ ;
	   if(g<206) g++ ;
	   if(b<235) b++ ;
	    
	    yCoord -= 1;
	    
	    if(sh<120 && (numCalls % 2 ==0) ) sh++;
	    if(sw<120 && (numCalls % 2 ==0) ) sw++;
	    
	    if (shue < 215) shue++;
	    
	    if(numCalls % 4 == 0) {
		if(seaBlue > 0) seaBlue++;
		if(seaGreen > 0) seaGreen++;
	    }
	    seaColor = new Color(0, seaGreen, seaBlue);
	    
	    backColor = new Color(r,g,b);
	    setBackground(backColor);
          repaint();
      }
  }
}
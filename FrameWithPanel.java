
import java.awt.*; 
import java.awt.event.*; 
public class FrameWithPanel implements WindowListener 
{ 
private Frame frame; 
private Panel panel; 

public FrameWithPanel() 
{ 
frame = new Frame("Frame With Panel"); 
panel = new Panel(); 
} 
public void show() 
{ 
frame.addWindowListener(this); 
frame.setSize(800, 600); 
frame.setBackground(Color.ORANGE); 
frame.setLayout(null); 

panel.setSize(300, 200); 
panel.setBackground(Color.MAGENTA); 
frame.add(panel); 
frame.setResizable(true); 
frame.setVisible(true); 
} 



@Override 
public void windowOpened(WindowEvent e) 
{ 
} 

@Override 
public void windowClosing(WindowEvent e) 
{ 
System.exit(0); 
} 

@Override 
public void windowClosed(WindowEvent e) 
{ 
} 

@Override 
public void windowIconified(WindowEvent e) 
{ 
} 

@Override 
public void windowDeiconified(WindowEvent e) 
{ 
} 

@Override 
public void windowActivated(WindowEvent e) 
{ 
} 

@Override 
public void windowDeactivated(WindowEvent e) 
{ 
} 

public static void main(String[] args) 
{ 
FrameWithPanel frameWithPanel = new FrameWithPanel(); 

frameWithPanel.show(); 
} 
} 


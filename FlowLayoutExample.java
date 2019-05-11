
import java.awt.*; 
import java.awt.event.*; 

public class FlowLayoutExample implements WindowListener 
{ 
private Frame frame; 
private Button[] button; 

public FlowLayoutExample() 
{ 
frame = new Frame("FlowLayout Example"); 

button = new Button[5]; 

for(int i = 0; i < button.length; i++) 
{ 
button[i] = new Button("Button " + (i + 1)); 
button[i].setFont( new Font("Consolas", Font.PLAIN, 16) ); 
} 
} 
private void show() 
{ 
frame.setLayout( new FlowLayout() ); 
//frame.setLayout( new FlowLayout(FlowLayout.LEFT) ); 
//frame.setLayout( new FlowLayout(FlowLayout.RIGHT) ); 
//frame.setLayout( new FlowLayout(FlowLayout.CENTER) ); 
//frame.setLayout( new FlowLayout(FlowLayout.CENTER, 50, 150) ); 
//frame.setLayout( new FlowLayout(FlowLayout.LEADING) ); 
//frame.setLayout( new FlowLayout(FlowLayout.TRAILING) ); 
for(int i = 0; i < button.length; i++) 
{ 
frame.add(button[i]); 
} 
frame.addWindowListener(this); 
frame.setSize(800, 600); 
frame.setResizable(true); 
frame.setBackground(Color.ORANGE); 
frame.setVisible(true); 
} 


@Override 
public void windowActivated(WindowEvent e) 
{ 
} 
@Override 
public void windowClosed(WindowEvent e) 
{ 
} 
@Override 
public void windowClosing(WindowEvent e) 
{ 
System.exit(0); 
} 
@Override 
public void windowDeactivated(WindowEvent e) 
{ 
} 
@Override 
public void windowDeiconified(WindowEvent e) 
{ 
} 
@Override 
public void windowIconified(WindowEvent e) 
{ 
} 
@Override 
public void windowOpened(WindowEvent e) 
{ 
} 
public static void main(String[] args) 
{ 
FlowLayoutExample flowLayoutExample = new FlowLayoutExample(); 
flowLayoutExample.show(); 
} 
} 


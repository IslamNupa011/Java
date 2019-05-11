
import java.awt.*; 
import java.awt.event.*; 
public class MouseMotionListenerExample implements WindowListener, MouseMotionListener 
{ 
private Frame frame; 
private TextField textField; 
public MouseMotionListenerExample() 
{ 
frame = new Frame("MouseMotionListener Example"); 
textField = new TextField(30); 
} 
private void show() 
{ 
Label label = new Label("Click and Drag the Mouse"); 
label.setFont( new Font("Consolas", Font.PLAIN, 20) ); 
label.setAlignment(Label.CENTER); 
//label.setAlignment(Label.LEFT); 
//label.setAlignment(Label.RIGHT); 
textField.setEditable(false); 
textField.setFocusable(false); 
textField.setFont( new Font("Consolas", Font.PLAIN, 16) ); 
frame.setLayout( new BorderLayout() ); 
frame.add(label, BorderLayout.NORTH); 
frame.add(textField, BorderLayout.SOUTH); 
frame.addWindowListener(this); 
frame.addMouseMotionListener(this); 
frame.setSize(800, 600); 
frame.setResizable(true); 
frame.setBackground(Color.ORANGE); 
frame.setVisible(true); 
} 


@Override 
public void mouseDragged(MouseEvent e) 
{ 
String string = "Mouse dragged at: " + e.getX() + ", " + e.getY(); 
textField.setText(string); 
} 
@Override 
public void mouseMoved(MouseEvent e) 
{ 
String string = "Mouse moved at: " + e.getX() + ", " + e.getY(); 
textField.setText(string); 
} 
@Override 
public void windowActivated(WindowEvent arg0) 
{ 
} 
@Override 
public void windowClosed(WindowEvent arg0) 
{ 
} 
@Override 
public void windowClosing(WindowEvent arg0) 
{ 
System.exit(0); 
} 
@Override 
public void windowDeactivated(WindowEvent arg0) 
{ 
} 
@Override 
public void windowDeiconified(WindowEvent arg0) 
{ 
} 
@Override 
public void windowIconified(WindowEvent arg0) 
{ 
} 


@Override 
public void windowOpened(WindowEvent arg0) 
{ 
} 
public static void main(String[] args) 
{ 
MouseMotionListenerExample a = new MouseMotionListenerExample(); 
a.show(); 
} 
} 


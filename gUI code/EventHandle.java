
package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class EventHandle implements WindowListener ,ActionListener {
    private Frame f;
    private Button b1;
    private Button b2;
    private Button b3;
    private TextField tf;
    
    public EventHandle(){
        f  = new Frame("Button Testing");
        b1 = new Button("YES"); // creating button
        b1.setActionCommand("0");
        b2 = new Button("NO");    // creating button
        b2.setActionCommand("No Button");
        b3 = new Button("CLEAR");   // creating button
        b3.setActionCommand("Clear Button");  
        tf = new TextField (30); // The text field will contain 30 characters
        
        
    }
    
    public void show(){
        b1.addActionListener(this); // adding action listener to the button
        b1.setForeground(Color.red);
        b1.setBackground(Color.blue);
        
        
        b2.addActionListener(this);  // adding action listener to the button
        b2.setForeground(Color.red);
        b2.setBackground(Color.green);
        
        b3.addActionListener(this);  // adding action listener to the button
        b3.setForeground(Color.blue);
        b3.setBackground(Color.white);
        
        tf.setForeground(Color.blue);
        tf.setBackground(Color.white);
        
        f.setLayout(new FlowLayout());
        
        f.add(b1);  // adding the button in the frame
        f.add(b2);  // adding the button in the frame
        f.add(b3);  // adding the button in the frame
        
        f.add(tf);   // adding the Text Field in the frame
        f.addWindowListener(this);
        f.setSize(250,150);  // setting the size of the frame
        f.setBackground(Color.red);
        f.setVisible(true);  // reveilging the frame
        
    }
    public static void main(String[] args){
        EventHandle object = new EventHandle();
        object.show();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     String str;
     if(e.getActionCommand()=="0"){
         str = "You Press Yes Button";
         tf.setText(str);
     }
     if(e.getActionCommand()=="No Button"){
         str = "You Press No Button";
         tf.setText(str);
     }
     if(e.getActionCommand()=="Clear Button"){
         str = " ";
         tf.setText(str);
     }
    }
    
}

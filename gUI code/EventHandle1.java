
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


public class EventHandle1 implements WindowListener,ActionListener{
    
    
    private Frame f;
    private Button b1,b2,b3;
    private TextField tf;
    
    
    public EventHandle1(){
        
        f = new Frame("Button Handling");
        
        b1 = new Button("YES");
        b1.setActionCommand("yes");
        b2 = new Button("NO");
        b2.setActionCommand("no");
        b3= new Button("CLEAR");
        b3.setActionCommand("clear");
        
        tf = new TextField(50);
        b1.addActionListener(this);
         b2.addActionListener(this);
          b3.addActionListener(this);
        
    }
    
    
    public void show(){
        
        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        f.addWindowListener(this);
        
        f.add(tf);
        f.setSize(500,500);
        f.setBackground(Color.GREEN);
        f.setVisible(true);
    }
    
    
    public static void main(String[] args){
        EventHandle1 obj = new EventHandle1();
        obj.show();
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    String str;
    if(e.getActionCommand()=="yes"){
        str = "You Have Pressed Yes";
        tf.setText(str);
    }
    if(e.getActionCommand()=="no"){
        str = "You Have Pressed No";
        tf.setText(str);
    }
    if(e.getActionCommand()=="clear"){
        str = "";
        tf.setText(str);
    }
    
    }
    
}

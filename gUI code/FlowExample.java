
package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class FlowExample implements WindowListener {
    
    private Frame f;
    private Button b1,b2,b3;
    
    public FlowExample(){
       
        f = new Frame("Flow Layout Example");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
    }
    
    public void lunchFrame(){
        //f.setLayout(new FlowLayout(FlowLayout.LEFT));
        //f.setLayout(new FlowLayout(FlowLayout.RIGHT));
       // f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setLayout(new FlowLayout(FlowLayout.RIGHT,20,30)); // At first we have to set the layout style, then add the buttons
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.addWindowListener(this);
        f.setSize(250,150);
        f.setBackground(Color.red);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        FlowExample object = new FlowExample();
        object.lunchFrame();
       
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}


package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class FrameWithPanel implements WindowListener {
    
    private Frame f;  // Frame is a class
    private Panel p;  // Panel is a class
    
    
    public FrameWithPanel(){
        f = new Frame("ALL-ROUNDER");
        p = new Panel();
    }
    
    public void circle(Graphics g){
         g.setColor(Color.RED);
        g.drawOval(480,480,200,200);
        g.fillOval(480, 480, 200, 200);
        
    }
    
    public void display(){
        f.addWindowListener(this);  // adding windowlistener in the frame
        f.setSize(400,400);
        f.setBackground(Color.GREEN);
        
        
        
        f.setLayout(null);
       
        p.setSize(500,150); // Setting the size of the panel
        p.setBackground(Color.GREEN);
        f.add(p); // Adding the panel into the frame
        f.setVisible(true);  // if it is false than the window will not appear
    }
    
    
    
    
    public static void main(String[] args){
        FrameWithPanel object = new FrameWithPanel();
        object.display();
        
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
    
}


package code_fo_rfinall;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Panel_In_Panel implements WindowListener {
    
    
    
    private Frame f;
    private Panel p1;
    private Panel p2;
    
    public Panel_In_Panel(){
        
        f = new Frame("Panel In Panel");
        
        p1 = new Panel();
        p2 = new Panel();
        
    }
    
    public void show(){
        
        f.addWindowListener(this);
        
        f.setSize(800,800);
        f.setBackground(Color.blue);
        
        p1.setSize(500,500);
        p2.setSize(250,250);
       
        
         p1.setBackground(Color.magenta);
          p2.setBackground(Color.red);
        

        f.add(p1);
        f.add(p2);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        
         Panel_In_Panel obj = new  Panel_In_Panel();
         obj.show();
        
        
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


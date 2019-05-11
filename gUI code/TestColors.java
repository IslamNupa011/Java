
package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class TestColors implements WindowListener,ActionListener {
    
    private Frame f;
    private Button b;
    
    public TestColors(){
        f = new Frame("Color Picker");
        b = new Button("Change Color");
        b.setActionCommand("Button Press");
        
    }
    
    public void lunchFrame(){
        b.addActionListener(this);
        b.setForeground(Color.red);
        b.setBackground(Color.yellow);
        f.add(b);
        f.addWindowListener(this);
        f.setSize(300,300);
       // f.setBackground(Color.green);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        TestColors c = new TestColors();
        c.lunchFrame();
                
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
    int x=0,y=0,z=0;
    x = (int) (Math.random()*100);
     y = (int) (Math.random()*100);
      z = (int) (Math.random()*100);
      Color c  = new Color(x,y,z);
      f.setBackground(c);
    }
}

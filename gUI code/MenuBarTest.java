
package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MenuBarTest implements WindowListener,ActionListener{
    
    private Frame f;
    private MenuBar mb;
    private Menu m1,m2,m3;
    private MenuItem mi1,mi2,mi3,mi4;
    
    public MenuBarTest(){
        f = new Frame("MenuBar Example");
        
        mb = new MenuBar();
        
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        
        
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("Load");
        mi4 = new MenuItem("Quit");
    }
    
    
    public void show(){
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        
        mi4.addActionListener(this);
        f.addWindowListener(this);
        
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setBackground(Color.BLUE);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        MenuBarTest obj = new MenuBarTest();
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

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.exit(0);
    }
    
}

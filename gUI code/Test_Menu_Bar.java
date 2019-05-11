
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

public class Test_Menu_Bar implements WindowListener,ActionListener {
    private Frame f;   // frame is a class
    private MenuBar mb;   // MenuBar is a class
    private Menu m1,m2,m3;  // Menu is a class 
    private MenuItem mi1,mi2,mi3,mi4;  // MenuItem is a class
    
    public Test_Menu_Bar(){
        f= new Frame("TURJO");
        mb = new MenuBar();
        m1 = new Menu("Info");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("Load");
        mi4 = new MenuItem("Close");
        
    }
    public void show(){
        mi4.addActionListener(this); // adding actionlistener
        m1.add(mi1); // adding menu option in the menu
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();  // adding a space line between two options
        m1.add(mi4);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        f.setMenuBar(mb);  // adding the menubar in the frame
        
        f.addWindowListener(this);
        f.setSize(400,400);
        f.setBackground(Color.BLUE);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        Test_Menu_Bar object = new Test_Menu_Bar();
        object.show();
        
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
     System.exit(0);
    }
    
}

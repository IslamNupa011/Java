
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class New_Window implements WindowListener,ActionListener
{
    private Frame frame;
    private MenuBar menubar;
    
    private Menu menu1;
    private Menu menu2;
    private Menu menu3;
    
    private MenuItem menuitem1;
    private MenuItem menuitem2;
    private MenuItem menuitem3;
    private MenuItem menuitem4;
    
    public New_Window()
            {
                frame = new Frame("DHAKA RACER THE GAME");
                
                menubar = new MenuBar();
                
                menu1 = new Menu("File");
                menu2 = new Menu("Edit");
                menu3 = new Menu("Help");
                
                menuitem1 = new MenuItem("New");
                menuitem2 = new MenuItem("Save");
                menuitem3 = new MenuItem("Load");
                menuitem4 = new MenuItem("Exit");
            }
    
    public void show()
    {
        menuitem1.addActionListener(this);
        menuitem4.addActionListener(this);
        
        
        menu1.add(menuitem1);
        menu1.add(menuitem2);
        menu1.add(menuitem3);
        
        menu1.addSeparator();
        
        menu1.add(menuitem4);
        
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.setHelpMenu(menu3);
        frame.setMenuBar(menubar);
        
        frame.addWindowListener(this);
        frame.setSize(800,600);
        frame.setBackground(Color.YELLOW);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        New_Window testmenubar = new New_Window();
        testmenubar.show();
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
        if(e.getSource()==menuitem1)
        {
            New_Window t = new  New_Window();
            t.show();
            
            frame.setVisible(false);
            //frame.setVisible(true); if it is true then , another winodw will be opended and new and old one both will be showed
        }
        else
        {
            if(e.getSource() == menuitem4)
            {
                System.exit(0);
            }
            
        }
    }
    
    
}


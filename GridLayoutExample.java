
package code_fo_rfinall;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample implements WindowListener{
    public Frame f;
    public Button[] b;
    public GridLayoutExample(){
        f=new Frame("Grid Layout");
        b=new Button[6];
        for(int i=0;i<b.length;i++){
            b[i]=new Button("Button"+(i+1));
        }
    }
    public void show(){
        f.setLayout(new GridLayout(2,3));
        for(int i=0;i<b.length;i++){
           f.add(b[i]);
        }
           //b[0].setBackground(Color.orange);
        f.addWindowListener(this);
        f.setSize(700,700);
        f.setBackground(Color.yellow);
        f.setVisible(true);
        f.setResizable(true);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
            System.exit(0);
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
    public static void main(String[] args){
        GridLayoutExample g=new GridLayoutExample();
        g.show();
    }
}

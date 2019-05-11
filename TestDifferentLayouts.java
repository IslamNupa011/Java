
package code_fo_rfinall;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;

public class TestDifferentLayouts implements WindowListener{
    public Frame f;
    public Panel[] p;
    public Button[][] b;
    public TestDifferentLayouts(){
        f=new Frame("Test Different Layouts");
        p=new Panel[4];
        for(int i=0;i<p.length;i++){
            p[i]=new Panel();
        }
        b=new Button[4][4];
        for(int counter=1, i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]=new Button("Button"+counter);
                counter++;
            }
        }
        
    }
    public void show(){
       p[0].setBackground(Color.red);
       p[0].setLayout(new FlowLayout());
       p[0].add(b[0][0]);
       p[0].add(b[0][1]);
       p[0].add(b[0][2]);
       p[0].add(b[0][3]);
       
        p[1].setBackground(Color.blue);
       p[1].setLayout(new GridLayout(2,2,20,20));
       p[1].add(b[1][0]);
       p[1].add(b[1][1]);
       p[1].add(b[1][2]);
       p[1].add(b[1][3]);
       
        p[2].setBackground(Color.green);
       p[2].setLayout(new BoxLayout(p[2],BoxLayout.X_AXIS));
       p[2].add(b[2][0]);
       p[2].add(b[2][1]);
       p[2].add(b[2][2]);
       p[2].add(b[2][3]);
       
        p[3].setBackground(Color.yellow);
       p[3].setLayout(new BorderLayout());
       p[3].add(b[3][0],BorderLayout.NORTH);
       p[3].add(b[3][1],BorderLayout.SOUTH);
       p[3].add(b[3][2],BorderLayout.EAST);
       p[3].add(b[3][3],BorderLayout.WEST);
       
       f.add(p[0]);
       f.add(p[1]);
       f.add(p[2]);
       f.add(p[3]);
       
       f.addWindowListener(this);
       f.setLayout(new GridLayout(2,2));
       f.setSize(800,800);
       f.setBackground(Color.white);
       f.setVisible(true);
       
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
        TestDifferentLayouts t=new TestDifferentLayouts();
        t.show();
    }
}

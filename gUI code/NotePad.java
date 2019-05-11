import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class NotePad implements WindowListener, ActionListener{

    private Frame f;
    private MenuBar mb;
    private Menu m1, m2;
    private MenuItem m1_A, m1_B, m1_C, m2_A;
    private TextArea ta;
    
    public NotePad(){
        f = new Frame("Notepad");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Help");
        m1_A = new MenuItem("Save");
        m1_A.setActionCommand("save");
        m1_B = new MenuItem("Edit");
        m1_C = new MenuItem("Exit");
        m1_C.setActionCommand("exit");
        m2_A = new MenuItem("Change Color");
        m2_A.setActionCommand("color");
        ta = new TextArea();
    }
    
    public void showFrame(){
        m1_A.addActionListener(this);
        m1_C.addActionListener(this);
        m2_A.addActionListener(this);
        
        mb.add(m1);
        mb.setHelpMenu(m2);
        
        m1.add(m1_A);
        m1.add(m1_B);
        m1.addSeparator();
        m1.add(m1_C);
        m2.add(m2_A);
        
        ta.setSize(200, 200);
        ta.setBackground(Color.blue);
        ta.setForeground(Color.white);
        
        f.setMenuBar(mb);
        f.add(ta);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);
        f.setSize(500, 500);
        f.setBackground(Color.yellow);
        f.setVisible(true);
    }
    
    public void saveFile(String str){
        File file = new File("D:", "TURJO86.txt");
        try{
            PrintWriter out = new PrintWriter(new FileWriter(file));
            out.println(str);
            out.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void actionPerformed(ActionEvent e){
        int r, g, b;
        if(e.getActionCommand()=="exit")
            System.exit(0);
        if(e.getActionCommand()=="color"){
            r = (int) (Math.random()*255);
            g = (int) (Math.random()*255);
            b = (int) (Math.random()*255);
            Color c = new Color(r, g, b);
            f.setBackground(c);
        }
        if(e.getActionCommand()=="save"){
            String str = ta.getText();
            saveFile(str);
        }
        
    }
    
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowClosed(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    
    public static void main(String[] args) {
        NotePad object = new NotePad();
        object.showFrame();
    }
    
}

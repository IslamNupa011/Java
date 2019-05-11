
package code_fo_rfinall;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Word_Count_With_GUI implements ActionListener{
    
    private Frame frame;
    private Button b1,b3;
    private TextField tf;
    private String result;
     private    int charcount = 0;
     private   int wordcount = 0;
        private int linecount = 0;
    
    
    public Word_Count_With_GUI(){
        
        frame = new Frame("COUNT");
        b1 = new Button("READ");
        
        b3 = new Button("EXIT");
        tf = new TextField(50);
    }
    
    public void show(){
        
        frame.setSize(400,400);
        frame.setBackground(Color.BLUE);
        frame.add(b1);
        frame.setLayout(new FlowLayout());
        frame.add(tf);
       
        frame.add(b3);
        b1.addActionListener(this);
       
        b3.addActionListener(this);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        Word_Count_With_GUI obj = new Word_Count_With_GUI();
        obj.show();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
      
        
        File file = new File("D:","advertisements.txt");
        
       try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            
            while(line!=null){
                
                linecount++;
                String[] words = line.split(" ");
                wordcount = wordcount+words.length;
                
                for(String word : words){
                    charcount = charcount +word.length();
                }
                line = reader.readLine();
                
                
            }
            reader.close();
             String result = " Line: "+linecount+" Word: "+wordcount+" Character: "+charcount;
              tf.setText(result);
           
       }catch(Exception ex){
           
           ex.printStackTrace();
       }
      }
        
        
        
         if(e.getSource()==b3){
            System.exit(0);
        }
        
        
    }
    
    
    
}


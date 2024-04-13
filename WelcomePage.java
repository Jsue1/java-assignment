package assignement;
import java.awt.*;
import java.awt.event.*;
 public class WelcomePage extends WindowAdapter implements ActionListener {
     Button btn1,btn2;
    Frame fr;
     WelcomePage(){
   fr=new Frame();
    Label l1=new Label("Welcome to QuickFood!");
     btn1=new Button("View Menu");
     btn2=new Button("Place Order");
      fr.add(l1);
      fr.add(btn1);
           fr.add(btn2);
    fr.setSize(600,400);
    fr.setTitle("QuickFood Order Management");
    fr.setLayout(new FlowLayout());
    fr.setVisible(true);
    }
    public static void main(String[] args){
       new WelcomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}


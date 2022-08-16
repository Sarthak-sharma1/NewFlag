package  com.MyFlag;
import javax.swing.*;

public class MyFrame extends JFrame {

                     MyFlag panel = new MyFlag();
                      MyFrame(){
                          setTitle("Happy Independence Day");
                          setSize(450,600);
                          setLocationRelativeTo(null);
                          setDefaultCloseOperation(EXIT_ON_CLOSE);
                          add(panel);
                          setResizable(false);
                          setVisible(true);

                      }


}

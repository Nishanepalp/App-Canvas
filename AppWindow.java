import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppWindow  extends JFrame {

    public void init() {

        setTitle("My First Java Window");
        var cp= getContentPane();
        var canvas = new AppCanvas();
        cp.add(canvas, BorderLayout.CENTER);

JButton button = new JButton("Luck Number");


cp.add (button, BorderLayout.SOUTH);
button.addActionListener(e -> {
    var r = new Random();
   int n = r.nextInt(101);
   canvas.randomNumber = n;
   canvas.repaint();
   



   



});


    }
    
}

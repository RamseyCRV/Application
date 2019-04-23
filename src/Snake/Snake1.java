package Snake;

import javax.swing.JFrame;

public class Snake1 extends JFrame {

    private static final long serialVersionUID=1L;
    public Snake1(){
        add(new Snake());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);
        setTitle("Snake");

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[]args) {
        new Snake1();
    }
}

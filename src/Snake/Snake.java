package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Snake extends JPanel implements ActionListener {

    private static final long serialVersionUID=1L;
    private final int WIDTH=300;
    private final int HEIGHT=300;
    private final int DOT_SIZE=10;
    private final int ALL_DOTS=900;
    private final int RAND_POS=29;
    private final int DELAY=140;

    private int x[]=new int[ALL_DOTS];
    private int y[]=new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean left=false;
    private boolean right=true;
    private boolean up=false;
    private boolean down=false;
    private boolean inGame=true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

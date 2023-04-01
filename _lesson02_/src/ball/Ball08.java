package ball;

import javax.swing.*;
import java.awt.*;

public class Ball08 extends JFrame {
    // MOVE-RETURN DIAGONAL
    int x = 30;
    int y = 30;
    boolean down = true;

    void moveBall() {
        if (this.x < 265 && this.down) {
            this.x++;
            this.y++;
        } else {
            this.down = false;
        }
        if (this.down == false && this.x != 40) {
            this.x--;
            this.y--;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        //SOFTENS THE EDGES OF THE BALL
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {

        Ball08 obj = new Ball08();
        obj.setBounds(0, 0, 300, 300);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            obj.moveBall();
            obj.repaint();
            Thread.sleep(20L);
        }
    }
}

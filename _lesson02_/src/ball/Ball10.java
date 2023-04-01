package ball;

import javax.swing.*;
import java.awt.*;

public class Ball10 extends JFrame {
    // PING PONG BALL
    int x = 30;
    int y = 30;
    int speedx = 5;
    int speedy = 1;
    
    void moveBall() {
        this.x += this.speedx;
        this.y += this.speedy;
        if (this.x >= 265) {
            this.x = 265;
            this.speedx = -this.speedx;
        }

        if (this.y >= 265) {
            this.y = 265;
            this.speedy = -this.speedy;
        }

        if (this.y <= 5) {
            this.y = 5;
            this.speedy = -this.speedy;
        }

        if (this.x <= 5) {
            this.x = 5;
            this.speedx = -this.speedx;
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

        Ball10 obj = new Ball10();
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

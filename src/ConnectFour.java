import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConnectFour extends JPanel{



    private int[][] board;
    private boolean[][] isYellow;
    private boolean[][] isRed;
    private int col;


    public ConnectFour(int w, int h) {
        board = new int[3][3];
        this.col = 0;


    }


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.drawLine(100,200,100,800);
        g2.drawLine(200,200,200,800);
        g2.drawLine(300,200,300,800);
        g2.drawLine(400,200,400,800);
        g2.drawLine(500,200,500,800);
        g2.drawLine(600,200,600,800);
        g2.drawLine(0,200,700,200);
        g2.drawLine(0,300,700,300);
        g2.drawLine(0,400,700,400);
        g2.drawLine(0,500,700,500);
        g2.drawLine(0,600,700,600);
        g2.drawLine(0,700,700,700);



        //Rows


}
}

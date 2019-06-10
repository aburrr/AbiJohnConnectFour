import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConnectFour extends JPanel{
    private int[][] board = new int[6][7];
    private boolean color;



    public ConnectFour(int w, int h) {
        setUpMouseListener();
    }

    public void setUpMouseListener(){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                for (int r = board.length - 1; r >= 0; r--) {
                    if(x < 100 && y < 200 && y > 100){
                        if(board[r][0] == 0 && color == false){
                            board[r][0] = 1;
                            break;
                        }else if(board[r][0] == 0 && color == true){
                            board[r][0] = 2;
                            break;
                        }

                    }
                }
                for (int r = board.length -1; r >= 0; r--) {
                    if(x < 200 && x > 100 && y < 200 && y > 100){
                        if(board[r][1] == 0 && color == false){
                            board[r][1] = 1;
                            break;
                        }else if(board[r][1] == 0 && color == true){
                            board[r][1] = 2;
                            break;
                        }
                    }
                }
                for (int r = board.length - 1; r >= 0; r--) {
                    if(x < 300 && x > 200 && y < 200 && y > 100){
                        if(board[r][2] == 0 && color == false){
                            board[r][2] = 1;
                            break;
                        }else if (board[r][2] == 0 && color == true){
                            board[r][2] = 2;
                            break;
                        }
                    }
                }
                for (int r = board.length -1; r >= 0; r--) {
                    if(x < 400 && x > 300 && y < 200 && y > 100){
                        if(board[r][3] == 0 && color == false){
                            board[r][3] = 1;
                            break;
                        }else if(board[r][3] == 0 && color == true){
                            board[r][3] = 2;
                            break;
                        }
                    }
                }
                for (int r = board.length - 1; r >= 0; r--) {
                    if(x < 500 && x > 400 && y < 200 && y > 100){
                        if(board[r][4] == 0 && color == false){
                            board[r][4] = 1;
                            break;
                        }else if(board[r][4] == 0 && color == true){
                            board[r][4] = 2;
                            break;
                        }
                    }
                }
                for (int r = board.length - 1; r >= 0; r--) {
                    if(x < 600 && x > 500 && y < 200 && y > 100){
                        if(board[r][5] == 0 && color == false){
                            board[r][5] = 1;
                            break;
                        }else if(board[r][5] == 0 && color == true){
                            board[r][5] = 2;
                            break;
                        }
                    }
                }
                for (int r = board.length - 1; r >= 0; r--) {
                    if(x < 700 && x > 600 && y < 200 && y > 100){
                        if(board[r][6] == 0 && color == false){
                            board[r][6] = 1;
                            break;
                        }else if(board[r][6] == 0 && color == true){
                            board[r][6] = 2;
                            break;
                        }
                    }
                }
                color = !color;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {


            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

    }

    public boolean winHori(){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length - 3; c++) {
                if (board[r][c] != 0 && board[r][c] == board[r][c + 1] && board[r][c] == board[r][c + 2] && board[r][c]
                        == board[r][c + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean winVert(){
        for (int r = 0; r < board.length - 3; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(board[r][c] != 0 && board[r][c] == board[r+1][c] && board[r][c] == board[r+2][c] && board[r][c] == board[r+3][c]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean winDiag(){
        int y = board.length;
        int x = board[0].length;
        for (int r = 0; r < board.length - 3; r++) {
            for (int c = 0; c < board[0].length - 3; c++) {
                if(board[r][c] != 0){
                    if(board[r][c] == board[r+1][c+1] && board[r][c] == board[r+2][c+2] && board[r][c] == board[r+3][c+3]){
                        return true;
                    }
                }
            }
        }

        for (int r = 0; r < y - 3; r++) {
            for (int c = 3; c < x; c++) {
                if(board[r][c] != 0){
                    if(board[r][c] == board[r+1][c-1] && board[r][c] == board[r+2][c-2] && board[r][c] == board[r+3][c-3]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //background
        g2.setColor(new Color(0, 5, 180));
        g2.fillRect(0, 0, 700, 800);

        //lines
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(100, 200, 100, 800);
        g2.drawLine(200, 200, 200, 800);
        g2.drawLine(300, 200, 300, 800);
        g2.drawLine(400, 200, 400, 800);
        g2.drawLine(500, 200, 500, 800);
        g2.drawLine(600, 200, 600, 800);
        g2.drawLine(0, 200, 700, 200);
        g2.drawLine(0, 300, 700, 300);
        g2.drawLine(0, 400, 700, 400);
        g2.drawLine(0, 500, 700, 500);
        g2.drawLine(0, 600, 700, 600);
        g2.drawLine(0, 700, 700, 700);

        //dots
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 1) {
                    g2.setColor(Color.red);
                    g2.fillOval(100 * c + 10, 100 * r + 210, 80, 80);
                } else if (board[r][c] == 2) {
                    g2.setColor(Color.yellow);
                    g2.fillOval(100 * c + 10, 100 * r + 210, 80, 80);
                }

            }
        }

        g2.setColor(Color.BLACK);
        g2.fillRect(10, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 15, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(110, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 115, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(210, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 215, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(310, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 315, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(410, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 415, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(510, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 515, 155);

        g2.setColor(Color.BLACK);
        g2.fillRect(610, 125, 80, 50);
        g2.setColor(Color.white);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Click Here", 615, 155);

        if (winVert() || winHori() || winDiag()) {
            g2.setColor(new Color(251, 249, 255, 225));
            g2.fillRect(0, 0, 700, 800);
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Serif", Font.BOLD, 80));
            g2.drawString("You Won!", 173, 400);
            g2.setFont(new Font("Serif", Font.BOLD, 50));
            g2.drawString("Press SPACE to Restart", 93, 470);
        }
    }
}

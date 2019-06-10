import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConnectFour extends JPanel{
    private int[][] board = new int[6][7];
    private Spaces[][] spaces = new Spaces[6][7];
    private boolean color, WIN;




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


    public boolean winVert(){
        for (int r = 0; r < board.length - 3; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(board[r][c] != 0 && board[r][c] == board[r+1][c] && board[r][c] == board[r+2][c] && board[r][c] == board[r+3][c]){
                    System.out.println("WIN");
                    return true;
                }
            }
        }

        return false;
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if(board[r][c] == 1){
                    g2.setColor(Color.red);
                    g2.fillOval(100 * c , 100 * r + 200, 100, 100);
                }else if(board[r][c] == 2){
                    g2.setColor(Color.yellow);
                    g2.fillOval(100 * c , 100 * r + 200, 100, 100);
                }

            }
        }
        if(winVert()){
            g2.drawString("WIN", 50, 50);
        }


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
    }
}

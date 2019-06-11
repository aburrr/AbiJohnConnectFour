import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Abi and John Connect Four");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 700;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));


        JPanel panel = new ConnectFour(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
    public static class AL implements ActionListener{
        public final void actionPerformed(ActionEvent e){
            music();
        }
    public static void music()
    {

        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("C:\\Mii Channel Music.wmv");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);

        }

        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }

        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }


}
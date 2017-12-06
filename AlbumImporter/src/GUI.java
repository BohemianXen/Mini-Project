import javax.swing.*;
import java.awt.*;

public class GUI {
    GUI(){
        JFrame main = new JFrame("Album Importer");
        main.setSize(600, 900);
        main.setResizable(false);
        main.setLayout(new GridLayout());
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        main.setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> new GUI());
    }
}

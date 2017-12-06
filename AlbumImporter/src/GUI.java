import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import SwingUtils.SwingUtils;

public class GUI {
    GUI(){

        // Main frame initialisations
        JFrame main = new JFrame("Album Importer");
        main.setSize(600, 1000);
        main.setResizable(false);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String font = "TW Cent";

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.insets = new Insets(0,0,20,0);
        main.setLayout(grid);


        // Static labels
        JLabel title = new JLabel("iTunes Album Importer", SwingConstants.CENTER);
        title.setFont(new Font(font, Font.BOLD, 20));
        c.gridy = 0;
        main.add(title, c);

        JLabel status = new JLabel("Status: Waiting", SwingConstants.CENTER);
        status.setFont(new Font(font, Font.PLAIN, 12));
        c.gridy = 3;
        main.add(status, c);

        // File browser
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\blaze\\Desktop\\Media\\Music");
        fileChooser.setFont(new Font(font, Font.PLAIN, 12));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setControlButtonsAreShown(false);
        fileChooser.setMultiSelectionEnabled(true);
        c.gridy = 1;
        c.ipady = 10;
        main.add(fileChooser, c);

        // Sort directories by descending Date Modified
        Action details = fileChooser.getActionMap().get("viewTypeDetails");
        details.actionPerformed(null);
        JTable table = SwingUtils.getDescendantsOfType(JTable.class, fileChooser).get(0);
        table.getRowSorter().toggleSortOrder(3);
        table.getRowSorter().toggleSortOrder(3);

        // Run button
        JButton run = new JButton("Run");
        c.gridy = 2;
        main.add(run, c);

        // Console
        JTextArea console = new JTextArea(25, 1 );
        console.setEditable(false);
        console.setBorder(new TitledBorder("Console"));
        JScrollPane scroller = new JScrollPane(console);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        DefaultCaret caret = (DefaultCaret)console.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        console.setFont(new Font(font, Font.ITALIC, 12));

        c.gridy = 4;
        main.add(scroller, c);

        main.setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> new GUI());
    }
}

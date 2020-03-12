import java.util.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridBag extends JFrame {

    private GridBagConstraints constraints;

    public Gui() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();

        addHeadingLabel();
    }

    private void addHeadingLabel() {
        JLabel headingLabel = new JLabel("Heading");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        this.add(headingLabel, constraints);
    }

    public static void main(String[] args)
    {
        GridBag gui = new GridBag();
        gui.setVisible(true);
    }
}

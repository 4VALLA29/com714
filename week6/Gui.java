import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {
// attributes
JPanel controlPanel;
JPanel greetingPanel;

// constructors
public Gui() {

// set window properties
this.setLayout(new BorderLayout());
this.setSize(new Dimension(500, 500));

// add components
addGreetingPanel();
addGreetingTextField();
addGreetingButton();

addControlPanel();
addOpenButton();
addCloseButton();
}

// methods
private void addControlPanel() {
controlPanel = new JPanel();
this.add(controlPanel, BorderLayout.SOUTH);
}

private void addOpenButton() {
JButton openButton = new JButton("Open");
controlPanel.add(openButton);
}

private void addCloseButton() {
JButton closeButton = new JButton("Close");
controlPanel.add(closeButton);
}

private void addGreetingButton() {
// create
JButton greetingButton = new JButton("Display Greeting");
// style
// events
// add to parent
greetingPanel.add(greetingButton);
}

private void addGreetingPanel() {
greetingPanel = new JPanel();
this.add(greetingPanel, BorderLayout.NORTH);
}

private void addGreetingTextField() {
JTextField greetingTextField = new JTextField();
greetingTextField.setPreferredSize(new Dimension(200, 50));
greetingPanel.add(greetingTextField);
}

public static void main(String[] args) {
Gui gui = new Gui();
gui.setVisible(true);
}
}

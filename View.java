import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class View implements IView, Observer {
    // Interfaces for model and controller
    private IModel model;
    private ActionListener controller;

    // GUI Elements
    private JComboBox dropDown;
    private JButton getPos;
    private JButton setPos;
    private JTextField input;
    private JLabel output;
    private JFrame frame;
    private JPanel panel;

    /**
     * Constructore for view
     * requires: model != null
     * effects builds view
     */
    public View(IModel model) {
        this.model = model;
        model.addObserver(this);
        controller = new Controller(this, model);
        buildButtons();
        setButtons();
        buildTextFields();
        buildGUI();

    }

    /**
     * effects: Adds listeners to buttons and set there command string
     */
    private void setButtons() {
        dropDown.setActionCommand("dropdown");
        getPos.setActionCommand("getmoves");// IMPORTANT must match controllers actionPerformed
        setPos.setActionCommand("setpos");

        dropDown.addActionListener(controller);
        getPos.addActionListener(controller);
        setPos.addActionListener(controller);

    }

    /**
     * effects: creates button objects and sets their text
     */
    private void buildButtons() {
        String[] optionsToChoose = { "King", "Queen", "Rook", "Bishop", "Knight", "Black Pawn", "White Pawn" };
        dropDown = new JComboBox<>(optionsToChoose);
        getPos = new JButton();
        setPos = new JButton();

        getPos.setText("Get Possible Moves");
        setPos.setText("Set Position");

    }

    /**
     * effects: builds the label and textfield
     */
    private void buildTextFields() {
        input = new JTextField();

        output = new JLabel();

    }

    /**
     * effects: builds the gui
     */
    private void buildGUI() {
        frame = new JFrame();
        panel = new JPanel();
        panel.add(dropDown);
        panel.add(getPos);
        panel.add(setPos);
        panel.add(input);
        panel.add(output);
        panel.setLayout(new GridLayout(5, 1));
        frame.add(panel);
        frame.pack();
        update(null, null);// kind of cheating but good way to initialise gui

        frame.setVisible(true);

    }

    /**
     * requires: input.getText() != null
     * effects: returns a string of the input
     */
    @Override
    public String getInput() {
        return input.getText();
    }

    /**
     * METHOD for updating VARIABLES
     *
     *
     */

    public String getPiece() {
        return "" + dropDown.getItemAt(dropDown.getSelectedIndex());
    }

    public void outputPos() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> positions = model.getPos();
        for (String i : positions) {
            sb.append(i == null ? "" : i.toString() + " ");
        }
        output.setText(sb.toString());
        System.out.println("The possible moves are " + sb.toString());
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("UPDATE");

    }

    public void clearOutput() {

        output.setText(null);
        ;

    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    // Fields for Interfaces
    private IView view;
    private IModel model;

    /**
     * Class SHOULD NOT CONTAIN ACTUAL REFERENCES TO OBJECTS ONLY INTERFACES
     * 
     * @param view  View Interface
     * @param model Model Interface
     */
    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        System.out.println("HERE");
        if (e.getActionCommand().equals("getmoves")) {
            model.getPos();
            view.outputPos();
        } else if (e.getActionCommand().equals("setpos")) {
            model.setPos(view.getInput());
            view.clearOutput();
        } else if (e.getActionCommand().equals("dropdown")) {
            model.setPiece(view.getPiece());
        } else {
            System.out.println("INVALID ");
        }
    }
}
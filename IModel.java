
import java.util.ArrayList;
import java.util.Observer;

public interface IModel {

    ArrayList getPos();

    void setPos(String Pos);

    void setPiece(String Piece);

    void addObserver(Observer o);

}

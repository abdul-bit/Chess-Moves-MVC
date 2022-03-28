import java.io.ObjectStreamException;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Collections;

public class Model extends Observable implements IModel {
        private String Piece;
        private String Pos;

        public Model(String startPiece, String StartPos) {
                Pos = StartPos;
                Piece = startPiece;
        }

        @Override
        public void setPiece(String Piece) {
                this.Piece = Piece;
                System.out.println("Piece is " + Piece);
                setChanged();// set the observaable object ie the model to changed
                notifyObservers();// notify all the observers

        }

        @Override
        public void setPos(String Pos) {

                this.Pos = Pos;
                System.out.println("Position is " + Pos);

                setChanged();// set the observaable object ie the model to changed
                notifyObservers();// notify all the observers
        }

        @Override
        public ArrayList getPos() {
                ArrayList<String> possiblemoves = new ArrayList<String>();
                if (this.Piece.equals("King")) {

                        if (this.Pos.charAt(0) != 97 && this.Pos.charAt(1) != 49 && this.Pos.charAt(0) != 104
                                        && this.Pos.charAt(1) != 56) {

                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                        } else if (this.Pos.charAt(0) == 97 && this.Pos.charAt(0) != 49) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                        } else if (this.Pos.charAt(0) == 104 && this.Pos.charAt(0) != 49) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                        } else if (this.Pos.charAt(0) != 104 && this.Pos.charAt(0) == 56) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));

                        } else if (this.Pos.charAt(0) != 104 && this.Pos.charAt(0) == 49) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0))))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + 1))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - 1)))
                                                + String.valueOf((char) ((this.Pos.charAt(1)))));

                        }

                } else if (this.Piece.equals("Bishop")) {
                        int i = 1;

                        while (((this.Pos.charAt(0) - i) >= 97) && ((this.Pos.charAt(1) - i) >= 49)) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - i)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - i))));
                                i = i + 1;
                        }
                        i = 1;
                        while (((this.Pos.charAt(0) + i) <= 104) && ((this.Pos.charAt(1) + i) <= 56)) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + i)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + i))));
                                i = i + 1;

                        }
                        i = 1;
                        while (((this.Pos.charAt(0) - i) >= 97) && ((this.Pos.charAt(1) + i) <= 56)) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) - i)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) + i))));
                                i = i + 1;
                        }
                        i = 1;
                        while (((this.Pos.charAt(0) + i) <= 104) && ((this.Pos.charAt(1) - i) >= 49)) {
                                possiblemoves.add(String.valueOf((char) ((this.Pos.charAt(0) + i)))
                                                + String.valueOf((char) ((this.Pos.charAt(1) - i))));
                                i = i + 1;
                        }
                        // (i.charAt(0)< 97) || (i.charAt(0)> 104) || (i.charAt(1)<49) ||
                        // (i.charAt(1)>56)
                }
                possiblemoves.removeIf(i -> ((i.charAt(0) < 97) || (i.charAt(0) > 104) || (i.charAt(1) < 49)
                                || (i.charAt(1) > 56)));
                Collections.sort(possiblemoves);
                return possiblemoves;

        }

        @Override
        public void addObserver(Observer o) {
                super.addObserver(o);

        }

}

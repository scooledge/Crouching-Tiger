/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cooledge
 */
public class Model {

    String player1, player2;

    //listeners is the list
    List<ModelListener> listeners = new ArrayList<>();

    //listener is the thing i am adding to the list
    public boolean addListener(ModelListener listener) {

        return listeners.add(listener);

    }

    public boolean removeListener(ModelListener listener) {

        return listeners.remove(listener);

    }

    private void notifyListeners() {

        for (ModelListener listener : listeners) {

            listener.update();
        }

    }

    public void setPlayerNames(String p1name, String p2name) {

        player1 = p1name;
        player2 = p2name;

        notifyListeners();

    }

    public String getPlayer1Name() {

        return player1;
    }

    public String getPlayer2Name() {

        return player2;
    }
}

package observer;

import java.util.ArrayList;

public class UsuarioObserver {

    private ArrayList<Observer> lista = new ArrayList<>();

    public void add(Observer o) {
        lista.add(o);
    }

    public void notificar(String msg) {
        for (Observer o : lista)
            o.atualizar(msg);
    }
}
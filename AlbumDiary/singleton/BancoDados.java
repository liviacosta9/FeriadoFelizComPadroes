package singleton;

import java.util.ArrayList;
import model.Avaliacao;

public class BancoDados {

    private static BancoDados instancia;

    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    private BancoDados() {}

    public static BancoDados getInstance() {

        if (instancia == null)
            instancia = new BancoDados();

        return instancia;
    }

    public void salvarAvaliacao(Avaliacao a) {

        avaliacoes.add(a);

        System.out.println("Avaliação salva com sucesso!");
    }

    public void listarAvaliacoes() {

        for (Avaliacao a : avaliacoes)
            a.mostrar();
    }
}
package templatemethod;

import model.Avaliacao;
import singleton.BancoDados;

public class AvaliacaoPadrao extends TemplateAvaliacao {

    private Avaliacao avaliacao;

    public AvaliacaoPadrao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    void validar() {

        if (avaliacao == null)
            throw new RuntimeException("Erro na avaliação");

        System.out.println("Validando avaliação...");
    }

    void salvar() {

        BancoDados.getInstance().salvarAvaliacao(avaliacao);
    }
}
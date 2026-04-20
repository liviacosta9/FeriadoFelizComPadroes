package templatemethod;

public abstract class TemplateAvaliacao {

    public final void avaliar() {
        validar();
        salvar();
        notificar();
    }

    abstract void validar();
    abstract void salvar();

    void notificar() {
        System.out.println("Notificando seguidores...");
    }
}
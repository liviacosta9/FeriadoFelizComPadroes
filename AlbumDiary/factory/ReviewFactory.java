package factory;

public class ReviewFactory {

    public static Review criar(String tipo) {
        if (tipo.equals("simples"))
            return new ReviewSimples();
        else
            return new ReviewCompleta();
    }
}
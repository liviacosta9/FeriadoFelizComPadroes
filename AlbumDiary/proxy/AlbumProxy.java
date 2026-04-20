package proxy;

import model.Usuario;

public class AlbumProxy {

    public void acessar(Usuario u) {
        if (u.isPremium())
            System.out.println("Acesso completo liberado");
        else
            System.out.println("Acesso limitado (free)");
    }
}
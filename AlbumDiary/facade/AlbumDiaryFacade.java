package facade;

import model.*;
import templatemethod.AvaliacaoPadrao;

public class AlbumDiaryFacade {

    public void avaliarAlbum(Usuario usuario,
                            Album album,
                            int nota,
                            String comentario) {

        Avaliacao avaliacao =
                new Avaliacao(usuario, album, nota, comentario);

        AvaliacaoPadrao fluxo =
                new AvaliacaoPadrao(avaliacao);

        fluxo.avaliar();
    }
}
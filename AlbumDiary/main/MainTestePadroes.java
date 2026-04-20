package main;

import model.*;
import facade.*;
import observer.*;
import proxy.*;
import templatemethod.*;
import visitor.*;

public class MainTestePadroes {

    public static void main(String[] args) {

        Usuario user = new Usuario("Livia", true);

        Album album =
                new Album("OK Computer", "Radiohead");

        AlbumDiaryFacade facade =
                new AlbumDiaryFacade();

        facade.avaliarAlbum(
                user,
                album,
                5,
                "Excelente álbum"
        );

        UsuarioObserver obs =
                new UsuarioObserver();

        obs.add(user);

        obs.notificar("Nova atividade!");

        AlbumProxy proxy =
                new AlbumProxy();

        proxy.acessar(user);

        Avaliacao avaliacao =
                new Avaliacao(
                        user,
                        album,
                        5,
                        "Excelente álbum"
                );

        TemplateAvaliacao t =
                new AvaliacaoPadrao(avaliacao);

        t.avaliar();

        ExportVisitor visitor =
                new ExportVisitor();

        album.accept(visitor);
    }
}
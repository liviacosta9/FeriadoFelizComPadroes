package main;

import java.util.Scanner;

import facade.AlbumDiaryFacade;
import model.Album;
import model.Usuario;
import singleton.BancoDados;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Livia", true);

        AlbumDiaryFacade facade =
                new AlbumDiaryFacade();

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== ALBUM DIARY ===");
            System.out.println("1 - Avaliar álbum");
            System.out.println("2 - Listar avaliações");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.println("Nome do álbum:");
                String nomeAlbum = sc.nextLine();

                System.out.println("Artista:");
                String artista = sc.nextLine();

                Album album =
                        new Album(nomeAlbum, artista);

                System.out.println("Nota (1-5):");
                int nota = sc.nextInt();
                sc.nextLine();

                System.out.println("Comentário:");
                String comentario = sc.nextLine();

                facade.avaliarAlbum(
                        usuario,
                        album,
                        nota,
                        comentario
                );
            }

            else if (opcao == 2) {

                BancoDados.getInstance()
                        .listarAvaliacoes();
            }
        }

        sc.close();
    }
}
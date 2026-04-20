package model;

public class Avaliacao {

    private Usuario usuario;
    private Album album;
    private int nota;
    private String comentario;

    public Avaliacao(Usuario usuario, Album album, int nota, String comentario) {
        this.usuario = usuario;
        this.album = album;
        this.nota = nota;
        this.comentario = comentario;
    }

    public void mostrar() {

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Álbum: " + album.getNome());
        System.out.println("Artista: " + album.getArtista());
        System.out.println("Nota: " + nota);
        System.out.println("Comentário: " + comentario);
    }
}
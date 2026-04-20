package adapter;

import model.Album;

public class SpotifyAdapter {

    private SpotifyAlbum spotify;

    public SpotifyAdapter(SpotifyAlbum s) {
        this.spotify = s;
    }

    public Album converter() {
        return new Album(spotify.getData(), "Artista API");
    }
}
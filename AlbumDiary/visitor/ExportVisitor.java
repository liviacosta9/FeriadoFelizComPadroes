package visitor;

import model.Album;

public class ExportVisitor implements Visitor {

    public void visit(Album a) {
        System.out.println("Exportando álbum: " + a.getNome());
    }
}
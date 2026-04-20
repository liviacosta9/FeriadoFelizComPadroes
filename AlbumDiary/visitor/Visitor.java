package visitor;

import model.Album;

public interface Visitor {
    void visit(Album a);
}
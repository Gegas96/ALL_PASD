public class NodeFilm {
    Film data;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, Film data, NodeFilm next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

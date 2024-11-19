public abstract class Piece {
    protected Position a;
    protected String side = "White";
    public abstract boolean isLegalMove(Position b);
    public Piece(Position a, String side) {
        this.a = a;
        this.side = side;
    }
}
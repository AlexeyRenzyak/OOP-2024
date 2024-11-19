public class Rook extends Piece {
    Rook(Position position, String side) {
        super(position, side);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            return false;
        }
        else{
            if( ((a.getX() - b.getX()) != 0 && (a.getY()-b.getY()) == 0) || ((a.getY() - b.getY()) != 0 && (a.getX()-b.getX()) == 0)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

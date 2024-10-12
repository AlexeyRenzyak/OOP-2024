public class Bishop extends Piece {
    Bishop(Position position, String side) {
        super (position, side);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            return false;
        }
        else{
            if( ((Math.abs(a.getY() - b.getY()) == Math.abs(a.getX() - b.getX())))){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

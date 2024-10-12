public class King extends Piece {
    King(Position position, String side) {
        super (position, side);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            return false;
        }
        else{
            if( (Math.abs(a.getX() - b.getX()) <= 1 && Math.abs(a.getY() - b.getY()) <= 1)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

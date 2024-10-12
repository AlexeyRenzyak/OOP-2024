public class Knight extends Piece {
    Knight(Position position, String side) {
        super (position, side);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            return false;
        }
        else{
            if(( (Math.abs(a.getX()- b.getX())) == 2 && ((Math.abs(a.getY()- b.getY())) == 1)) || ((Math.abs(a.getX()- b.getX())) == 1 && (Math.abs(a.getY()- b.getY())) == 2) ){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

public class Pawn extends Piece {
    Pawn(Position position, String side) {
        super(position, side);
    }

    @Override
    public boolean isLegalMove(Position b) {
        //Would require taking mechanics' implementation for the actual game as well
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            return false;
        }
        else{
            if(side.equals("White")){
                if (a.getY() == 1){
                    if ( (a.getX()-b.getX()) == 0 && ( (b.getY()-a.getY()) == 1) || (b.getY()-a.getY()) == 2){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if ( (a.getX()-b.getX()) == 0 && ( (b.getY()-a.getY()) == 1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                if (a.getY() == 6){
                    if ( (a.getX()-b.getX()) == 0 && ( (b.getY()-a.getY()) == -1) || (b.getY()-a.getY()) == -2){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if ( (a.getX()-b.getX()) == 0 && ( (b.getY()-a.getY()) == -1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
    }
}

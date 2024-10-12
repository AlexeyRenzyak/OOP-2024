public class Test2 {
    public static void main(String[] args) {
        /*
        Rook p1 = new Rook(new Position(1,1), "White");
        System.out.println(p1.isLegalMove(new Position(1, 2)));
        System.out.println(p1.isLegalMove(new Position(2, 2)));
        System.out.println(p1.isLegalMove(new Position(6, 1)));
        */

        /*
        King p2 = new King(new Position(1,2), "Black");
        System.out.println(p2.isLegalMove(new Position(2, 2)));
        System.out.println(p2.isLegalMove(new Position(2, 3)));
        System.out.println(p2.isLegalMove(new Position(3, 3)));
        */
        /*
        Queen p3 = new Queen(new Position(1,2), "White");
        System.out.println(p3.isLegalMove(new Position(6,2)));
        System.out.println(p3.isLegalMove(new Position(1,4)));
        System.out.println(p3.isLegalMove(new Position(0,1)));
        System.out.println(p3.isLegalMove(new Position(7,5)));
         */

        /*
        Bishop p4 = new Bishop(new Position(2, 2), "White");
        System.out.println(p4.isLegalMove(new Position(2, 3)));
        System.out.println(p4.isLegalMove(new Position(1, 1)));
        System.out.println(p4.isLegalMove(new Position(3, 1)));
        System.out.println(p4.isLegalMove(new Position(3, 3)));
         */

        /*
        Knight p5 = new Knight(new Position(3,3), "White");
        System.out.println(p5.isLegalMove(new Position(1,3)));
        System.out.println(p5.isLegalMove(new Position(1,2)));
        System.out.println(p5.isLegalMove(new Position(1,4)));
        System.out.println(p5.isLegalMove(new Position(2,5)));
         */

        Pawn p6 = new Pawn(new Position(1,1), "White");
        System.out.println(p6.isLegalMove(new Position(2,1)));
        System.out.println(p6.isLegalMove(new Position(1,2)));
        System.out.println(p6.isLegalMove(new Position(1,3)));
        Pawn p7 = new Pawn(new Position(1,2), "White");
        System.out.println(p7.isLegalMove(new Position(1,3)));
        System.out.println(p7.isLegalMove(new Position(1,4)));
        Pawn p8 = new Pawn(new Position(1,6), "Black");
        System.out.println(p8.isLegalMove(new Position(1,5)));
        System.out.println(p8.isLegalMove(new Position(1,4)));
        System.out.println(p8.isLegalMove(new Position(1,3)));
        System.out.println(p8.isLegalMove(new Position(1,7)));


    }
}


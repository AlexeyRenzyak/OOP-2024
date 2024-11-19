public class Test2 {
    public static void main(String[] args) {

        Knight k = new Knight(new Position(1, 0), "White");
        System.out.println(k.isLegalMove(new Position(0, 2)));
        System.out.println(k.isLegalMove(new Position(1, 2)));



    }
}


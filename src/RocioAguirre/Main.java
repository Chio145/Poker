package RocioAguirre;

    public class Main {

        public static void main(String[] args) {
            Deck o1 = new Deck();
            o1.pok();
            o1.shuffle();
            System.out.println("\n ---------------------------- \n");
            o1.head();
            System.out.println("\n ---------------------------- \n");
            o1.pick();
            System.out.println("\n ---------------------------- \n");
            o1.hand();

        }
    }
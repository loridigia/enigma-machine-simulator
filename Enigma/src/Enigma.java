public class Enigma {
    public static void main(String[] args){
        String[] ParteDx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
        Rotore1 primo = new Rotore1(4);
        Rotore1 secondo = new Rotore1(5);
        Rotore1 terzo = new Rotore1(0);

        System.out.println(primo.getLatoDx() + "\n" + primo.getLatoSx());
    }
}

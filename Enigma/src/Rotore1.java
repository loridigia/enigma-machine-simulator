public class Rotore1 extends Rotore {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "a", "v", "o", "e", "y", "f", "w", "l", "d", "q", "c", "b", "s", "p", "t", "k", "r", "g", "i", "j", "u", "h", "x", "z", "m", "n"};

    public Rotore1(Integer indice) //lettera iniziale scelta al posizionamento del rotor
    {
        StartIndice = indice;

        while(LatoDx.size() != Dx.length) {
            try {
                LatoDx.add(Dx[indice]);
                LatoSx.add(Sx[indice]);
                indice++;
            } catch (Exception e){
                indice = 0;
                System.out.println(e);
            }
        }
    }
}

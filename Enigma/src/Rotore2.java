public class Rotore2 extends Rotore {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "y", "u", "f", "h", "x", "z", "m", "n", "j", "g", "o", "p", "a", "q", "i", "r", "l", "d", "t", "w", "v", "k", "s", "b", "c", "e"};

    public Rotore2(Integer indice) //lettera iniziale scelta al posizionamento del rotore
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

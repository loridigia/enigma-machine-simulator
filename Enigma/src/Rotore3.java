public class Rotore3 extends Rotore {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "s", "t", "i", "o", "f", "m", "y", "z", "e", "q", "d", "l", "b", "c", "k", "j", "g", "v", "p", "u", "r", "w", "n", "x", "a", "h"};

    public Rotore3(Integer indice) //lettera iniziale scelta al posizionamento del rotore
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

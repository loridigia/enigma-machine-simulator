import java.util.ArrayList;

public class Riflettore {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "k", "m", "i", "h", "u", "g", "t", "e", "v", "j", "c", "l", "x", "z", "r", "a", "q", "n", "b", "f", "s", "o", "y", "p", "w", "d" };
    protected ArrayList<String> LatoDx = new ArrayList<>();
    protected ArrayList<String> LatoSx = new ArrayList<>();
    protected Integer StartIndice;

    public Riflettore(Integer indice) //lettera iniziale scelta al posizionamento del rotore
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

    public Integer rifletti(Integer i){
        String lettera = LatoSx.get(i);
        return LatoDx.indexOf(lettera);
    }

}

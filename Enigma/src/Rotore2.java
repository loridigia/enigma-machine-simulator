import java.util.ArrayList;

public class Rotore2 {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "y", "u", "f", "h", "x", "z", "m", "n", "j", "g", "o", "p", "a", "q", "i", "r", "l", "d", "t", "w", "v", "k", "s", "b", "c", "e"};
    private ArrayList<String> LatoDx = new ArrayList<>();
    private ArrayList<String> LatoSx = new ArrayList<>();
    private Integer StartIndice;

    public Rotore2(Integer indice) //lettera iniziale scelta al posizionamento del rotor
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

    public void rotazione(){
        if( StartIndice == 26 ) StartIndice = 0;
        else StartIndice++;
    }

    public ArrayList<String> getLatoDx() {
        return LatoDx;
    }

    public ArrayList<String> getLatoSx() {
        return LatoSx;
    }

}

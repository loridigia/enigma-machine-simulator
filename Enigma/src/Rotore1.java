import java.util.ArrayList;
import java.util.Arrays;

public class Rotore1 {
    private String[] Dx = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private String[] Sx = new String[] { "a", "v", "o", "e", "y", "f", "w", "l", "d", "q", "c", "b", "s", "p", "t", "k", "r", "g", "i", "j", "u", "h", "x", "z", "m", "n"};
    private ArrayList<String> LatoDx = new ArrayList<>();
    private ArrayList<String> LatoSx = new ArrayList<>();

    public Rotore1(Integer indice) //lettera iniziale scelta al posizionamento del rotore
    {
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

    public ArrayList<String> getLatoDx() {
        return LatoDx;
    }

    public ArrayList<String> getLatoSx() {
        return LatoSx;
    }
}

import java.util.ArrayList;

public abstract class Rotore {
    protected ArrayList<String> LatoDx = new ArrayList<>();
    protected ArrayList<String> LatoSx = new ArrayList<>();
    protected Integer StartIndice;


    public Integer inputAndata(Integer i){
        String lettera = LatoDx.get(i);
        return LatoSx.indexOf(lettera);
    }

    public Integer inputRitorno(Integer i){
        String lettera = LatoSx.get(i);
        return LatoDx.indexOf(lettera);
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

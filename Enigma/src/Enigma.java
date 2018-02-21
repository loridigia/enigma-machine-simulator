import java.util.Arrays;

public class Enigma {
    private String[] inizio = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };
    private Rotore RotoreSx;
    private Rotore RotoreCe;
    private Rotore RotoreDx;
    private Riflettore riflettore;

    public Enigma(Rotore sx, Rotore ce, Rotore dx, Riflettore rif){
        RotoreSx = sx;
        RotoreCe = ce;
        RotoreDx = dx;
        riflettore = rif;
    }

    public String codifica(String letteraInizio ){
        int indiceInizio = Arrays.asList(inizio).indexOf(letteraInizio);
        int DxAndata = RotoreDx.inputAndata(indiceInizio);
        int CeAndata = RotoreCe.inputAndata(DxAndata);
        int SxAndata = RotoreSx.inputAndata(CeAndata);
        int indiceRiflesso = riflettore.rifletti(SxAndata);
        int SxRitorno = RotoreSx.inputRitorno(indiceRiflesso);
        int CeRitorno = RotoreCe.inputRitorno(SxRitorno);
        int DxRitorno = RotoreDx.inputRitorno(CeRitorno);
        return inizio[DxRitorno];

    }
    public static void main(String[] args){
    }
}

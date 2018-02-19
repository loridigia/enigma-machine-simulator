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
        Rotore primo = new Rotore3(0);
        Rotore secondo = new Rotore2(0);
        Rotore terzo = new Rotore1(0);
        Riflettore rif = new Riflettore(0);
        Enigma macchina = new Enigma(primo, secondo, terzo, rif);

        System.out.println("INPUT LETTERA d");
        System.out.println("OUTPUT LETTERA "+ macchina.codifica("d"));
    }
}

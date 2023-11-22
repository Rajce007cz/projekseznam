import java.util.ArrayList;
import java.util.List;

public class SeznamNabytku {
    private List<Nabytek> nabytekSeznam = new ArrayList<>();
    public void pridatNabytek(Nabytek nabytek){
        nabytekSeznam.add(nabytek);
    }
    public void minusNabytek(Nabytek nabytek){
        nabytekSeznam.remove(nabytek);
    }
    public Double zjistiHmotnost() {
        Double celkovaHmotnost = Double.valueOf(0);
        for (Nabytek nabytek : nabytekSeznam) {
            celkovaHmotnost += nabytek.getHmotnost();
        }
        return celkovaHmotnost;
    }
}
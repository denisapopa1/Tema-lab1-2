import java.util.ArrayList;
import java.util.List;

public class Clasa {
    int capacitate;
    NumarClasa numar;
    char litera;
    List<Elev> elevi;
    public Clasa(int capacitate, NumarClasa numar, char litera) {
        this.capacitate = capacitate;
        this.numar = numar;
        this.litera = litera;
        this.elevi = new ArrayList<>();
    }
    public void adaugaElev(Elev elev){
        elevi.add(elev);
    }
    public void eliminaElev(Elev elev){
        elevi.remove(elev);
    }
    public int getTotalElevi(){
        return elevi.size();
    }
    public List<Elev> getElevi() {
        return elevi;
    }
}

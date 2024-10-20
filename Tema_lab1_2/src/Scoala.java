import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scoala {
  Map<String, Clasa>clase;
    public Scoala() {

        clase = new HashMap<>();
    }

    public void adaugaClasa(String s,Clasa clasa){
      clase.put(s,clasa);
  }
  public  void eliminaClasa(String s){
      clase.remove(s);
  }
  public void adaugaElevInClasa(String s, Elev elev){
    Clasa clasa=clase.get(s);
      if (clasa != null) {
          clasa.adaugaElev(elev);
      } else {
          System.out.println("Clasa nu a fost gasita.");
      }

  }
  public void eliminaElevDupaNume(String s){
      for (Clasa clasa : clase.values()) {
          List<Elev> elevi = clasa.getElevi();
          for (Elev elev : elevi) {
              if (elev.getElev().equals(s)) {
                  clasa.eliminaElev(elev);
                  return;
              }
          }
      }
  }
  public int getNumarClase(){
      return clase.size();
  }
  public int getTotalElevi(){
      int total = 0;
      for (Clasa clasa : clase.values()) {
          total += clasa.getTotalElevi();
      }
      return total;
  }
    public void afisareInformatiiScoala() {
        System.out.println("Numar clase: " + getNumarClase());
        System.out.println("Numar total elevi: " + getTotalElevi());
    }
}

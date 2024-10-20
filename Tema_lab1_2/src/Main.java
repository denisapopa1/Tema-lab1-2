//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(30, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);

        Elev elev1 = new Elev("Andrei", Gen.Masculin);
        Elev elev2 = new Elev("Maria", Gen.Feminin);
        Elev elev3 = new Elev("Alex", Gen.Nespecificat);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("2B", elev2);
        scoala.adaugaElevInClasa("2B", elev3);
        scoala.afisareInformatiiScoala();
        scoala.eliminaElevDupaNume("Maria");
        scoala.afisareInformatiiScoala();
        scoala.eliminaClasa("1A");
        scoala.afisareInformatiiScoala();
    }
}
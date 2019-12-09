public class Militaerresepter extends HvitResept {
  public Militaerresepter(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId, int reit) {
    super(legemiddel, utskrivendeLege, pasientId, reit);
    settMilitaerPris();
  }

  public void settMilitaerPris() {
    hentLegemiddel().settNyPris(0);
  }
}

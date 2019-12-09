public class Presepter extends HvitResept {
  public Presepter(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId) {
    super(legemiddel, utskrivendeLege, pasientId, 3);
    settPpris();
  }

  public void settPpris() {
    if (prisAaBetale() <= 116) {
      hentLegemiddel().settNyPris(0);
    } else {
      hentLegemiddel().settNyPris(prisAaBetale() - 116);
    }
  }
}

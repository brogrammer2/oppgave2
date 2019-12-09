public class BlaaResept extends Resept {
  public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId, int reit) {
    super(legemiddel, utskrivendeLege, pasientId, reit);
    settBlaaPris();
  }

  public double prisAaBetale() {
    return hentLegemiddel().hentPris();
  }

  public String farge() {
    return "blaa";
  }

  public void settBlaaPris() {
    hentLegemiddel().settNyPris(prisAaBetale() * 0.25);
  }
}

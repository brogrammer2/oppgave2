public class LegemiddelA extends Legemiddel {
  private int nStyrke;

  public LegemiddelA(String navn, double pris, double mg,
  int nStyrke) {
    super(navn, pris, mg);
    this.nStyrke = nStyrke;
  }

  public int hentNStyrke() {
    return nStyrke;
  }

}

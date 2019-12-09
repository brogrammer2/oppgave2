public class LegemiddelB extends Legemiddel {
  private int vaneStyrke;

  public LegemiddelB(String navn, double pris, double mg,
  int vaneStyrke) {
    super(navn, pris, mg);
    this.vaneStyrke = vaneStyrke;
  }

  public int hentVaneStyrke() {
    return vaneStyrke;
  }
}

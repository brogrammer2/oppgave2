abstract class Resept {
  private int id;
  private static int teller;
  private Legemiddel legemiddel;
  private Lege utskrivendeLege;
  private int pasientId;
  private int reit;

  public Resept(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId, int reit) {
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientId = pasientId;
    this.reit = reit;
    id = teller;
    teller++;
  }

  public int hentId() {
    return id;
  }

  public Legemiddel hentLegemiddel() {
    return legemiddel;
  }

  public Lege hentLege() {
    return utskrivendeLege;
  }

  public int hentPasientId() {
    return pasientId;
  }

  public int hentReit() {
    return reit;
  }

  public boolean bruk() {
    if (reit > 0) {
      reit--;
      return true;
    } else {
      return false;
    }
    //return reit != 0;
  }

  abstract public String farge();

  abstract public double prisAaBetale();
}

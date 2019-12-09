abstract class Legemiddel {
  private String navn;
  private double pris;
  private int id;
  private static int teller;
  private double mg;

   public Legemiddel(String navn, double pris, double mg) {
    this.navn = navn;
    this.pris = pris;
    this.mg = mg;
    id = teller;
    teller++;
  }

  public int hentId() {
    return id;
  }

  public String hentNavn() {
    return navn;
  }

  public double hentPris() {
    return pris;
  }

  public double hentMg() {
    return mg;
  }

  public void settNyPris(double nyPris) {
    pris = nyPris;
  }


}

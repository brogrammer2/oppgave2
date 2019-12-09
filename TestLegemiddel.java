public class TestLegemiddel {
  public static void main(String[] args) {

    /*
    Legemiddel l = new Legemiddel("Medisin", 99.90, 100);
    Ikke lov ettersom at klassen er abstrakt.
    */

    LegemiddelA a = new LegemiddelA("NarkoMed", 149.90, 200, 5);
    LegemiddelB b = new LegemiddelB("VaneMed", 119.90, 140, 3);
    LegemiddelC c = new LegemiddelC("NormalMed", 79.90, 100);

    System.out.println("Med.Navn:");
    System.out.println(a.hentNavn());
    System.out.println(b.hentNavn());
    System.out.println(c.hentNavn());

    System.out.println("\nID:");
    System.out.println(a.hentId());
    System.out.println(b.hentId());
    System.out.println(c.hentId());

    System.out.println("\nPris:");
    System.out.println(a.hentPris());
    System.out.println(b.hentPris());
    System.out.println(c.hentPris());

    System.out.println("\nmg:");
    System.out.println(a.hentMg());
    System.out.println(b.hentMg());
    System.out.println(c.hentMg());

    System.out.println("\nNarkotisk styrke:");
    System.out.println(a.hentNStyrke());

    System.out.println("\nVanedannende styrke:");
    System.out.println(b.hentVaneStyrke());
  }
}

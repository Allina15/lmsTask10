public class Main {
    public static void main(String[] args) {
      Programmer programmer = new Programmer("Alina","programmer","Google");
        System.out.println(programmer+"\n"+programmer.eat()+"\n"+programmer.walk()+"\n"+programmer.coding());

      Dancer dancer = new Dancer("Akylai","dancer","Bereke");
        System.out.println(dancer+"\n"+dancer.eat()+"\n"+dancer.walk()+"\n"+dancer.dancing());

      Singer singer = new Singer("Timati","singer","BlackStar");
        System.out.println(singer+"\n"+singer.eat()+"\n"+singer.walk()+"\n"+singer.singing()+"\n"+singer.playGuitar());
    }
}
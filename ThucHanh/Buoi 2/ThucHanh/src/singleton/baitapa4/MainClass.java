package singleton.baitapa4;

public class MainClass {
  public static void main(String[] args) {
    User u1 = new User();
    User u2 = new User();
    User u3 = new User();

    u1.vote("Trump");
    u2.vote("Trump");
    u2.vote("Biden");
    u3.vote("Biden");

    Election election = Election.getInstance();
    System.out.println("Total Trump votes: " + election.getTrumpVotes());
    System.out.println("Total Biden votes: " + election.getBidenVotes());
  }
}

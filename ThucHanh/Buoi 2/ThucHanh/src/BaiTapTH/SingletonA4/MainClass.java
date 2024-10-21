package BaiTapTH.SingletonA4;

public class MainClass {
  public static void main(String[] args) {
    User userName = new User("An");
    User userName1 = new User("Vi");
    User userName2 = new User("Hong");
    User userName3 = new User("K");

    userName.vote(Candidate.Biden);
    userName1.vote(Candidate.Biden);
    userName2.vote(Candidate.Trump);
    userName3.vote(Candidate.Trump);

    Election.getInstance().result();
  }
}

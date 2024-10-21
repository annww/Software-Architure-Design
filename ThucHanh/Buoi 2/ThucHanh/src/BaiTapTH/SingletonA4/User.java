package BaiTapTH.SingletonA4;

public class User {
  String name;

  public User(String name) {
    this.name = name;
  }

  public void vote(Candidate candidates) {
    Election election = Election.getInstance();
    election.vote(candidates, name);
  }
}
package singleton.baitapa4;

public class User {
  private boolean hasVoted = false;

  public void vote(String candidate){
    if(!hasVoted){
      Election election = Election.getInstance();
      election.vote(candidate);
      hasVoted = true;
    }
    else{
      System.out.println("You have already voted!");
    }
  }
}

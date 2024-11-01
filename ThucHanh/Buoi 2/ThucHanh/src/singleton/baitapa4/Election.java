package singleton.baitapa4;

public class Election {
  private static Election instance;
  private int trumpVotes;
  private int bidenVotes;

  private Election(){
    trumpVotes = 0;
    bidenVotes = 0;
  }

  public static Election getInstance(){
    if(instance == null){
      instance = new Election();
    }
    return instance;
  }

  public void vote(String candidate){
    if(candidate.equalsIgnoreCase("Trump")){
      trumpVotes++;
    }
    else if(candidate.equalsIgnoreCase("Biden")){
      bidenVotes++;
    }
    else{
      System.out.println("invailid candidate");
    }
  }

  public int getTrumpVotes() {
    return trumpVotes;
  }

  public int getBidenVotes() {
    return bidenVotes;
  }
}


package BaiTapTH.SingletonA4;

import java.util.ArrayList;
import java.util.List;

public class Election{
  private static Election instance;
  private int trump, biden;
  private List<String> users;
  private Election(){
    this.trump = 0;
    this.biden = 0;
    this.users = new ArrayList<>();
  }
  public static Election getInstance(){
    if(instance == null){
      instance = new Election();
    }
    return instance;
  }
  public void vote(Candidate candidate, String userName) {
    if(!users.contains(userName)){
      users.add(userName);
      if(candidate == Candidate.Trump){
        trump++;
      } else if(candidate == Candidate.Biden){
        biden++;
      }
    }
  }
  public void result(){
    System.out.println("Vote của Trump: " + trump);
    System.out.println("Vote của Biden: " + biden);
    if(trump < biden){
      System.out.println("Người chiến thắng là Biden");
    } else {
      System.out.println("Người chiến thắng là Trump");
    }
  }
}

import java.util.*;
public class Node{

  private Node next;
  private int curr;

  public Node(int value){
    curr = value;
    next = null;
  }
  public Node(){

  }

  public void setNext (Node node){
    next = node;
  }

  public Node getNext (){
    try{
      return next;
    }
    catch(NullPointerException e){
      return (Node) null;
    }
  }

  public void setValue(int newCurr){
    curr = newCurr;
  }

  public int getValue(){
    try{
      return curr;
    }
    catch(NullPointerException e){
      return (Integer) null;
    }
  }
}

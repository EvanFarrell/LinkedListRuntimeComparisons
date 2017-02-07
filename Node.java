public class Node{

  private Node next;
  private int curr;

  public Node(int value){
    curr = value;
    next = null;
  }

  public void setNext (Node node){
    next = node;
  }

  public Node getNext (){
    return next;
  }

  public void setValue(int newCurr){
    curr = newCurr;
  }

  public int getValue(){
    return curr; 
  }
}

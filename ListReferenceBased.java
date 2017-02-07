public class ListReferenceBased{

  int numNodes;
  Node head;

  public ListReferenceBased(){
    head = null;
    numNodes = 0;
  }

  public void addEnd(Node n){
    Node currentNode;

    if (head == null)
      head.setNext(n);

    else{
      currentNode = head;
      for (int i =0; i<numNodes + 1; i++)
        currentNode = currentNode.getNext();
      currentNode.setNext(n);
    }
    numNodes++;
  }

  public boolean isEmpty(){
    if (numNodes==0)
      return true;
    else
      return false;
  }
  public int size(){
    return numNodes;
  }

  public void printList(){
    System.out.print(numNodes + " Items in the list: ");
    Node currentNode = head;
    for (int i = 0; i < numNodes; i++){
      currentNode = currentNode.getNext();
      System.out.print(" "+ currentNode.getValue());
    }
  }

  public static void main(String[] args){
    System.out.println("Hello world");
    ListReferenceBased list = new ListReferenceBased();

    Node node1 = new Node(1);
    list.addEnd(node1);

    Node node2 = new Node(2);
    list.addEnd(node2);

    Node node3 = new Node(3);
    list.addEnd(node3);
}

}

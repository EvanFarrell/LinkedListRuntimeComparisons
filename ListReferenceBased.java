public class ListReferenceBased{

  int numNodes;
  Node head;

  public ListReferenceBased(){
    head = new Node();
    numNodes = 0;
  }

  public void addEnd(Node n){
    Node currentNode;

    if (head == null)
      head.setNext(n);

    else{
      currentNode = head;
      for (int i =0; i<numNodes; i++)
        currentNode = currentNode.getNext();
      currentNode.setNext(n);
    }
    numNodes++;
  }

  public void add(Node newNode, int index){ //TODO check for NULL, head, tail
    Node currentNode = head;

    if (currentNode.getNext()==null){
      currentNode.setNext(newNode);
    }

    currentNode = currentNode.getNext();

    for (int i = 0; i < index; i++){
      if (i == index-1){
        System.out.println("current val:" + currentNode.getValue() + " next val: " + currentNode.getNext().getValue());
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
      }
      currentNode = currentNode.getNext();
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
    System.out.print(numNodes + " Item(s) in the list: ");
    Node currentNode = head;
    for (int i = 0; i < numNodes; i++){
      currentNode = currentNode.getNext();
      System.out.print(" "+ currentNode.getValue());
    }
    System.out.println("\n");
  }
  public int get (int index){
    Node currentNode = head;
    for (int i = 0; i < index+1; i++){
      currentNode = currentNode.getNext();
    }
    return currentNode.getValue();
  }
  public void remove(int index){
    Node currentNode = head;

    for (int i = 0; i < index; i++){
      currentNode = currentNode.getNext();
    }
    Node desiredNextNode = (currentNode.getNext().getNext());
    currentNode.getNext().setNext(null);
    currentNode.setNext(desiredNextNode);
    numNodes--;
  }
  public void removeAll(){
    head.setNext(null);
    numNodes = 0; 
  }

  public static void main(String[] args){
    ListReferenceBased list = new ListReferenceBased();

    Node node1 = new Node(1);
    list.addEnd(node1);

    Node node2 = new Node(2);
    list.addEnd(node2);

    Node node3 = new Node(4);
    list.addEnd(node3);

    Node node4 = new Node(3);
    list.add(node4, 2);

    list.remove(1);
    list.removeAll();
    list.printList();
}

}

package linkedDS;

public class Node<T> {

   private Node<T> prev;
   private T key;
   private Node<T> next;
   
   public Node(T x) {
      prev = null;
      key = x;
      next = null;
   }
   
   public T getKey() {
      return key;
   }
   
   public void setKey(T key) {
      this.key = key;
   }
   
   public Node<T> getNext() {
      return next;
   }
   
   public Node<T> getPrev() {
      return prev;
   }
   
   public void setNext(Node<T> next) {
      this.next = next;
   }
   
   public void setPrev(Node<T> prev) {
      this.prev = prev;
   }
   
}
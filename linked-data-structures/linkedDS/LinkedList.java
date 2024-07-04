package linkedDS;

public class LinkedList<T> {

   private Node<T> sentinel;

   public LinkedList() {
      sentinel = new Node<T>(null);
      sentinel.setPrev(sentinel);
      sentinel.setNext(sentinel);
   }

   public boolean isEmpty() {
      return (sentinel.getNext() == sentinel);
   }

   private void insert(Node<T> x, Node<T> y) {
      x.setNext(y.getNext());
      x.setPrev(y);
      y.getNext().setPrev(x);
      y.setNext(x);
   }

   public void insertBack(T k) {
      Node<T> tail = sentinel.getPrev();
      Node<T> newNode = new Node<T>(k);
      insert(newNode, tail);
   }

   public void insertFront(T k) {
      Node<T> newNode = new Node<T>(k);
      insert(newNode, sentinel);
   }
   
   public Node<T> search(T k) {
      Node<T> x;
      sentinel.setKey(k);
      x = sentinel.getNext();
      
      while (!x.getKey().equals(k)) {
         x = x.getNext();
      }
      
      if (x == sentinel) {
         x = null;
      }
      sentinel.setKey(null);
      
      return x;
   }
   
   private void delete(Node<T> x) {
      x.getPrev().setNext(x.getNext());
      x.getNext().setPrev(x.getPrev());
   }
   
   public T delete(T k) {
      T x;
      
      Node<T> node = search(k);
      if (node != null) {
         delete(node);
         x = k;
      } else {
         x = null;
      }
      
      return x;
   }

}
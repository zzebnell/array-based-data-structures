package ArrayDS;

public class ArrayQueue<T> {

   private int head;
   private int tail;
   private int size;
   private T queue[];
   
   public ArrayQueue(int n) {
      queue = (T[]) new Object[n + 1];
      head = 0;
      tail = 0;
      size = n + 1;
   }
   
   public boolean isEmpty() {
      return head == tail;
   }
   
   public boolean isFull() {
      boolean full;
      
      full = (head == (tail + 1)) || ((head == 0) && (tail == size - 1));
      
      return full;
   }
   
   public void enqueue(T x) {
      if (!isFull()) {
         queue[tail] = x;
         if (tail == size - 1) {
            tail = 0;
         } else {
            tail = tail + 1;
         }
      }
   }
   
   public T dequeue() {
      T x;
      
      if (isEmpty()) {
         x = null;
      } else {
         x = queue[head];
         if (head == size - 1) {
            head = 0;
         } else {
            head = head + 1;
         }
      }
      
      return x;
   }
   
}
package ArrayDS;

public class ArrayStack<T> {
   
   private T stack[];
   private int top;
   private int size;
   
   public ArrayStack(int n) {
      stack = (T[]) new Object[n];
      top = -1;
      size = n;
   }
   
   public boolean isEmpty() {
      return top == -1;
   }
   
   public void push(T x) {
      if (top < size - 1) {
         top = top + 1;
         stack[top] = x;
      }
   }
   
   public T pop() {
      T x;
      if (isEmpty()) {
         x = null;
      } else {
         top = top - 1;
         x = stack[top + 1];
      }
      return x;
   }
   
}
package generics;

public class GenricStackDemo {

//    public static void main(String[] args) {
//        GenericStack<String> stack = new GenericStack<>();
//        
//        //Add elements to the stack
//        stack.push("Element 1");
//        stack.push("Element 2");
//        stack.push("Element 3");
//        stack.push("Element 4");
//        stack.push("Element 5");
//        
//        System.out.println("Stack size : "+stack.getSize());
//        
//        
//    }

}

class GenericStack<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    //return stack size
    public int getSize() {
        return list.size();
    }

    //Return top element of the stack
    public E peek() {
        return list.get(getSize() - 1);
    }

    //Remove top element
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(o);
        return o;
    }

    //Push items to the satck
    public void push(E o) {
        list.add(o);
    }

    //Check stack empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

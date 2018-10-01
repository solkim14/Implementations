import java.util.ArrayList;

/**
* generic Stack implementation using Arraylist
*
*
* @author
* @version
* @date
*/

public class Stack { //use arraylist
	ArrayList<Object> stack; //arraylist of elements

	/** CONSTRUCTOR */
	public Stack() {
		stack = new ArrayList<Object>();
	}
	
	/** METHODS */
	public void push(Object item) { //pushes given element onto stack
	    stack.add(item);
		return;
	}
	
	public Object pop() { //removes and returns top element
	    if(stack.size() == 0) {
	        System.out.println("Stack is empty! Nothing to pop!");
	        return null;
	    } else {
    	    Object removeElement = stack.remove(stack.size()-1);
    		return removeElement;
	    }
	}
	public Object peek() { //returns element on top
        if(stack.size() == 0) {
	        System.out.println("Stack is empty! Nothing to peek here!");
	        return null;
	    } else {
            return stack.get(stack.size()-1);
        }
	}
	
	public boolean isEmpty() { //returns boolean based on size of element
	    if(stack.size() == 0) {
	        return true;
	    }
	    return false; //else return false
	}
	
	public void printStack() {
	    for(Object element : stack) {
	        System.out.println(element);
	    }
	    System.out.println();
	}
	
	
	/** MAIN */
	public static void main(String[] args) {
		System.out.println("ayy lmao");
		
		Stack stack = new Stack();
		
		//push test
		stack.push(1);
		stack.printStack();
		stack.push(3);
		stack.printStack();
		stack.push(5);
		stack.printStack();
		
		//pop test
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		
		//peek test
		System.out.println(stack.peek());
		
		//isEmpty test
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.isEmpty());

        //empty stack test
		stack.peek();
		stack.pop();
	}
}
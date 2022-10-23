public class Stack {
    int stack[], top;
    
    public Stack () { // constructor
        stack= new int[5];
        top=-1;
    }
    public void push(int val) {
		if(top > stack.length) {	    
		    System.out.println("Stack is full!");
		} else {		    
		    top++;		    
		    stack[top] = val;
		}
    }
    public int pop() {
        int val=-1;
        
		if(top <= 0) {
		    System.out.println("Stack is empty!");
		} else {
		    //System.out.println("Stack pop(): " + stack[top]);  
		    val = stack[top];
		    stack[top] = 0; top--;
		    return val;
		}
		return val;
    }
    public void printStack(String title) { // method
		System.out.print(title + " ");
		for (int i=0; i < stack.length; i++) {
		    System.out.print(stack[i] + " ");    
		}	
		System.out.println();    
    }
	public static void main(String[] args) {
	    Stack s = new Stack ();    
	    s.push(5); s.printStack("push");
	    s.push(3); s.printStack("push");
	    s.push(4); s.printStack("push");
	    s.push(7); s.printStack("push");
	    System.out.print( "pop()" + s.pop() );  s.printStack("pop");
	    System.out.print( "pop()" + s.pop() );  s.printStack("pop");
	}
}



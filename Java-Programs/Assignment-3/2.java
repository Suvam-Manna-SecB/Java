// Write a Java program to implement stack using array.

public class StackArray {
	private int[] stack;
	private int top;
	StackArray() {
		stack = new int[100];
		top = -1;
	}
	public void push(int val) {
		if(top == 100) {
			System.out.println("Stack Overflow");
		} else {
			top++;
			stack[top] = val;
		}
	}
	public int pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int val = stack[top];
			top--;
			return val;
		}
	}
	public int peek() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			return stack[top];
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			for(int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println("Top Element: " + s.peek());
		System.out.println("Deleted Element: " + s.pop());
		System.out.println("Top Element: " + s.peek());
	}
}

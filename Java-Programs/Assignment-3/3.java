// Write a Java program to implement Queue using array.

public class QueueArray {
	private int[] queue;
	private int rear;
	private int front;
	QueueArray() {
		queue = new int[100];
		rear = -1;
		front = -1;
	}
	public void enqueue(int val) {
		if(rear == 100) {
			System.out.println("Queue Overflow");
		} else if(front == -1){
			front = 0;
			rear = 0;
			queue[rear] = val;
		} else {
			rear++;
			queue[rear] = val;
		}
	}
	public int dequeue() {
		if(front == -1) {
			System.out.println("Queue Underflow");
			return -1;
		} else {
			int val = queue[front];
			front++;
			return val;
		}
	}
	public int peek() {
		if(front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		} else {
			return queue[front];
		}
	}
	public void display() {
		if(front == -1) {
			System.out.println("Queue is Empty");
		} else {
			for(int i = front; i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println("\nFront Element: " + q.peek());
		System.out.println("Deleted Element: " + q.dequeue());
		System.out.println("Front Element: " + q.peek());
	}
}

package queues;

// A fixed-size queue class for characters.
public class FixedQueue implements ICharQ {
	private char q[]; // this array holds the queue
	private int putLoc, getLoc; // the put and get indices

// Construct an empty queue given its size.
	public FixedQueue(int size) {
		q = new char[size]; // allocate memory for queue
		putLoc = getLoc = 0;
	}

	// Put a character into the queue
	@Override
	public void put(char ch) {
		if (putLoc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putLoc++] = ch;
	}

	// Get a character from the queue.
	@Override
	public char get() {
		if (getLoc == putLoc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getLoc++];
	}
}

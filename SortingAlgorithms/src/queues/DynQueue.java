package queues;

// A dynamic queue.
public class DynQueue implements ICharQ {
	private char q[]; // this array holds the queue.
	private int putLoc, getLoc; // the put and get indices

	// Default Constructor
	public DynQueue(int size) {
		q = new char[size]; // allocate memory for the queue
		putLoc = getLoc = 0;
	}
	
	// Put a character into the queue
	@Override
	public void put(char ch) throws QueueFullException {
		if (putLoc == q.length) {
			// increase queue size
			char t[] = new char[q.length * 2];

			// copy elements into new queue
			for (int i = 0; i < q.length; i++)
				t[i] = q[i];
			q = t;
		}
		q[putLoc++] = ch;
	}
	
	// Get a character from the queue
	@Override
	public char get() throws QueueEmptyException {
		if (getLoc == putLoc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getLoc++];
	}
}

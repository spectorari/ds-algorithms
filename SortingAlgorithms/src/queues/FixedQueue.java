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
	public void put(char ch) throws QueueFullException {

		if (putLoc == q.length)
			throw new QueueFullException(q.length);
		q[putLoc++] = ch;
	}

	// Get a character from the queue.
	@Override
	public char get() throws QueueEmptyException {

		if (getLoc == putLoc)
			throw new QueueEmptyException();

		return q[getLoc++];
	}
}

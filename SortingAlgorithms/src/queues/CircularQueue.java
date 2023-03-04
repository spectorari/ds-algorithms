package queues;

// A circular queue.
public class CircularQueue implements ICharQ {
	private char q[]; // this array holds the queue.
	private int putLoc, getLoc; // the put and get indices

	// Construct an empty queue given its size.
	public CircularQueue(int size) {
		q = new char[size + 1]; // allocate memory for queue
		putLoc = getLoc = 0;
	}

	@Override
	public void put(char ch) throws QueueFullException {
		/*
		 * Queue is full if either putLoc is one less than getLoc, or it putLoc is at
		 * the end of the array and getLoc is at the beginning
		 */
		if (putLoc + 1 == getLoc | ((putLoc == q.length - 1) & (getLoc == 0))) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putLoc++] = ch;
		if (putLoc == q.length)
			putLoc = 0; // loop back
	}

	@Override
	public char get() throws QueueEmptyException {
		if (getLoc == putLoc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}

		char ch = q[getLoc++];
		if (getLoc == q.length)
			getLoc = 0;
		return ch;
	}

}

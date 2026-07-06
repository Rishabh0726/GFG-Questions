class myQueue {
    int[]arr;
    int cap;
    int size;
    int front;
    int rear;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        cap=n;
        arr=new int[cap];
        size=0;
        rear=-1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==cap;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull())
        return;
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
        
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty())
        return;
        front=(front+1)%cap;
        size--;
    }

    public int getFront() {
        // Get front element
        if(size==0)
        return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(size==0)
        return -1;
        return arr[rear];
    }
}

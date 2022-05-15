class MyQueue {
    Stack<Integer> pusher = new Stack<>();
    Stack<Integer> popper = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        pusher.push(x);
    }
    
    private void converter(){
        int size = pusher.size();
        if (popper.isEmpty()){
            for (int i=0; i<size; i++){
                popper.push(pusher.pop());
            }
        }
    }
    
    public int pop() {
        if (popper.isEmpty()){
            converter();
        }
        return popper.pop();
    }
    
    public int peek() {
        if (popper.isEmpty()){
            converter();
        }
        return popper.peek();
    }
    
    public boolean empty() {
        if (popper.isEmpty()) return pusher.isEmpty();
        return popper.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
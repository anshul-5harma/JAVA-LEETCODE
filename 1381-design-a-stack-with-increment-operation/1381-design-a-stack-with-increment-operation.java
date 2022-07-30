class CustomStack {
    int[] items;
    int size = 0;
    
    public CustomStack(int maxSize) {
        items = new int[maxSize];
    }
    
    public void push(int x) {
        if(size == items.length) return;
        items[size++] = x;
    }
    
    public int pop() {
        if(size == 0) return -1;
        return items[--size];
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, items.length); i++) {
            items[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
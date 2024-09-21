class MinStack {
    Stack<Long> st = new Stack<>();
    long min = Integer.MAX_VALUE;
    
    public void push(int val) {
        
        if(st.isEmpty()){
            min = (long)val;
        }
        if(min > val){
            st.push(val + (val - min));
            min = val;
            return;
        }

        st.push((long)val);
    }
    
    public void pop() {
        if(st.isEmpty())
            return ;
        if(st.peek() < min){
            min = 2 * min - st.peek();
        }
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty())
            return -1;
        if(st.peek() < min)
            return (int)min;
        long ans = st.peek();
        return (int)ans;

    }
    
    public int getMin() {
        if(st.isEmpty())
            return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
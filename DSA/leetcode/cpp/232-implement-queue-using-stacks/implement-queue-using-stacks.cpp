class MyQueue {
public:
    stack <int> s1,s2;
    MyQueue() {
        
    }
    
    void push(int x) {
        int size=s1.size();

        for(int i=0;i<size;i++){
            s2.push(s1.top());
            s1.pop();
        }

        s1.push(x);

        for(int i=0;i<size;i++){
            s1.push(s2.top());
            s2.pop();
        }
    }
    
    int pop() {
        int x=s1.top();
        s1.pop();
        return x;
    }
    
    int peek() {
        return s1.top();
    }
    
    bool empty() {
        if(s1.size()==0)
            return true;
        return false;
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
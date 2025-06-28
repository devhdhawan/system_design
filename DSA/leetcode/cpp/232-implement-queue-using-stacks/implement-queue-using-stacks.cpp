class MyQueue {
    int *arr;
    int size;
    int front;
    int rear;
public:
    MyQueue() {
        arr=new int[1000];
        size=0;
        front=-1;
        rear=-1;
    }
    
    void push(int x) {
        if(size==0){
            front=0;
            rear=0;
        }
        else{
            rear++;
        }
        size++;
        arr[rear]=x;
    }
    
    int pop() {
        int x=arr[front];
        front++;
        size--;
        return x;
    }
    
    int peek() {
        return arr[front];
    }
    
    bool empty() {
        if(size==0)
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
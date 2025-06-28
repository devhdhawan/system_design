class MyStack {
public:
    int *arr1;
    int *arr2;
    int size;
    int front1;
    int rear1;
    int front2;
    int rear2;
    MyStack() {
        arr1=new int[1000];
        arr2=new int[1000];

        size=0;
        
        front1=0;
        front2=0;

        rear1=0;
        rear2=0;
    }
    


    void push(int x) {
        if(size==0){
           
            rear1=0;
            rear2=0;
            size=1;
            front2=0;

            arr2[rear2]=x;
        }else{
            rear1=0;
            front1=0;
          
            for(int i=rear2;i>=front2;i--){
                arr1[rear1]=arr2[i];
                rear1++;
            }
            
            arr1[rear1]=x;
            
            rear2=front2;
            
        
            for(int i=rear1;i>=front1;i--){
                arr2[rear2]=arr1[i];
                rear2++;
              
            }
            size++;

        }
        
    }
    
    int pop() {
        int x=arr2[front2];
        front2++;
        size--;
        return x;
    }
    
    int top() {
        return arr2[front2];
    }
    
    bool empty() {
        if(size==0)
            return true;
        return false;
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */
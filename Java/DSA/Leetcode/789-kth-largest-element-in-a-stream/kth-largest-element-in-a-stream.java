class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    int height;
    int count;

    TreeNode(){
    }

    TreeNode(int val){
        this.left=null;
        this.right=null;
        this.val=val;
        this.height=1;
        this.count=1;
    }
}
class KthLargest {
    TreeNode root;
    int k;
    int len;
    public int height(TreeNode root){
        if(root==null)
            return 0;
        return root.height;
    }

    public int getBalanceFactor(TreeNode root){
        if(root==null)
            return 0;
        return height(root.left)-height(root.right);
    }

    public TreeNode leftRotate(TreeNode node){
        TreeNode rt=node.right;
        TreeNode rtLeft=rt.left;

        rt.left=node;
        node.right=rtLeft;

        node.height = 1+Math.max(height(node.left),height(node.right));
        rt.height = 1+Math.max(height(rt.left),height(rt.right));
        

        return rt;

    }

    public TreeNode rightRotate(TreeNode node){
        TreeNode rt=node.left;
        TreeNode rtRight=rt.right;

        rt.right=node;
        node.left=rtRight;

        node.height = 1+Math.max(height(node.left),height(node.right));
        rt.height = 1+Math.max(height(rt.left),height(rt.right));
        

        return rt;

    }
    public TreeNode insertNode(TreeNode root,int value){
        
        if(root==null){
            root=new TreeNode(value);
            
        }else{
            if(root.val>value){
                root.left = insertNode(root.left,value);
            }else if(root.val<value){
                root.right = insertNode(root.right,value);
            }else{
                root.count=root.count+1;
                return root;
            }
            
            root.height = 1+Math.max(height(root.left),height(root.right));

            int balance = getBalanceFactor(root);

            // LL Rotate
            if(balance>1 && value < root.left.val)
                return rightRotate(root);
            // LR Rotate
            if(balance>1 && value > root.left.val){
                root.left=leftRotate(root.left);
                return rightRotate(root);
            }
            
            // RL Rotate
            if(balance<-1 && value < root.right.val){
                root.right=rightRotate(root.right);
                return leftRotate(root);
            }

            if(balance<-1 && value > root.right.val)
                return leftRotate(root);
        }
        return root;
    }

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.root = null;

        for(int i=0;i<nums.length;i++){
            this.root=insertNode(this.root,nums[i]);
        }
      
    }
    public int inorder(TreeNode root){
        if(root==null)
            return -10001;
        
        int val=inorder(root.right);
        if(val!=-10001)
            return val;
        this.len=this.len-root.count;
        if(len<=0)
            return root.val;
        
        val=inorder(root.left);

        return val;
    }


    public int add(int val) {
      
        this.root=insertNode(this.root,val);
        this.len=this.k;
        return inorder(this.root);

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
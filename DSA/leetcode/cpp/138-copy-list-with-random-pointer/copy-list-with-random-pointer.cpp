/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        Node* copyHead=NULL;
        Node* head1=head;
        Node* curr=NULL;
        map<Node*,int> mp1;
        map<int,Node*> mp2;
        int index=0;
        
        while(head!=NULL){
            Node* node=new Node(head->val);
            mp1[head]=index;
            mp2[index]=node;
            
            if(copyHead==NULL){
                copyHead=node;
                curr=node;
            }else{
                curr->next=node;
                curr=curr->next;
            }
            head=head->next;
            index++;
        }

        mp1[NULL]=index;
        head=copyHead;
        
        while(head1!=NULL and head!=NULL){
            index=mp1[head1->random];
            head->random=mp2[index];
            head1=head1->next;
            head=head->next;
        }

        return copyHead;
    }
};
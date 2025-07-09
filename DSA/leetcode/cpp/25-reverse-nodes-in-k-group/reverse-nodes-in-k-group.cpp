/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reverse(ListNode* start,ListNode* end){
        ListNode* curr=start;
        ListNode* prev=NULL;

        while(curr!=end){
            ListNode* temp=curr->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
        }
        curr->next=prev;

    
    }

    int getCount(ListNode* head){
        int count=0;
        while(head!=NULL){
            head=head->next;
            count=count+1;
        }
        return count;
    }

   
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* start=NULL;
        ListNode* end=NULL;
        ListNode* newHead=NULL;
        ListNode* prevEndNode=NULL;
        ListNode* curr=head;

        
        int listlen=getCount(head);
        int nitr=listlen/k;

        for(int i=0;i<nitr;i++){
            int loop=k;

            start=curr;
            while(loop!=0){
                end=curr;
                loop--;
                curr=curr->next;
            }
            
            reverse(start,end);
            
            if(newHead==NULL)
                newHead=end;
            else{
                prevEndNode->next=end;
            }

            start->next=curr;
            prevEndNode=start;
        }

        return newHead;
        

    }
};
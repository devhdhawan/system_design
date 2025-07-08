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
    ListNode* reverse(ListNode* head){
        ListNode* curr=head;
        ListNode* prev=NULL;
        ListNode* tmp=NULL;

        while(curr!=NULL){
            tmp=curr->next;
            curr->next=prev;
            prev=curr;
            curr=tmp;
        }
        head=prev;
        return head;
    }
    bool isPalindrome(ListNode* head) {
        ListNode* slow=head;
        ListNode* fast=head;
        ListNode* prev=NULL;

        while(fast!=NULL and fast->next!=NULL){
            prev=slow;
            slow=slow->next;
            fast=fast->next->next;
        }


        ListNode* head2=reverse(slow);
        if(prev!=NULL)
            prev->next=NULL;
        
        ListNode* curr=head;

        while(curr!=NULL and head2!=NULL){
            if(curr->val!=head2->val)
                return false;
            curr=curr->next;
            head2=head2->next;
        }

        return true;

        return true;
    }
};
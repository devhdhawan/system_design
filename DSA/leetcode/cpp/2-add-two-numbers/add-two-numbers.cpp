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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry=0;
        ListNode* head=NULL;
        ListNode* curr=NULL;

        while(l1!=NULL and l2!=NULL){
            int addVal=l1->val+l2->val+carry;

            int mod=addVal%10;
            carry=addVal/10;

            if(head==NULL){
                head=new ListNode(mod);
                curr=head;
            }else{
                curr->next=new ListNode(mod);
                curr=curr->next;
            }
            l1=l1->next;
            l2=l2->next;
        }

        while(l1!=NULL){
            int addVal=l1->val+carry;

            int mod=addVal%10;
            carry=addVal/10;

            if(head==NULL){
                head=new ListNode(mod);
                curr=head;
            }else{
                curr->next=new ListNode(mod);
                curr=curr->next;
            }
            l1=l1->next;

        }

        while(l2!=NULL){
            int addVal=l2->val+carry;

            int mod=addVal%10;
            carry=addVal/10;

            if(head==NULL){
                head=new ListNode(mod);
                curr=head;
            }else{
                curr->next=new ListNode(mod);
                curr=curr->next;
            }
            l2=l2->next;
        }

        if(carry>0){
            curr->next=new ListNode(carry);
        }

        return head;
    }
};
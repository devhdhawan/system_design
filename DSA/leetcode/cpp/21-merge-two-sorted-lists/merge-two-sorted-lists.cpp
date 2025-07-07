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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1== NULL)
            return list2;
        
        if(list2==NULL)
            return list1;
        
        ListNode* head=NULL;
        ListNode* curr=NULL;

        while(list1!=NULL and list2!=NULL){
            if(list1->val<list2->val){
                if(head==NULL){
                    head=list1;
                    curr=list1;
                }else{
                    curr->next=list1;
                    curr=curr->next;
                }
                list1=list1->next;
                curr->next=NULL;
            }else{
                if(head==NULL){
                    head=list2;
                    curr=list2;
                }else{
                    curr->next=list2;
                    curr=curr->next;
                }
                list2=list2->next;
                curr->next=NULL;
            }
        }

        if(list1==NULL)
            curr->next=list2;
        
        if(list2==NULL)
            curr->next=list1;
        
        return head;
    }
};
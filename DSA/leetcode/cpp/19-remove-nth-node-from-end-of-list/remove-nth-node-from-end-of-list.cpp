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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* tail=head;
        ListNode* curr=head;
        int listcount=1;

        while(tail->next!=NULL){
            listcount++;
            tail=tail->next;
        }

        while(listcount>(n+1)){
            curr=curr->next;
            listcount--;
        }

        if(listcount==(n+1)){
            curr->next=curr->next->next;
        }else{
            head=curr->next;
        }
        return head;




    }
};
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
    ListNode* reverseList(ListNode* head) {
        ListNode *currNode=NULL;
        ListNode *nextNode=NULL;
        //comment
        while(head!=NULL){
            nextNode=head->next;
            head->next=currNode;
            currNode=head;
            head=nextNode;
        }

        return currNode;
        
    }
};
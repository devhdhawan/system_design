/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int getCount(ListNode* head){
        int count=0;
        while(head!=NULL){
            head=head->next;
            count=count+1;
        }

        return count;
    }
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int countA=getCount(headA);
        int countB=getCount(headB);
        int diff=0;

        if(countB>countA){
            diff=countB-countA;
            while(diff!=0){
                diff--;
                headB=headB->next;
            }
        }
        else{
            diff=countA-countB;
            while(diff!=0){
                diff--;
                headA=headA->next;
            }
        }

        while(headA!=headB){
            headA=headA->next;
            headB=headB->next;
        }

        if(headA==NULL)
            return NULL;
        return headA;
        

    }
};
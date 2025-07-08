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
    int getCount(ListNode* head){
        int count=0;

        while(head!=NULL){
            head=head->next;
            count++;
        }

        return count;
    }
    ListNode* rotateRight(ListNode* head, int k) {
        int len=getCount(head);
        if(len==0)
            return head;
        k=k%len;
        if(k==0)
            return head;

        len=len-k;
        ListNode* start=head;
        ListNode* end=NULL;
        ListNode* newStart=NULL;
        ListNode* newEnd=NULL;

        while(len!=0){
            len--;
            end=head;
            head=head->next;
        }

        newStart=head;

        while(head!=NULL and head->next!=NULL){
            head=head->next;
        }
        newEnd=head;

        newEnd->next=start;
        end->next=NULL;

        return newStart;


    }
};
8/**
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
        //it is helper  Helper function to reverse a linked list test one
        ListNode* reverseList(ListNode* head) {
            ListNode* prev = nullptr;
            ListNode* curr = head;
            
            while (curr != nullptr) {
                ListNode* nextTemp = curr->next;
                curr->next = prev;
                prev = curr;
                curr = nextTemp;
            }
            
            return prev;
        }
        
        int pairSum(ListNode* head) {
            // Step 1: Use two pointers to find the middle of the list
            ListNode* slow = head;
            ListNode* fast = head;
            
            while (fast != nullptr && fast->next != nullptr) {
                slow = slow->next;
                fast = fast->next->next;
            }
            
            // Step 2: Reverse the second half of the list
            ListNode* secondHalfHead = reverseList(slow);
            
            // Step 3: Traverse the first half and the reversed second half simultaneously
            ListNode* firstHalfHead = head;
            int maxTwinSum = 0;
            
            while (secondHalfHead != nullptr) {
                // Calculate the twin sum
                int twinSum = firstHalfHead->val + secondHalfHead->val;
                maxTwinSum = std::max(maxTwinSum, twinSum);
                
                // Move both pointers forward this is move
                firstHalfHead = firstHalfHead->next;
                secondHalfHead = secondHalfHead->next;
            }
            
            // Step 4: Return the maximum twin sum of the numbers here in Step 4 return maximum sum
            return maxTwinSum;
        }
    };
    

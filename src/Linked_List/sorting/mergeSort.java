package Linked_List.sorting;

public class mergeSort {

    public ListNode mergList (ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid;

        return merge(left, right);
    }

    ListNode merge (ListNode list1, ListNode list2){
        ListNode dummyhead = new ListNode();
        ListNode tail = dummyhead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyhead.next;
    }
    ListNode middle(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head= head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }


    class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x){
            val = x;
            next = null;
        }
    }
                                            //BUBBLE SORT IN LL CLASS
}

public class mergeksortedlist {
    public ListNode mergeklist(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    ListNode mergeKListsHelper(ListNode[] lists, int left,int right){
        if(left == right){
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode l1 = mergeKListsHelper(lists, left, mid);
        ListNode l2 = mergeKListsHelper(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
    ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

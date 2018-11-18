package useCases;

//Remove nth element from end of linklist
public class RemoveNthElement {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = new ListNode(0);
		int count = 0;

		node = head;
		// count total nodes
		while (node != null) {
			node = node.next;
			count++;
		}

		int num = count - n;
		ListNode prev = new ListNode(0);
		node = head;
		count = 0;

		// remove first element
		if (num == 0) {
			head = node.next;
		}

		while (count != num) {
			prev = node;
			node = node.next;
			count++;
		}

		prev.next = node.next;
		return head;
	}
}

package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class LinkedListBasic {

    static void traverseLinkedList() {
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);
    }

    static int fls(String s) {
        int pointer = 0;
        TreeMap<Integer, String> rMapp = new TreeMap<>();
        Set<Character> hashSet = new HashSet<>();

        while (pointer < s.length()) {
            String turn = s.substring(pointer, s.length());
            for (int i = 0; i < turn.length(); i++) {
                hashSet.add(turn.charAt(i));
            }
            rMapp.put(hashSet.size(), hashSet.toString());
            System.out.println(hashSet);
            hashSet.clear();
            pointer++;
        }
        return rMapp.size() != 0 ? rMapp.lastEntry().getKey() : s.length();
    }

    static void sort() {
        int[] arr = { 1000, 8, 2, 16, 3, 50 };
        int pointer = 0;

        while (pointer < arr.length) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            pointer++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    static void reverse() {
        String s = "vibgyor";
        String reversed = "";
        int pointer = s.length() - 1;

        while (pointer >= 0) {
            reversed += s.charAt(pointer);
            pointer--;
        }

        System.out.println();
        System.out.println(reversed);
    }

    static int[] sortTreeMap() {
        int[] arr = { 1000, 8, 2, 16, 3, 50 };
        TreeMap<Integer, Integer> st = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            st.put(arr[i], arr[i]);
        }

        int index = 0;
        for (int key : st.keySet()) {
            arr[index++] = key;
        }

        for (int num : arr) {
            System.out.print(num + ",");
        }

        return arr;
    }

    static void sorti() {
        int[] arr = { 1000, 8, 2, 16, 3, 50 };
        int[] res = new int[arr.length];
        int pointer = 0;

        for (int index = 0; index < arr.length; index++) {

        }
    }

    static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void reverseArray() {
        int[] arr = { 1000, 8, 2, 16, 3, 50 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int e : arr) {
            System.out.print(e + ",");
        }
    }

    static void reverseList() {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(5);
        li.add(10);
        li.add(15);
        li.add(20);
        li.add(25);

        int left = 0;
        int right = li.size() - 1;

        while (left < right) {
            int temp = li.get(left);
            li.remove(left);
            li.add(left, li.get(right));

            li.remove(right);
            li.add(right, temp);


            left++;
            right--;
        }

        System.out.print(li);
    }

    public static void main(String[] args) {
        // traverseLinkedList();
        // System.out.println("Longest Substring : " + fls("nhkyylsi"));
        // sort();
        // reverse();
        // sortTreeMap();
        // reverseArray();

        // 1,2,3,4,5,6
        // 2,1,4,3,6,5
        // reverseList();
    }
}
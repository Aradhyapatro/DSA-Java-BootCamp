package com.Quetions.Easy;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        
    }
    public int getDecimalValue(ListNode head) {
        int count=0;
        ListNode temp=head;
        int num=0;
        while(temp!=null){
            num=(num*10)+temp.val;
            temp=temp.next;
            // count++;
        }
        System.out.println(num);
        int n=0;
        while(num>=0){
            int r=num%10;
            // System.out.println(r+" "+count);

            n+=r*Math.pow(2,count);
            count++;
            num=num/10;
        }
        
        return n;
        
    }
}
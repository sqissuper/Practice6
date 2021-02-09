package com.company;

import java.util.*;

public class Main {

    //只出现一次的数字
//    public int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums.length; i++) {
//            if(set.contains(nums[i])) {
//                set.remove(nums[i]);
//            } else {
//                set.add(nums[i]);
//            }
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(set.contains(nums[i])) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }

    /**
     * 找出10W个数据当中，第一个重复的数据
     * 思路：遍历list 拿到每个元素之后 存到set 注意，存储之前，需要看set中是否
     * 有这个数据？有 就说明找到了第一个重复的数据
     * @return
     */
//    public static int findFirstRepeatNumber() {
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10_0000; i++) {
//            list.add(random.nextInt(1_0000));
//        }
//
//        HashSet<Integer> set = new HashSet<>();
//        //contatins
//        int i = 0;
//        while(!list.isEmpty()) {
//            int tmp = list.get(i);
//            if(!set.contains(tmp)) {
//                set.add(tmp);
//            } else {
//                return tmp;
//            }
//            i++;
//        }
//        return -1;
//
//    }
    /**
     * 把10W个数据当中的重复的数据 去重
     * 思路：只需要把10W个数据放到集合当中
     * @return
     */
//    public static Set<Integer> deputil() {
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10_0000; i++) {
//            list.add(random.nextInt(1_0000));
//        }
//
//    }

//    public static int singleNumber(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i])) {
//                Integer num = map.get(nums[i]);
//                map.put(nums[i],num +1);
//            } else {
//                map.put(nums[i],1);
//            }
//        }
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
//        for (Map.Entry<Integer, Integer> m:set) {
//            if(m.getValue() == 1) {
//                return m.getKey();
//            }
//        }
//        return -1;
//    }

    //同构字符串
//    public static boolean isIsomorphic(String s, String t) {
//        if(s.length() != t.length()) return false;
//        HashMap<Character,Character> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) {
//            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
//                map.put(s.charAt(i),t.charAt(i));
//            } else {
//                if(map.get(s.charAt(i)) == null) return false;
//                else if(map.get(s.charAt(i)) != t.charAt(i)) return false;
//                else break;
//            }
//        }
//        return true;
//    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums1.length; i++) {
//            for(int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]) {
//                    set.add(nums2[i]);
//                }
//            }
//        }
//        int[] ret = new int[set.size()];
//        int i = 0;
//        for (int x:set) {
//            ret[i++] = x;
//        }
//        return ret;
//    }

    //复制带随机指针的链表
//    public Node copyRandomList(Node head) {
//        if(head ==null) return null;
//        HashMap<Node,Node> map = new HashMap<>();
//        Node cur = head;
//        while(cur != null) {
//            Node node = new Node(cur.val);
//            map.put(cur,node);
//            cur = cur.next;
//        }
//        cur = head;
//        while (cur != null) {
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(head);
//    }

    //坏键盘打字
//    public static void fun(String s1, String s2) {
//        HashSet<Character> set = new HashSet<>();
//        HashSet<Character> set1 = new HashSet<>();
//        for(char ch : s2.toUpperCase().toCharArray()) {
//            set.add(ch);
//        }
//
//        for(char ch : s1.toUpperCase().toCharArray()) {
//            if(!set.contains(ch) && !set1.contains(ch)) {
//                set1.add(ch);
//                System.out.print(ch);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();//期望
//        String s2 = sc.nextLine();//实际
//        fun(s1,s2);
//    }

      //字符串中的第一个唯一字符
//    public int firstUniqChar(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        char[] ch = s.toCharArray();
//        for(char c : ch) {
//            if(map.containsKey(c)) {
//                Integer num = map.get(c);
//                map.put(c,num + 1);
//            } else {
//                map.put(c,1);
//            }
//        }
//        for(int i = 0; i < ch.length; i++) {
//            if(map.get(ch[i]) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('c',1);
//        map.put('a',2);
//        map.put('v',3);
//        map.put('o',7);
//        map.put('p',2);
//        map.put('c',map.getOrDefault('c',0) + 1);
//        System.out.println(map.get('c'));


//        String s = "cc";
//        System.out.println(firstUniqChar(s));
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
//        intersection(nums1,nums2);
//        Set<Integer> set = new HashSet<>();

//        String s = "aaeaa";
//        String t = "uuxyy";
//        System.out.println(isIsomorphic(s, t));
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('c',1);
//        map.put('a',2);
//        map.put('v',3);
//        map.put('r',3);
//        System.out.println(map.get('c'));
//        System.out.println(map);
//        int[] nums = {2,2,1};
//        System.out.println(singleNumber(nums));
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Set<Integer> set= new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(1);
//        set.add(5);
//        set.add(3);
//        System.out.println(set);
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("史强",12345);
//        hm.put("史娟",43543);
//        hm.put("史莉",3452);
//        System.out.println(hm.get("史娟"));
//        System.out.println(hm);
//
//        Set<Map.Entry<String, Integer>> set = hm.entrySet();
//        for (Map.Entry<String, Integer> entry:set) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}

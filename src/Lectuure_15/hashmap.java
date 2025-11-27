package Lectuure_15;

// hashmaps in java****

import java.util.HashMap;
 class main{
     public static void main(String[] args){

//         int arr[]={1,2,3,4,5,5,6};
         String str ="DhruvvD";
         int n= str.length();
//         HashMap<Character,Integer> map = new HashMap<>();
//         map.put(1,10);
//         map.put(2,20);
//         System.out.println(map.get(3));
//        System.out.println(map.getOrDefault(3, 0));  // we can assign any default value
//         System.out.println(map.containsKey(3)); // tells boolean answers

//         for(int x: map.keySet()){     // Give every  values in hashmap
//             System.out.println(map.get(x));
//
//         }

         // count frequency from using hashmap of an array

//         for(int n:arr){
//             map.put(n,map.getOrDefault(n,0)+1);
//         }
//         System.out.println(map);




//         for(char ch:str.toCharArray()){
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         System.out.println(map);
//
//         for(char ch:str.toCharArray()){
//             if(map.get(ch)==1){
//                 System.out.println(ch);
//                break;        // not using break will lead to all single time elements
//             }
//         }

         // two sum elements index number

         HashMap<Integer,Integer> map = new HashMap<>();
         int arr[]={2,7,11,15};
         int sum=9;
         for(int i=0;i<arr.length;i++){
             int diff=sum-arr[i];
             if(map.containsKey(diff)){
                 System.out.println(map.get(diff)+" "+i);
                 break;

                 }
             map.put(arr[i],i);
             }
         }



     }




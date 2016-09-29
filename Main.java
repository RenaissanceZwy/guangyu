package com.guangyu.test;
import java.util.HashMap;  
import java.util.Map;  
  
public class Main {  
  
    public static int getSubStringLength(String s) {  
        Map<Character,Integer> map=new HashMap<Character,Integer>();  
        int length=0;  
        int now=0;  
        for(int i=0;i<s.length();i++){  
            if(map.containsKey(s.charAt(i))){  
                now=Math.max(map.get(s.charAt(i))+1,now);  
                if((i-now+1)>length){  
                	length=i-now+1;  
                      
                }  
            }else{  
                if((i-now+1)>length){  
                	length=i-now+1;  
                }  
            }  
            map.put(s.charAt(i), i);  
        }  
        return length;  
    }  
    public static void main(String[] args) {  
        String str="abc";  
        System.out.println(getSubStringLength(str));  
    }  
  
}  
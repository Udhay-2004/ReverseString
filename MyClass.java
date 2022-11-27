import java.util.*;
public class MyClass {
 public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 String name=sc.nextLine();
 int case_option=sc.nextInt();
 printResult(name,case_option);
 }
 
 static String reverseRetainingPosCase(String w){
 StringBuffer rev=new StringBuffer(w);
 rev.reverse();
 for(int i=0;i<w.length();i++){
 if(Character.isUpperCase(w.charAt(i))){
 rev.setCharAt(i,Character.toUpperCase(rev.charAt(i)));
 }
 else if(Character.isLowerCase(w.charAt(i))){
 rev.setCharAt(i,Character.toLowerCase(rev.charAt(i)));
 }
 }
 return rev.toString();
 }
  
  static String reverseIncludingCase(String w){
 StringBuffer rev2=new StringBuffer(w);
 rev2.reverse();
 for(int i=0;i<w.length();i++){
 if(Character.isUpperCase(w.charAt(i))){
 rev2.setCharAt(i,Character.toLowerCase(rev2.charAt(i)));
 }
 else if(Character.isLowerCase(w.charAt(i))){
 rev2.setCharAt(i,Character.toUpperCase(rev2.charAt(i)));
 }
 }
 return rev2.toString();
 }

  
  static void printResult(String name,int case_option){
 System.out.println("original string= "+name+" and case option= "+case_option);
 
 if(case_option==0){
 StringBuffer sb=new StringBuffer(name);
 
 System.out.println(sb.reverse());
 }
 
 else if(case_option==1){
 StringBuffer sb2=new StringBuffer(name);
 String[] words = name.split(" ");
 for(String w:words){
 sb2.replace(sb2.indexOf(w),sb2.indexOf(w)+w.length(),reverseRetainingPosCase(w));
 }
 System.out.println(sb2.toString());
 
 }
else if(case_option==2){
  StringBuffer sb3=new StringBuffer(name);
 String[] words=name.split(" ");
 for(String w:words){
 sb3.replace(sb3.indexOf(w),sb3.indexOf(w)+w.length(),reverseIncludingCase(w));
 }
 System.out.println(sb3.toString());
}
}
}

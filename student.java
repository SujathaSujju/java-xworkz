class student{
String studentname;
String branch;
int rollno;
int dob;
String clgname;

void study(){

  System.out.println(studentname+" is in the branch "+branch+"\n she is studying in "+clgname+"\n");
 }
public static void main(String args[]){
   student std = new student();
   std.studentname = "sujatha";
   std.branch = "bsc";
   std.rollno = 05;
   std.dob =2000;
   std.clgname = "vnc college";
   std.study();
  
  student std1 = new student();
  std1.studentname = "shirisha";
  std1.branch = "engineering";
  std1.rollno = 10;
  std1.dob = 1999;
  std1.clgname = "rymec college";
  std1.study();

  student std2 = new student();
  std2.studentname = "poornima";
  std2.branch = "bsc";
  std2.rollno = 15;
  std2.dob = 1999;
  std2.clgname = "vijayanagara college";
  std2.study();

}
}

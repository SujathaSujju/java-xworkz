class NestedIfConditionDemo{
public static void main(String[] args){
String qualification = "Bsc";
boolean knowJava = true;

if (qualification == "BE"){
if(knowJava){
System.out.println("your eligible to attend interview");
}
}
else{
System.out.println("your not eligible to attend interview");
}
}
}
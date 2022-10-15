class IfElseIfLadderDemo{

public static void main(String[] args){

double marks = 86;

if(marks>=85){
System.out.println("Boss you passed in Distinction !!!");
}
else if(marks>=60 && marks<85){
System.out.println("Boss you passed in First Class !!!");
}
else if(marks<60 && marks>=35){
System.out.println("Boss you passed in Second Class !!!");
}
else{
System.out.println("Boss you are Failed !!!");
}
}
}
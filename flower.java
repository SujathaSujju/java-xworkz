class flower{

String name;
String colour;
int noofpetals;

void sheddingfragrance(){

  System.out.println(colour+" "+name+" "+noofpetals+" is shedding fragance...");
}

void blooming(){

System.out.println(colour+" "+name+" "+noofpetals+" is blooming...");

}

public static void main(String args[]){

   flower rose = new flower();

   rose.name = "rose";
   rose.colour = "red";
   rose.noofpetals = 12;

  rose.blooming();
  rose.sheddingfragrance();


flower jasmine = new flower();

   jasmine.name = "jasmine";
   jasmine.colour = "white";
   jasmine.noofpetals = 5;

  jasmine.blooming();
  jasmine.sheddingfragrance();

flower sunflower = new flower();

   sunflower.name = "sunflower";
   sunflower.colour = "yellow";
   sunflower.noofpetals = 15;

  sunflower.blooming();
  sunflower.sheddingfragrance();

}

}
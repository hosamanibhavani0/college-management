//interface
interface Area
{
 final static float pi=3.142F;
 float compute(float x,float y);
}
//rectangle class
class Rectangle implements Area
{  
 public float compute(float x,float y)
 {
  float area=x*y;
  System.out.println("area of rectangle is"+area);
  return area;
 }
}
//circle class
class circle implements Area
{
 public float compute(float x,float y)
 {
  float area=pi*x*x;
  System.out.println("area of Circle is"+area); 
  return area;
 }
}
//main class
class interfaceTest
{
 public static void main(String args[])
 {
  Area area=new Rectangle();
  area.compute(2,3);
  area=new circle();
  area.compute(4,5);
 }
}

  
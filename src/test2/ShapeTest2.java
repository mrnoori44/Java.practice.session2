package test2;
import java.util.Objects;
import java.util.Scanner;
public class ShapeTest2 {
   int height,width,area,perimeter;

   public void setArea(int height,int width,String sh){
      area=height*width;
      System.out.println("The area of "+sh+" is: "+area);

   }

   public void setPerimeter(int height,int width,String sh){
      perimeter=(height+width)*2;
      System.out.println("The perimeter of "+sh+" is: "+perimeter);
   }

   public static void main(String[] args) {
      ShapeTest2 shape1=new ShapeTest2();
      ShapeTest2 shape2=new ShapeTest2();
      Scanner scanner=new Scanner(System.in);
       boolean k=true;
       while(k){
          System.out.println("please choose one shape out of square and rectangle :");
          System.out.println("Shape1: ");
          String sh1=scanner.nextLine();
          if(Objects.equals(sh1, "square")){
             System.out.println("please enter the height of the square: ");
             String h=scanner.nextLine();
             shape1.height=Integer.parseInt(h);
             shape1.setArea(shape1.height, shape1.height,"square");
             shape1.setPerimeter(shape1.height, shape1.height,"square" );
             System.out.println("Do you want to continue? y/n ");
             String y=scanner.nextLine();
             if(Objects.equals(y, "y"))
                continue;

             }
          else if (Objects.equals(sh1, "rectangle")){
             System.out.println("please enter the height of the rectangle: ");
             String t=scanner.nextLine();
             shape2.height=Integer.parseInt(t);
             System.out.println("please enter the width of the rectangle: ");
             String w=scanner.nextLine();
             shape2.width=Integer.parseInt(w);
             shape2.setArea(shape2.height, shape2.width,"rectangle" );
             shape2.setPerimeter(shape2.height, shape2.width,"rectangle" );
             System.out.println("Do you want to continue? y/n ");
             String y=scanner.nextLine();
             if(Objects.equals(y, "y"))
                continue;

          }
          else System.out.println("Not found");
          k=false;

       }

   }

}

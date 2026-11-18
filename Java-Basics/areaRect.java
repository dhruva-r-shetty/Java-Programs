import java.util.Scanner;
class areaRect{
    public static void main(String []args){

        double width=0;
        double height=0;
        double area=0;

        Scanner rect=new Scanner(System.in);
        
        System.out.print("Enter the value of side A: ");
        width=rect.nextDouble();

        System.out.print("Enter the value of side B: ");
        height=rect.nextDouble();

        area=height*width;
        System.out.println("The Area of The Rectangle is: "+area+" cm^2");
        rect.close();
    }
}
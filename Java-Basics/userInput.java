import java.util.Scanner;
class userInput{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.print("Enter your CGPA: ");
        double CGPA=scanner.nextDouble();

        System.out.print("Are You a student (True/False)?: ");
        boolean isStudent=scanner.nextBoolean();

        System.out.println("Hello, "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your CGPA is: ");
        if(isStudent){
            System.out.println("You are enrolled as a Student.");
        }
        else{
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}
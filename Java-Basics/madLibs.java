import java.util.Scanner;
class madLibs{

    public static void main(String args[]){

        //mad libs game
        String adj1;
        String adj2;
        String adj3;
        String noun1;
        String noun2;
        String verb1;
        String verb2;

        Scanner gram=new Scanner(System.in);

        System.out.print("Enter adj1: ");
        adj1=gram.nextLine();
        System.out.print("Enter adj2: ");
        adj2=gram.nextLine();
        System.out.print("Enter adj3: ");
        adj3=gram.nextLine();
        System.out.print("Enter noun1: ");
        noun1=gram.nextLine();
        System.out.print("Enter noun2: ");
        noun2=gram.nextLine();
        System.out.print("Enter verb1: ");
        verb1=gram.nextLine();
        System.out.print("Enter verb2: ");
        verb2=gram.nextLine();

        System.out.println("My name is"+noun1+" and today is my first day as a MCA "+adj1);
        System.out.println("I have joined "+noun2+" and I am very much "+adj3+" to start my journey here.");
        System.out.println("During my BCA days I did "+verb1+" hard for my MCA Entrance exams");
        System.out.println("Despite my hard work I wasn't able to crack Top 3 NIT's through NIMCET 2026. I was very "+adj2+" by this.");
        System.out.println("So, as my last shot at MCA exams I gave my everything in my last 3 days og PGCET Prep. This time my efforts paid off. ");
        System.out.println("I scored 77 marks and secured a rank 3. This made me happy and my parents proud. Seeing my results, The first thing I did was to "+verb2+" to my mother's shop to tell her my results");
        
        gram.close();
    }
}
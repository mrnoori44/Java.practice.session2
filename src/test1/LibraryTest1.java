package test1;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;

public class LibraryTest1 {
    String fname;
    String lname;
    int usernumber;
    String[] booklist ={"Alice in wonderland","Little prince","Beyond the world","Poetry of Hafiz"};


    public void intro(String first,String last,int number) {
        System.out.println("Wellcome to our Library Mr/Miss "+first+" "+last);
        System.out.println("Your membership number: "+number);

    }

    public void borrow(String book1){
        int i,count=0;
        for(i=0;i<4;i++){
            if(Objects.equals(booklist[i], book1))
                count++;
        }
        if(count>0)
            System.out.println("You have borrowed "+book1+" successfully for 21 days.");
        else System.out.println("sorry,can't find it");

    }

    public void returnbook(String book2) {
        Date date=new Date();
        System.out.println("You have returned "+book2+" successfully on"+date.toString());
    }

    public static void main(String[] args) {
        LibraryTest1 member=new LibraryTest1();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your firstname: ");
        member.fname=scanner.nextLine();
        System.out.println("Please enter your lastname: ");
        member.lname=scanner.nextLine();
        System.out.println("Please enter your membership number: ");
        String str=scanner.nextLine();
        member.usernumber=Integer.parseInt(str);
        member.intro(member.fname,member.lname,member.usernumber);
        System.out.println("Enter 1 for borrowing book or enter 2 for returning book ");
        String s=scanner.nextLine();
        int k=Integer.parseInt(s);
        if(k==1){
            System.out.println("Which book do you want to borrow from the booklist: " +
                    "Alice in wonderland,Little prince,Beyond the world,Poetry of Hafiz  ");
            String book1 = scanner.nextLine();
            member.borrow(book1);
        }
        else if (k==2) {
            System.out.println("please enter the name of the book: ");
            String book2=scanner.nextLine();
            member.returnbook(book2);
        }
        else System.out.println("Not found");




    }

}

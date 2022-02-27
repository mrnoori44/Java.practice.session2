package test3;
import java.util.Scanner;
public class DaneshjoTest3 {
    double mgrade,phgrade,chgrade,ligrade;
    double ave;
    String name;

    public void average(double mgrade,double phgrade,double chgrade,double ligrade,int zarib,String name){
        double sumgrade=mgrade+phgrade+chgrade+ligrade;
        double ave= sumgrade /zarib;
        System.out.println("The average of courses is:  "+ ave);
        if (ave >= 14.00)
            System.out.println(name+" is qualified for next semester.");
        else System.out.println(name+" is unqualified.");

    }


    public static void main(String[] args) {
        DaneshjoTest3 student=new DaneshjoTest3();
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter the name of student: ");
        student.name=scanner.nextLine();
        System.out.println("Enter Math grade: ");
        String m=scanner.nextLine();
        student.mgrade=Double.parseDouble(m);
        System.out.println("Enter Math factor: ");
        String mf=scanner.nextLine();
        int mfactor=Integer.parseInt(mf);

        System.out.println("Enter Physics grade: ");
        String p=scanner.nextLine();
        student.phgrade=Double.parseDouble(p);
        System.out.println("Enter physics factor: ");
        String pf=scanner.nextLine();
        int phfactor=Integer.parseInt(pf);

        System.out.println("Enter chemistry grade: ");
        String ch=scanner.nextLine();
        student.chgrade=Double.parseDouble(ch);
        System.out.println("Enter chemistry factor: ");
        String chf=scanner.nextLine();
        int chfactor=Integer.parseInt(chf);

        System.out.println("Enter Literature grade: ");
        String li=scanner.nextLine();
        student.ligrade=Double.parseDouble(li);
        System.out.println("Enter literature factor: ");
        String lif=scanner.nextLine();
        int lifactor=Integer.parseInt(lif);

        student.mgrade*=mfactor;
        student.phgrade*=phfactor;
        student.chgrade*=chfactor;
        student.ligrade*=lifactor;
        int factors=mfactor+phfactor+chfactor+lifactor;

        student.average(student.mgrade, student.phgrade, student.chgrade, student.ligrade, factors, student.name);



        }


    }


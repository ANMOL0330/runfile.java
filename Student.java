import javax.swing.*;

public class Student extends Person implements Result,Accomodation,holidays{
    String Date_of_registration;
    int year;
    String Branch;
    int JEE_ADV_Rank;
    int Family_income;
    double Attendance;
    int active_club_count;
    double cgpa;

    // STRING SUBJECTS STORES NAME OF ALL SUJECTS
    static String subjects []= {"EO-102","CSO-102","MA-111","MA-104","MA-102"};

    //ARRAY CREDITS CONTAIN THE CREDIT OF THE SUBJECTS STORED ABOVE RESPECTIVELY//
    static int credits[] = {13, 11, 11,6,11};

    //MARKS IS THE NUMBER WHICH YOU ACTUALLY SCORED IN EXAM //
    public int marks[]=new int[5];

    //SCORE IS THE RELATIVE GRADE YOU GOT FOR YOUR MARKS//
    public int score[]=new int[5];

    //CONSTRUCTOR FOR INITIALIZING THE VARIABLES OF STUDENT CLASS//
    public Student(String name,int age,String gender,String DOB,int id,String Category,String Address,String Blood_Group,String Date_of_Registration,int year,String Branch,int JEE_ADV_Rank,int Family_income,double Attendance,int active_club_count){

        //CALLING CONSTRUCTOR OF PERSON CLASS//
        super(name,age,gender,DOB,id,Category,Address,Blood_Group);

        this.Attendance=Attendance;
        this.active_club_count=active_club_count;
        this.Branch=Branch;
        this.year=year;
        this.JEE_ADV_Rank=JEE_ADV_Rank;
        this.Family_income=Family_income;
        this.Date_of_registration=Date_of_Registration;
    }

    //METHOD FOR DISPLAYING THE INFORMATION OF STUDENTS//
    public  void print(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("DOB:"+DOB);
        System.out.println("ID:"+id);
        System.out.println("Category:"+Category);
        System.out.println("Address:"+Address);
        System.out.println("Blood Group:"+Blood_Group);
        System.out.println("Date of Registration:"+Date_of_registration);
        System.out.println("Year:"+year);
        System.out.println("Branch:"+Branch);
        System.out.println("JEE ADV RANK:"+JEE_ADV_Rank);
        System.out.println("Family Income:"+Family_income);
        System.out.println("Active Club Count:"+active_club_count);
        hostel_allotment(year);
        fees(Family_income);
        leave_structure();
        percentage(Student.credits,marks,active_club_count);
    }

    //METHOD FOR CALCULATING THE RESULT OF STUDENTS//
    public void percentage(int credits[],int marks[],int b){
        for (int i=0;i<5;i++){
            if (marks[i]>80) score[i]=10;
            else if (marks[i]>70) score[i]=9;
            else if(marks[i]>60) score[i]=8;
            else if(marks[i]>50) score[i]=7;
            else score[i]=5;
        }
        int sum=0;
        for (int i=0;i<5;i++){
            sum=sum+credits[i]*score[i];
        }
        sum=sum+b*grace_credits;
        cgpa=sum/(52.0);
        if (Attendance<75)System.out.println("Fakka Lag Gya!!");
        else {
            if (cgpa<10)System.out.println("Congratulations, you have passes with CGPA:"+cgpa);
            else System.out.println("Congratulations, you have passes with CGPA: 10");
        }
    }

    //METHOD FOR HOSTEL ALLOTMENT FOR STUDENTS//
    public void hostel_allotment(int year){
        if(year==1) System.out.println("ARYABHATTA HOSTEL");
        else if(year==2)  System.out.println("DG-2 HOSTEL");
        else if(year==3) System.out.println("RAJAPUTANA HOSTEL");
        else  System.out.println("LIMBDI HOSTEL");
    }

    //METHOD DECLARING THE AMOUNT OF FEES TO BE PAID BY STUDENTS//
    public void fees(int Family_income) {
        int fee = 0;
        if (Family_income <= 100000) {
            fee = 14020;
        }
        if (Family_income > 100000 && Family_income <= 500000) {
            fee = 40010;
        }
        if (Family_income > 500000) {
            fee = 106000;
        }
        System.out.println("Fees to be paid is :"+ fee);
    }

    //METHOD DECLARING THE LEAVES ALLOWED TO STUDENTS//
    public void leave_structure() {
        System.out.println("leave structure is as follows:");
        System.out.println("All days declared as national holidays are holidays");
        System.out.println("All Saturday and Sunday are holidays");
        System.out.println("Semester and mid-semester leaves will be provided");
        System.out.println("Leaves will be provided on medical emergency");
        System.out.println("Attendance must be above 75%");
        System.out.println("Leaves can be given on indulgement in co-curriculam activities");
    }
}
import java.util.*;

public class Main{
    public static void main(String[] args) {

        //STORING STUDENT DETAILS//
        //active_club_counts means awards won by students in different co-curricular activities//
        Student s1 = new Student("Anmol Shukla", 20, "M", "20-11-2002", 22124008, "Gen", "Aryabhatta hostel A-236", "O+", "27-10-2022", 1, "MNC", 2923, 590000, 85.12, 3);
        Student s2 = new Student("Hardik Sharma", 19, "M", "23-12-2003", 22124018, "Gen", "Aryabhatta hostel B-102", "AB-", "27-10-2022", 2, "MNC", 1649, 800000, 80.13, 4);
        Student s3 = new Student("Jinesh Jain", 18, "M", "2-1-2004", 22214041, "Gen", "Aryabhatta hostel B-213", "B+", "27-10-2022", 3, "CSE", 604, 695200, 90.76, 1);
        Student s4 = new Student("Anmol Kumar Singh", 19, "M", "15-11-2003", 22454008, "Gen", "Aryabhatta hostel A-236", "A+", "27-10-2022", 5, "META", 15923, 712000, 76, 0);

        //STORING PROFESSOR DETAILS//
        Professor p1 = new Professor("Aneesh Kesarwani", 45, "M", "16-4-1977", 72124001, "Gen", "Hyderabad colony S-132", "B+", "Married", 4, 16, "Phd-Mathematics","Professor");
        Professor p2 = new Professor("Ashish Arora",51 , "M", "1-2-1972", 72114018, "Gen", "Hyderabad colony S-111", "AB-", "Married", 7, 20, "Phd-Electronics","Convener");

        //MARKS OF STUDENT IN DIFFERENT SUBJECTS//
        s1.marks= new int[]{80, 76, 60, 75, 81};
        s2.marks=new int[]{85,74,80,80,88};
        s3.marks=new int[]{84,80,75,77,80};
        s4.marks=new int[]{75,70,52,60,70};

        //DISPLAYING STUDENTS INFORMATION//
        s1.print();
        s2.print();
        s3.print();
        s4.print();

        //DISPLAYING PROFESSORS INFORMATION
        p1.printf();
        p2.printf();
    }
}
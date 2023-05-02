public class Professor extends Person implements Salary,Accomodation,holidays {
    String Marital_Status;
    int no_Research_paper;
    int Work_exp;
    String Qualification;
    String Post;

    // CONSTRUCTOR FOR INITIALIZING THE VARIABLES OF PROFESSORS CLASS //
    public Professor(String name, int age, String gender, String DOB, int id, String Category, String Address, String Blood_Group, String Marital_Status, int no_Research_paper, int Work_exp, String Qualification, String Post) {

        // CALLING CONSTRUCTOR OF PERSON CLASS
        super(name, age, gender, DOB, id, Category, Address, Blood_Group);

        this.Marital_Status = Marital_Status;
        this.no_Research_paper = no_Research_paper;
        this.Work_exp = Work_exp;
        this.Qualification = Qualification;
        this.Post = Post;
    }

    // METHOD DISPLAYING PROFESSORS INFORMATION//
    public void printf() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("DOB:" + DOB);
        System.out.println("id:" + id);
        System.out.println("Category:" + Category);
        System.out.println("Address:" + Address);
        System.out.println("Blood Group:" + Blood_Group);
        System.out.println("Marital Status:" + Marital_Status);
        System.out.println("number of research paper:" + no_Research_paper);
        System.out.println("Work Experience:" + Work_exp);
        System.out.println("Qualification:" + Qualification);
        System.out.println("Post:" + Post);
        Total_Salary_Calculation();
        hostel_allotment(Work_exp);
        leave_structure();
    }

    //METHOD FOR CALCULATING INHAND SALARY OF PROFESSORS//
    public void Total_Salary_Calculation() {
        int base_salary = 0;
        if (Post == "Assisstant_professor") {
            base_salary = Base_Assisstant_Professor_Salary;
        }
        if (Post == "Assossiate_professor") {
            base_salary = Base_Associate_Professor_Salary;
        }
        if (Post == "Professor") {
            base_salary = Base_Professor_Salary;
        }
        if (Post == "Convener") {
            base_salary = Base_Convener_Salary;
        }
        if (Post == "HOD") {
            base_salary = Base_HOD_Salary;
        }
        if (Post == "Dean") {
            base_salary = Base_Dean_Salary;
        }
        int total_salary = base_salary + (no_Research_paper * research_paper_factor) + (Work_exp * work_experience_factor);
        System.out.println("Salary:" + total_salary);
    }

    //METHOD FOR ALLOCATING APARTMENT TO PROFESSORS//
    public void hostel_allotment(int work_exp) {
        if (work_exp < 10) System.out.println("THE ACCOMODATION ALLOTED TO YOU IS ON 1ST FLOOR IN PROFESSOR BUILDING");
        else if (work_exp < 18)
            System.out.println("THE ACCOMODATION ALLOTED TO YOU IS ON 2ND FLOOR IN PROFESSOR BUILDING");
        else if (work_exp < 25)
            System.out.println("THE ACCOMODATION ALLOTED TO YOU IS ON 3RD FLOOR IN PROFESSOR BUILDING");
        else System.out.println("THE ACCOMODATION ALLOTED TO YOU IS ON 4TH FLOOR IN PROFESSOR BUILDING");
    }

    // METHOD DECLARING ALLOWED LEAVES TO THE PROFESSORS//
    public void leave_structure() {
        System.out.println("leave structure is as follows:");
        System.out.println("All days declared as national holidays are hollidays");
        System.out.println("All Saturday and Sunday are hollidays");
        System.out.println("Semester and mid-semester leave will be provided");
        System.out.println("You can take 13 CL's");
        System.out.println("You can take 5 OL's");
        System.out.println("You can take 2 medical leaves");
    }
}
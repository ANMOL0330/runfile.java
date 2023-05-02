public abstract class Person {
    String name;
    int age;
    String gender;
    String DOB;
    int id;
    String Category;
    String Address;
    String Blood_Group;

    //CONSTRUCTOR FOR INITIALIZING THE VARIABLES IN PERSON CLASS//
    public Person(String name,int age,String gender,String DOB,int id,String Category,String Address,String Blood_Group){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.DOB=DOB;
        this.id=id;
        this.Category=Category;
        this.Address=Address;
        this.Blood_Group=Blood_Group;
    }
}
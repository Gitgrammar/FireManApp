/**
 * Human
 */
public class Human {
    String name;
    int age;
    Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    void showInfo(){
        System.out.println(this.name+this.age);

    }
    
}
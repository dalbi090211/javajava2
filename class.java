class Employee{
        
    private String name;
    private int age, salary; 
    private char team, gender;
    
    public Employee(String name, int age, int salary, char team, char gender){ //생성자
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.team = team;
        this.gender = gender;
    }
    
    public Employee(){ //생성자
        this("홍길동", 20, 20000, 'q', 'm');
    }
    
    public void print_information(){
        System.out.println("[ 이름 : " + name + ", 나이 :" + age + ", 월급 :" + salary + ", 팀 :" + team + ", 성 :" + gender + " ]");
    }
    
    public char get_gender(Employee person){
        return person.gender;
    }
    
    
}

public class Main
{
public static void main(String[] args) {
    Employee[] employ = new Employee[10];
    employ[0] = new Employee("카리나", 20, 50000, 'a', 'w');
    employ[1] = new Employee("아이유", 30, 100000, 'b', 'w');
    employ[2] = new Employee("윈터", 20, 50000, 'a', 'w');
    employ[3] = new Employee("김병찬", 22, 4000, 's', 'm');
    employ[4] = new Employee("이건희", 22, 3000, 's', 'm');
    employ[5] = new Employee();
    for(int i =0; i < employ.length ; i++){
        employ[i].print_information();
    }
    
}
}
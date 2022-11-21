public class Corporation
{
	public static void main(String[] args) {
        int a, b, c;
		Employee[] employ = new Employee[10];
		employ[0] = new Employee("카리나", 20, 50000, 'a', 'w');
		employ[1] = new Employee("아이유", 30, 100000, 'b', 'w');
		employ[2] = new Employee("윈터", 20, 50000, 'a', 'w');
		employ[3] = new Employee("김병찬", 22, 4000, 'b', 'm');
		employ[4] = new Employee("이건희", 22, 3000, 'b', 'm');
        employ[5] = new Employee("황준현", 23, 60000, 'b', 'm');
		employ[6] = new Employee("이정현", 33, 50000, 'b', 'm');
		employ[7] = new Employee("이동민", 23, 40000, 'a', 'm');
		employ[8] = new Employee("정재형", 23, 30000, 'a', 'm');
		employ[9] = new Employee();
    
        //1. 객체의 멤버들의 값을 출력  
        employ[0].print_information(); 

        //2. 객체 배열안에 있는 멤버들의 값을 출력
		for(int i =0; i < employ.length ; i++){
		    employ[i].print_information();
		}
		
        //3. 메소드를 5개 이상 작성, 결과를 출력

        //남자의 수, 여자의 수를 출력
        a = 0;
        b = 0;
        for(int i =0; i < employ.length ; i++){
		    if(employ[i].return_gender() == 'm'){
                a++;
            }
            else if(employ[i].return_gender() == 'w'){
                b++;
            }
		}
        System.out.println("[ 남자 : " + a + "명, 여자 : " + b + "명 ]");

        //연봉의 평균을 출력
        a = 0;
        for(int i =0; i < employ.length ; i++){
		    a += employ[i].return_salary();
		}
        System.out.println("[ 연봉의 평균 : " + a/employ.length + "원 ]");

        //팀의 평균 연봉을 출력
        a = 0;
        b = 0;
        c = 0;
        for(int i =0; i < employ.length ; i++){
		    if(employ[i].return_team() == 'a'){
                a += employ[i].return_salary();
                c++;
            }
            else if(employ[i].return_team() == 'b'){
                b += employ[i].return_salary();
            }
		}
        System.out.println("[ a팀 : " + a/c + "원, b팀 : " + b/(employ.length-c) + "원 ]");

        //특정연봉 이상의 나이의 평균을 출력
        a = 0;
        b = 0;
        for(int i =0; i < employ.length ; i++){
		    if(employ[i].return_salary() >= 30000){
                a += employ[i].return_age();
                b++;
            }
		}
        System.out.println("[ 연봉을 30000원 이상 받는 인원의 평균 나이 : " + a/b + "세 ]");

        //이름이 김으로 시작하는 사람의 갯수를 출력
        a = 0;
        for(int i =0; i < employ.length ; i++){
		    if(employ[i].return_name().substring(0,1) == "김"){
                a++;
            }
		}
        System.out.println("[ 김씨의 수 : " + a + "명 ]");
	}
}

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
        this("홍길동", 20, 20000, 'a', 'm');
    }
    
    public void print_information(){
        System.out.println("[ 이름 : " + name + ", 나이 :" + age + ", 월급 :" + salary + ", 팀 :" + team + ", 성 :" + gender + " ]");
    }
    public int return_age(){
        return age;
    }
    public int return_salary(){
        return salary;
    }
    public char return_team(){
        return team;
    }
    public char return_gender() 
    {
        return gender;
    }
    public String return_name(){
        return name;
    }
}

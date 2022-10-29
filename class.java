public class class {
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    public static class Solider{
        String gender, address, name;
        int height, weight, grade, age; 
        
        //생성자 함수
        Solider(String name, int age, String gender, int height, int weight, int grade, String address){      //생성자 함수
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
            this.grade = grade;
            this.address = address;
        }

    }


    public static void main(String args[]){
        Solider[] soliders;
        soliders = new Solider[5];
        soliders[0] = new Solider("이재혁", 22, "남", 170, 55, 1, "서울특별시");
        soliders[1] = new Solider("김남운", 21, "남", 150, 75, 3, "인천광역시");
        soliders[2] = new Solider("유지민", 22, "여", 167, 55, 4, "고양시");
        soliders[3] = new Solider("임석희", 22, "여", 180, 65, 4, "춘천시");
        soliders[4] = new Solider("유영인", 23, "남", 173, 76, 2, "부산광역시");
        for(int i = 0 ; i < 5; i ++){
            for(int j : soliders[i]){
                
            }
        }
    }
}
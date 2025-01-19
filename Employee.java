public class Employee {
    String name;
    int salary;

    public String getName(){
        return name;
    }
    public void getName(String name){
        this.name=name;

    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

        // ※修正※引数付きコンストラクタを追加
        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    

}

public class Main {
    public static void main(String[] args) {
        // 従業員の作成
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("山田", 200000);
        employees[1] = new Employee("海田", 220000);
        employees[2] = new Employee("川田", 240000);

        // 材料の作成
        Material[] materials = new Material[4];
        materials[0] = new Material("金", 10000);
        materials[1] = new Material("銀", 5000);
        materials[2] = new Material("銅", 1000);
        materials[3] = new Material("木", 500);

        // 工場の作成
        MedalFActory factory = new MedalFActory(employees);

        // メダル作成
        Medal[] medals = factory.makeMedal(materials);

        // メダルの情報表示
        for (Medal medal : medals) {
            System.out.printf("製品名："+medal.getName()+"/価格："+ medal.getPrice());
        }
        System.out.println();
    }
}
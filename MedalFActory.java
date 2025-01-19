public class MedalFActory {
    private Employee[] employees;

    // コンストラクタ（従業員の数を指定）
    public MedalFActory(Employee[] employees) {
        this.employees = employees;
    }

    public Medal[] makeMedal(Material[] materials) {
        Medal[] medals = new Medal[materials.length];

        // 従業員の平均給料を計算
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = (double) totalSalary / employees.length;

        // メダルを作成
        for (int i = 0; i < materials.length; i++) {
            switch (materials[i].getName()) {
                case "金":
                    medals[i] = new Medal("金メダル", (int) (materials[i].getCost()  + averageSalary * 1.2));
                    break;
                case "銀":
                    medals[i] = new Medal("銀メダル", (int) (materials[i].getCost()  + averageSalary * 1.2));
                    break;
                case "銅":
                    medals[i] = new Medal("銅メダル", (int) (materials[i].getCost()  + averageSalary * 1.2));
                    break;
                case "木":
                    medals[i] = new Medal("不良品", 0);
                    break;
                default:
                    System.out.println("未対応の材料です: " + materials[i].getName());
                    break;
            }
        }
        return medals;
    }
}
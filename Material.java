public class Material {
    private String name;
    private int cost;

    // 引数付きコンストラクタを追加
    public Material(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    private double unitPrice; // 単価
    private double quantity; // 数量

    // コンストラクタ
    public Material(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // 材料のコストを計算するメソッド
    public double calculateCost() {
        return unitPrice * quantity;
    }
}


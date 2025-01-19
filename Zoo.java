public class Zoo {
    public static void main(String[] args) {
        // Animal型の配列を5つ要素で作成
        Animal[] animals = new Animal[5];

        // 各動物のオブジェクトを作成し、配列に格納
        animals[0] = new Sheep();
        animals[1] = new Horse();
        animals[2] = new Goat();
        animals[3] = new Monkey();
        animals[4] = new Bear();

        // 拡張for文で各動物のcry()メソッドを呼び出す
        for (Animal animal : animals) {
            animal.cry();
        }
    }
}
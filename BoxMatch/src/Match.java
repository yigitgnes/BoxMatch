public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            if (startPunch()) {
                while (true) {
                    System.out.println("=====YENİ ROUND=====");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(f1.name + " Sağlık: " + f1.health);
                    System.out.println(f2.name + " Sağlık: " + f2.health);
                }
            } else {
                while (true) {
                    System.out.println("=====YENİ ROUND=====");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(f1.name + " Sağlık: " + f1.health);
                    System.out.println(f2.name + " Sağlık: " + f2.health);
                }
            }
        } else {
            System.out.println("Sporcuların Sikletleri Uygun Değil");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        }
        return false;
    }

    boolean startPunch() {
        double randomValue2 = Math.random() * 100;
        return randomValue2 >= 50;
    }
}

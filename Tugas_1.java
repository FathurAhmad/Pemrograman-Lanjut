import java.math.*;

class bangunDatar {
    int sisi;
    int jari_jari;
    double luas;
    double keliling;
    double diagonal;

    bangunDatar (int sisi) {
        this.sisi = sisi;
        this.jari_jari = sisi;
    }
}

class segiempat extends bangunDatar {
    segiempat (int sisi) {
        super(sisi);
    }

    void luas () {
        this.luas = this.sisi * this.sisi;
        System.out.println("Luas : " + this.luas);
    }

    void keliling () {
        this.keliling = this.sisi * 4;
        System.out.println("Keliling : " + this.keliling);
    }

    void diagonal () {
        this.diagonal = (this.sisi * this.sisi) + (this.sisi * this.sisi);
        System.out.println("Diagonal : " + Math.sqrt(this.diagonal));
    }
}

class lingkaran extends bangunDatar {
    lingkaran (int jari_jari) {
        super(jari_jari);
    }

    void luas () {
        this.luas = Math.PI * this.jari_jari * this.jari_jari;
        System.out.println("Luas : " + this.luas);
    }

    void keliling () {
        this.keliling = Math.PI * (this.jari_jari * 2);
        System.out.println("Keliling : " + this.keliling);
    }
}

class Tugas_1 {
    public static void main(String[] args) {
        segiempat ca = new segiempat(12);
        ca.luas();
        ca.keliling();
        ca.diagonal();

        lingkaran li = new lingkaran(10);
        // li.keliling();
        // li.luas();

        lingkaran sea = new lingkaran(23);
        sea.keliling();
        sea.luas();
    }
}
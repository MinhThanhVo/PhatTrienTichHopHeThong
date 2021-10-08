public class Diem {
    int x;
    int y;

    public Diem() {

    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void inToaDo() {
        System.out.println("(" + x + ',' + y + ")");
    }

    public double khoangCach(int x, int y) {
        return Math.sqrt((x*x) + (y*y));
    }

    public static void main(String[] args) {
        Diem diemA = new Diem();
        diemA.nhapToaDo(4, 5);
        diemA.inToaDo();
        diemA.khoangCach(4, 5);
    }
}

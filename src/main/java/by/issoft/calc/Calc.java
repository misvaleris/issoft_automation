package by.issoft.calc;

public class Calc {
    public void sum(int x1, int x2) {
        Summir summir = new Summir();
        int x1x2sum = summir.summir(x1, x2);
        System.out.println(x1x2sum);
    }

    public void min(int x1, int x2) {
        Minus minus = new Minus();
        int x1x2min = minus.minus(x1, x2);
        System.out.println(x1x2min);
    }

    public void del(int x1, int x2) {
        Delenie delenie = new Delenie();
        int x1x2del = delenie.delenie(x1, x2);
        System.out.println(x1x2del);
    }

    public void umn(int x1, int x2) {
        Umnozh umnozh = new Umnozh();
        int x1x2umn = umnozh.umnozh(x1, x2);
        System.out.println(x1x2umn);
    }
}

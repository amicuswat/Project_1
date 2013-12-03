
public class KNGame {
    public static void main(String[] args){
        int figure = 1;
        int [][] krenol = {{1, 0, 1},{0, 1, 0},{1, 2, 0}};
        CheckWin buble=new CheckWin();
        boolean x = buble.gain(krenol, figure);
        System.out.print(x);
    }

}

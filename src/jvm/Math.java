package jvm;

/**
 * @auther ZhangXiusen
 * @date 2020/10/17 21:59
 */
public class Math {

    public static final int initData = 666;
    //public static User user = new User();

    public int compute() {
        int a = 1;
        int b = 2;
        int c = (a+b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();

        System.out.println("test");
    }

}

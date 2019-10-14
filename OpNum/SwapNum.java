package OpNum;

public class SwapNum
{
    public static void main(String[] args) {

        int num=17;
        opposite(num);

    }

    public static int opposite(int number)
    {
        number*=-1;
        System.out.println(number);
        return number;
    }
}

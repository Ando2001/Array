public class Problem1 {
    public static void main(String[] args) {
        int[] arrFib = new int[10];
        arrFib[0]=0;
        arrFib[1]=1;
        for (int i = 2; i < arrFib.length; i++)
        {
            arrFib[i]=arrFib[i-1]+arrFib[i-2];
        }
        for (int i = arrFib.length-1; i >=0; i--)
        {
            System.out.print(arrFib[i]+  " ");
        }


    }
}

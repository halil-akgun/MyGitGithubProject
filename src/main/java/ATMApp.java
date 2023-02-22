public class ATMApp {
    public static void main(String[] args) {
        System.out.println("deneme");
        System.out.println("deneme2");
        System.out.println("deneme3");
        System.out.println("deneme4");


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        boolean isContinue = true;
        int sum = 0;
        int loop = 1;
        int idx = 0;
        while (isContinue) {
            for (int i = 0; i < loop; i++) {
                if (idx == arr.length - 1) {
                    isContinue = false;
                    break;
                }
                sum += arr[idx];
                idx++;
            }
            System.out.println(sum);
            sum = 0;
            loop++;
        }
    }
}

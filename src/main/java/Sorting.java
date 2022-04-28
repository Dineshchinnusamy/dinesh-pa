public class Sorting {
    int[] array = {4, 3, 5, 6, 1, 2};
    int[] temp = new int[array.length];

    public static void main(String[] args) {
        Sorting s = new Sorting();
        s.method();
    }

    void method() {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                int temp=0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    break;
                }
            }

        }
        for(int n : array){
            System.out.println(n);
        }
    }
}

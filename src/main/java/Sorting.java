public class Sorting {
    int[] array = {4, 3, 5, 6, 1, 2};
    boolean flag = false;

    public static void main(String[] args) {
        Sorting s = new Sorting();
        s.method(s.array, s.flag);
    }

    void method(int[] getArray, boolean flag) {
        for (int i = 0; i <= getArray.length - 1; i++) {
            for (int j = i + 1; j <= getArray.length - 1; j++) {
                int temp = 0;
                if (getArray[i] > getArray[j]) {
                    temp = getArray[i];
                    getArray[i] = getArray[j];
                    getArray[j] = temp;
                }
            }
        }
        if (flag) {
            for (int n : getArray) {
                System.out.println(n);
            }
        } else {
            for (int reverse = getArray.length-1; reverse >= 0; reverse--) {
                System.out.println(getArray[reverse]);
            }
        }
    }
}

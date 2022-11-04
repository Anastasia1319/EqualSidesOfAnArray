public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,4,3,2,1};
        int[] array2 = new int[] {1,100,50,-51,1,1};
        int[] array3 = new int[] {1,2,3,4,5,6};
        int[] array4 = new int[] {20,10,30,10,10,15,35};
        int[] array5 = new int[] {-8505, -5130, 1926, -9026};
        int[] array6 = new int[] {2824, 1774, -1490, -9084, -9696, 23094};
        int[] array7 = new int[] {3, 2, -1, 4, -6, -2, 1};
        int[] array8 = new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};

        System.out.println(Test.test1(EqualSides.findEvenIndex(array1), 3));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array2), 1));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array3), -1));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array4), 3));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array5), -1));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array6), 1));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array7), 6));
        System.out.println(Test.test1(EqualSides.findEvenIndex(array8), 6));
    }
}
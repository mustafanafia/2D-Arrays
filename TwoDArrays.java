public class TwoDArrays {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 6},
                {88, 4545},
                {757, 232}
        };


        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 2; column++) {

                System.out.println(arr[row][column]);
            }
        }
    }
}


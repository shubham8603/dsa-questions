public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        
        // Shuffle the array
        shuffleArray(originalArray);

        // Printing
        System.out.print("shuffledArray={");
        for (int value : originalArray) {
            System.out.print(value+",");
        }
        System.out.print("}");
    }

    // shuffling
    public static void shuffleArray(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i 
            int randomIndex = (int) (Math.random() * (i + 1));

            // Swap the elements btwn randomIndex and i
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

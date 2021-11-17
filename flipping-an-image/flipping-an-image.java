class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            image[i] = flip(image[i]);
            for(int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return image;
    }
    public static int[] flip(int[] arr) {
        int slow = 0;
        int fast = arr.length - 1;
        while(slow < fast) {
            int holder = arr[slow];
            arr[slow] = arr[fast];
            arr[fast] = holder;
            slow++;
            fast--;
        }
        return arr;
    }
}
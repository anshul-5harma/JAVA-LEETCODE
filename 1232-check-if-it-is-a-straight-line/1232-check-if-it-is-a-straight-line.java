class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 2; i < coordinates.length; i++){
            if (!isStraightLine(coordinates[i],coordinates[0],coordinates[1]))  return false;
        }
        return true;
    }
    
    public boolean isStraightLine(int[]p1,int[]p2,int[]p3) {
        int x = p1[0];
        int y = p1[1];
        int x1 = p2[0];
        int y1 = p2[1];
        int x2 = p3[0];
        int y2 = p3[1];
        return ((y-y1)*(x2-x1)) ==  ((x-x1)*(y2-y1));
    }
}
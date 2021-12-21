class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        for(int i = left; i <= right; i++) {
            if(compute(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    public static boolean compute(int number) {
        if(number % 10 == 0) {
            return false;
        } else {
            int to_divide = number;
        while(to_divide > 0) {
            int remainder = to_divide % 10;
            if(remainder == 0) {
                return false;
            }
            if(number % remainder != 0) {
                return false;
            }
            to_divide /= 10;
        }   
        }
        return true;
    }
}
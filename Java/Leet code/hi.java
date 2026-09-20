class hi {
    public int twoSum(int[] numbers, int target) {
        numbers = {1 , 4 ,5 ,6 , 8 ,23};
        target = 9;

        int start =0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(numbers[start] + numbers[mid] == target){
                return start;
            }
            else{
                start += 1;
            }

        }
        return -1;

    }
}
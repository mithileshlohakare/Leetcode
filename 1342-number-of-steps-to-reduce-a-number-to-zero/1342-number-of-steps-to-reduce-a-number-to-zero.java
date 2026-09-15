class Solution {
    int count = 0;

    public int numberOfSteps(int num) {
        nums(num);
        return count;
    }

    int nums(int num) {
        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {
            count++;
            return nums(num / 2);
        }

        if (num % 2 != 0) {
            count++;
            return nums(num - 1);
        }

        return count;
    }
}
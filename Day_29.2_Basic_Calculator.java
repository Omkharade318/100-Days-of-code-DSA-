class Solution {
    private int INDEX;

    public int calculate(String s) {
        INDEX = 0;
        return calc(s.toCharArray());
    }

    private int calc(char[] sarray) {
        int sum = 0;
        int nextSign = 1;
        while (INDEX < sarray.length) {
            switch (sarray[INDEX]) {
                case ' ' -> { }
                case '+' -> nextSign = 1;
                case '-' -> nextSign = -1;
                case '(' -> {
                    INDEX++;
                    sum += (nextSign * calc(sarray));
                }
                case ')' -> { return sum; }
                default  -> {
                    int number = sarray[INDEX] - '0';
                    while (INDEX + 1 < sarray.length && sarray[INDEX+1] >= '0') {
                        INDEX++;
                        number = number * 10 + (sarray[INDEX] - '0');
                    }
                    sum += (nextSign * number);
                }
            }
            INDEX++;
        }
        return sum;
    }
}

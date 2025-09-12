class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] stack = new int[n];
        int top = 0;
        for (String op : operations) {
            switch (op) {
                case "+":
                    stack[top] = stack[top - 1] + stack[top - 2];
                    top++;
                    break;
                case "D":
                    stack[top] = 2 * stack[top - 1];
                    top++;
                    break;
                case "C":
                    top--;
                    break;
                default:
                    stack[top] = Integer.parseInt(op);
                    top++;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < top; i++) sum += stack[i];
        return sum;
    }
}
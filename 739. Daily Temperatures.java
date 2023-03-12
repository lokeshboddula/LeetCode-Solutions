class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] answer = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = temp.length - 1; i >= 0; i--) {
            while(!st.empty() && temp[st.peek()] <= temp[i])
                st.pop();
            if(st.isEmpty()) answer[i] = 0;
            else answer[i] = st.peek() - i;
            st.push(i);
        }
        return answer;
    }
}
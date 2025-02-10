class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char r : s.toCharArray())   {
            st.push(r);
            if(Character.isDigit(r)){
                st.pop();
                if(!st.isEmpty())
                    st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
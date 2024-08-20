class Solution {
    public int totalFruit(int[] fruits) {
        int max =0,left = 0;
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int right = 0;right<fruits.length; right++){
            mp.put(fruits[right], mp.getOrDefault(fruits[right],0) + 1);

            if(mp.size() <= 2)
                max = Math.max(max,right - left + 1);
            
            while(mp.size() > 2){
                mp.put(fruits[left], mp.getOrDefault(fruits[left],0) - 1);
                
                if(mp.get(fruits[left]) == 0)
                    mp.remove(fruits[left]);
                left++;
            }

        }
        return max;
    }
}
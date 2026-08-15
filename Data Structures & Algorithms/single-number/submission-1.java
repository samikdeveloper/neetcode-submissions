class Solution {
    public int singleNumber(int[] nums) {
      /*  HashMap<Integer,Integer> count=new HashMap<>();
        int single=0;
        for(int i:nums)
        {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
    if (entry.getValue() == 1) {
        single = entry.getKey(); 
    }
}*/
     int xor=0;
      for(int i:nums)
      {
        xor=i^xor;
      }
        return xor;
    }
}

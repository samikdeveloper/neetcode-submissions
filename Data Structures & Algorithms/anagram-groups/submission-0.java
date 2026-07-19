class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();

        for(String s:strs)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>(Arrays.asList(s)));

            }else{
                map.get(key).add(s);
            }
        }
       

        map.forEach((k,v)->{
                    //System.out.println("key "+k+" value "+v );
                  output.add(v);
                }
                );

       return output;
    }
}

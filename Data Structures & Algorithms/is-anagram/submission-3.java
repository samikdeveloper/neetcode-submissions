class Solution {
    public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> s_map=new HashMap<>();
            HashMap<Character,Integer> t_map=new HashMap<>();
            Boolean flag=true;

            if(s.length()!=t.length())
            return false;

            for(int i=0;i<s.length();i++)
            {
                s_map.put(s.charAt(i),s_map.getOrDefault(s.charAt(i),0)+1);                
            }

            for(int j=0;j<t.length();j++)
            {
                t_map.put(t.charAt(j),t_map.getOrDefault(t.charAt(j),0)+1);                
            }

            for(Map.Entry<Character,Integer> entry:s_map.entrySet())
            {
                Character c=entry.getKey();
                if(!(entry.getValue().equals(t_map.get(c))))
                {   
                    flag=false;
                    break;
                }
                
            }
            return flag;
    }
}

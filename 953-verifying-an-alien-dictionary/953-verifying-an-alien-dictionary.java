class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> ordermap = new HashMap();
        for(int i= 0; i< order.length(); i++) {
            ordermap.put(Character.valueOf(order.charAt(i)), i);
        }
        
        for (int i = 0; i< words.length - 1; i++) {
            String one = words[i];
            String two = words[i+1];
            
            if(one.equals(two)) {
                continue;
            }
            
            int j =0; 
            
          
            int l = Math.min(one.length() ,two.length() );
            while(j< l) {
                Character o = Character.valueOf(one.charAt(j));
                Character t = Character.valueOf(two.charAt(j));
                if(o!=t ){
                            if(  ordermap.get(o) > ordermap.get(t) ) {
                
                    return false;
                } else {
                             break;   
                            }
              
            }
        
                j++;
        }
                    
                if(j == l) {
                      if(one.length() > two.length()) {
                return false;
            }
                }
        }
        
        return true;
    }
}
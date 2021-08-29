class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
            int count = 0;
            int n1 = a.size();
            int start = n1-1;
            int n2 = b.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=a.get(start); i<=b.get(0); i++){
                
                boolean check =true;
                for(int j=0; j<n1; j++){
                    if(i%a.get(j)!=0){
                        check = false;
                        break;
                    }        
                }
                if(check){
                    list.add(i);
                }
            }
            
            for(int i=0; i<list.size(); i++){
                
                boolean check = true;
                for(int j=0; j<n2; j++){
                    
                    if(b.get(j)%list.get(i) != 0){
                        check = false;
                        break;
                    }
                }
                if(check){
                    count++;
                }
            }
           return count; 
    }

}

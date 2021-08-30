class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
            Collections.sort(ar);
            int count = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(ar.get(0));
            for(int i=0; i<n; i++){
                if(ar.get(i) != stack.peek()){
                    stack.push(ar.get(i));
                }
            }
            
            while(!stack.empty()){
                int sum = 0;
                for(int j=0; j<ar.size(); j++){
                    if(stack.peek()==ar.get(j)){
                        sum += 1;
                    }
                }
                stack.pop();
                if(sum > 1){
                    count += sum/2;
                }
            } 
            return count;
        }
    }

class Result {

    public static int countingValleys(int steps, String path) {
                int lvl = 0;
                int count = 0;
                for(int i=0; i<steps; i++){
                    if(path.charAt(i)=='U'){
                        lvl++;
                    }
                    else{
                        lvl--;                        
                    }
                    if(lvl==0 && path.charAt(i)=='U'){
                        count++;
                    }    
                }
                return count;
    }
}

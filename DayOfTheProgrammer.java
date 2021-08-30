class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        String res = "";
        int days = 0;
        boolean flag = false;
        
        if(year == 1918){
           res = ("26.09.1918");
           return res;
        }
        else if(year<1918){
            if(year%4 == 0){
                flag = true;
            }
        }
        else if((year%400 == 0) || (year%4==0 && year%100 != 0)){
            flag  = true;
        }
        else{
            flag = false;
        }    
        if(flag)
            days = 244;
        else
            days = 243;
            
        int diff = 256-days;
        
        res = res.concat(Integer.toString(diff) + ".09." + Integer.toString(year));
        return res;
    }   
}

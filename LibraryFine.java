public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;  
        if(d1 > d2 && m1 == m2 && y1 == y2){
            fine = Math.abs(d2-d1)*15;
        }
        else if(m1 > m2 && y1 == y2){
            fine = Math.abs(m2-m1) * 500;
        }
        else if(y1 > y2){
            fine = 10000;
        }
        return fine;
    }

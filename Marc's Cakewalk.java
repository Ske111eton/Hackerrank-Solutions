public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie,Collections.reverseOrder());
        long walk = 0;
        for(int i=0; i<calorie.size(); i++){
            walk += Math.pow(2,i) * calorie.get(i);
        }
    
    return walk;
    }

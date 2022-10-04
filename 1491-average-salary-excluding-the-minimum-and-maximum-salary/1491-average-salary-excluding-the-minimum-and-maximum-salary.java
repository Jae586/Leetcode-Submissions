class Solution {
    public double average(int[] salary) {
        double min = 100000;
        double max = -10000;
        double sum =0;
        for (int i=0; i<salary.length; i++){
            if (min > salary[i]) min =salary[i];
            if (max < salary[i]) max = salary[i];
            sum+=salary[i];
        }
        return (sum -max -min)/(salary.length-2);
    
}
}
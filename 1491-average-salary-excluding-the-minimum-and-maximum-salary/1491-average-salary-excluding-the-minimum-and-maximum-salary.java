class Solution {
    public double average(int[] salary) {
   double min = 1000000;
        double max = -100000;
        double avg =0;
        for (int i=0; i<salary.length; i++){
            if (salary[i] <min) min = salary[i];
            if (salary[i]>max) max = salary[i];
            avg+=salary[i];
        }
        avg = avg -min-max;
        return (avg)/(salary.length-2);
    }
}
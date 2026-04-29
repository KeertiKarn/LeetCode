class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int count=0;
        for(int i=0;i<energy.length;i++){
            int e= energy[i];
            int ex= experience[i];
            if(initialEnergy<=e) {
                int extra= e+1-initialEnergy;
                count+=extra;
                initialEnergy=e+1;
            }
            if(initialExperience<=ex){
               int extra= ex+1-initialExperience;
               count+=extra; 
               initialExperience=ex+1;
            }
            initialEnergy-=e;
            initialExperience+=ex;
        }
        return count;
    }
}
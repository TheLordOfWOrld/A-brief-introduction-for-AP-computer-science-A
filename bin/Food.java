public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        //Create Food Constructor
        public Food(String name, int calories){
                this.name = name;
                this.calories = calories;
        }
        
        //Add getter and setter methods for calories
        String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        int getCalories() {
                return calories;
        }

        public void setCalories(int calories) {
                this.calories = calories;
        }
        
        
        @Override
       public String toString() {
           return "Food{" +
                   "name='" + name + '\'' +
                   ", calories=" + calories +"}";}
}

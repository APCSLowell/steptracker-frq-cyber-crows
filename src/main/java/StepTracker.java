import java.util.ArrayList;
public class StepTracker
{
private int total, days, count, G; 
public StepTracker(int goal){
 G=goal; 
 total=0; 
 days=0; 
 count=0; 
}
 public void addDailySteps(int steps){
 total+=steps;  
 if(steps>=G)
   count++;
 days++; 
 }
 public int activeDays(){
  return days; 
 }
 public double AverageSteps(){
  return (double)total/days; 
 }
} 

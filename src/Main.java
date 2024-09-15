//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     String [][] interests = {{"Coding", "Music", "Hanging out"},
                                {"Friends", "Relaxing", "Family"},
                            {"Travelling", "Resting", "Spotting"}};
     //Rows - first then Columns
     for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
             System.out.println(interests[i][j]);
         }
     }
    }
}
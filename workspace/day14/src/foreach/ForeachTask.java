package foreach;

public class ForeachTask {
   public static void main(String[] args) {
      
//      실습
//      두 학생의 점수가 배열에 담겨있다.
//      각 학생의 총점과 평균을 출력하세요.
      int[][] scores = {{100, 80, 65}, {40, 77, 30}};
      int num = 0;
      
      for (int[] is : scores) {
         // 큰 반복이 돌 때 마다 0으로 만들어줘야한다.
         int total = 0;
         double avg = 0.0;
         for (int score : is) {
            total += score;
         }
         
         avg = total / (double)is.length;
         avg = Double.parseDouble(String.format("%.2f", avg));
         
         System.out.println(++num + "번 학생");
         System.out.println("총점 : " + total);
         System.out.println("평균 : " + avg);
         System.out.println();
         
      }
      
   }
}










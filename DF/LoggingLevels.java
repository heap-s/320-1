public class LoggingLevels {
   enum LogLevel {
       CRITICAL, HIGH, MEDIUM, LOW
   } 

   public static void main(String[] args) {
       String[] logLevels = { "CRITICAL", "HIGH", "MEDIUM", "LOW" };
       System.out.println(LogLevel.CRITICAL);

       System.out.println(logLevels[0]);
   }
}

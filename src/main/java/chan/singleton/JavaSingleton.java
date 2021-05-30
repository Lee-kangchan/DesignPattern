package chan.singleton;

public class JavaSingleton {
        private static JavaSingleton instance;

        public static JavaSingleton singleton = new JavaSingleton();
        public static int count = 0 ;
        // 생성자
        private JavaSingleton(){}

        // thread safety getter
        public static synchronized JavaSingleton getInstance(){
            if(instance == null){
                instance = new JavaSingleton();
            }
            return instance;
        }
        public synchronized static void print(String input){
            count++;
            System.out.println(input + " count - " + count);
        }
}

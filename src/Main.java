public class Main {
    public static void main(String[] args) {
        String messages =
                "Welcome to CSTAD!\n"+
                "********************************************************\n"+
                "Don't give up this opportunity, do your best first\n"+
                "---------------------------------------------------------\n"+
                "Downloading...............completed 100%\n";

        try {
            for (int i = 0; i < messages.length(); i++) {
                try {
                    System.out.print(messages.charAt(i));
                    Thread.sleep(100); // Adjust delay as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

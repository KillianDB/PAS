public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello!");
        String version = System.getProperty("java.version");
        System.out.println("Running Java Version "+version+"\n");
        String home = System.getProperty("java.home");
        System.out.println("Java Home director "+home+"\n");
        String os = System.getProperty("os.name");
        System.out.println("OS "+os+"\n");
        String os_version = System.getProperty("os.version");
        System.out.println("OS version "+os_version+"\n");
    }
}
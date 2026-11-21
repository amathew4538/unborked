public class CInterop {
    // A native implementation would export this JNI signature.
    private native int parseNativePort(String text);

    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : "8080";
        try {
            int port = Integer.parseInt(text);
            System.out.printf("CInterop JNI-signature text=%s port=%d valid=%s%n", text, port, port >= 1 && port <= 65535 ? "true" : "false");
        } catch (NumberFormatException error) {
            System.out.printf("CInterop JNI-signature text=%s valid=false%n", text);
        }
    }
}

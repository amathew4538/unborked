import java.lang.reflect.Method;

public class JvmReflection {
    static class Report {
        public String render() {
            return "csv_rows=128";
        }
    }

    public static void main(String[] args) throws Exception {
        Method m = Report.class.getMethod("render");
        System.out.println(m.invoke(new Report()));
    }
}

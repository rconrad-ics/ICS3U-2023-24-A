import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("name", "ross");
        obj.put("birth","today");

        
        System.out.print(obj);
    }
}

import java.util.HashMap;
import java.util.Map;
public class CustomerManager {
    private Map<String, Customer> customers = new HashMap<>();
    private Map<String, String> phoneCheck = new HashMap<>();
    public boolean register(Customer c) {
        if (customers.containsKey(c.getId()) ||
                phoneCheck.containsKey(c.getPhone())) {
            return false;
        }
        customers.put(c.getId(), c);
        phoneCheck.put(c.getPhone(), c.getId());
        return true;
    }
    public Customer findById(String id) {
        return customers.get(id);
    }
}
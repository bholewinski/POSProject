package posproject;

/**
 * @author Ben Holewinski
 */
public class Customer {
    private String custId;
    private String name;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

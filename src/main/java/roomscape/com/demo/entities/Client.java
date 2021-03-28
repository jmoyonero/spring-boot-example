package roomscape.com.demo.entities;

import lombok.Data;

@Data
public class Client {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
}

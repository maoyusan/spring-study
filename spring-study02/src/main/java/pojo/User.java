package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * userBean
 */
@Data
@Component
public class User {
    @Value("admin")
    private String name;
}


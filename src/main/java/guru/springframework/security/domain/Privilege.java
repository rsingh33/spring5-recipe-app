package guru.springframework.security;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;
}

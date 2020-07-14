package guru.springframework.security;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "roles_privileges",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "privelege_id", referencedColumnName = "id"))
    private Collection<Privilege> privileges;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;


}

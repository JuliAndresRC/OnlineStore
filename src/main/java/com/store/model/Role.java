package com.store.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Table(name = "user_role")
@Entity
public class Role {

    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID roleId;

    @Column(name = "role_name")
    private String name;

    private String description;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_permission",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> rolePermissions;
}

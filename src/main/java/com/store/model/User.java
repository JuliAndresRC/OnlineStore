package com.store.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.UUID;

@Data
@Table(name = "`user`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class    User {

    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(name = "user_id")
    private UUID id;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }

}

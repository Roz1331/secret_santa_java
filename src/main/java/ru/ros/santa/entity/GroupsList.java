package ru.ros.santa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "groups_list")
public class GroupsList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String unique_name;

    @ManyToOne
    @JoinColumn(name = "admin_login")
    private User user;

    @OneToMany(mappedBy = "groupsList", orphanRemoval = true)
    private Set<Group> groups = new LinkedHashSet<>();

}

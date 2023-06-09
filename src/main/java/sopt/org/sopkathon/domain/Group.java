package sopt.org.sopkathon.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "\"group\"")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int min;

    @Column(nullable = false)
    private int max;

    @Column
    private String penalty;

    @OneToMany(mappedBy = "group")
    private List<User> userList = new ArrayList<>();
}

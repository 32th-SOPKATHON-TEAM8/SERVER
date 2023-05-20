package sopt.org.sopkathon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.exception.model.BadRequestException;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int life;

    @Column(nullable = false)
    private boolean isHost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    public void reported() {
        if (this.life == 0) {
            throw new BadRequestException(Error.USER_LIFE_ALREADY_ZERO,
                Error.USER_LIFE_ALREADY_ZERO.getMessage());
        }
        this.life = this.life - 1;
    }
}

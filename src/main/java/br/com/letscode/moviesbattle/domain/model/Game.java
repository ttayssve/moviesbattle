package br.com.letscode.moviesbattle.domain.model;

import br.com.letscode.moviesbattle.domain.model.enums.GameStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_GAMES")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAME_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(columnDefinition = "int default 0")
    private int totalErrors;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private GameStatusEnum status;

    @OneToMany(mappedBy = "game", fetch = FetchType.EAGER)
    private List<Round> rounds;
}

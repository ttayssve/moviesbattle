package br.com.letscode.moviesbattle.domain.service;

import br.com.letscode.moviesbattle.domain.model.Game;
import br.com.letscode.moviesbattle.domain.model.Round;

public interface GameUpdateService {

    Game updateGameWithRoundResult(Round roundEntity);
}

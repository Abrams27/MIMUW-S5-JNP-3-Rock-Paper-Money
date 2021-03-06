package pl.uw.mim.jnp.rock.paper.money.api.models;

import lombok.Data;

@Data
public class GameRegistrationDto {

  private Long gameId;

  private String player1Username;
  private String player2Username;

  private Integer stake;
}

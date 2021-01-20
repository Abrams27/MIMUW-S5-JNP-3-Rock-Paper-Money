package pl.uw.mim.jnp.rock.paper.money.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidGameException extends RuntimeException {

  private static final String MESSAGE = "Player id or game id is invalid";

  public InvalidGameException() {
    super(MESSAGE);
  }
}

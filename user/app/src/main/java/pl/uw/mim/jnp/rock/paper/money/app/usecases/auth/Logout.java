package pl.uw.mim.jnp.rock.paper.money.app.usecases.auth;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.uw.mim.jnp.rock.paper.money.app.services.AuthService;
import pl.uw.mim.jnp.rock.paper.money.app.utils.AuthorizationHeaderParser;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class Logout {

  private final AuthService authService;

  public Mono<Void> execute(String authorizationHeader) {
    return Mono.just(authorizationHeader)
        .map(AuthorizationHeaderParser::getToken)
        .flatMap(authService::logoutUser);
  }
}

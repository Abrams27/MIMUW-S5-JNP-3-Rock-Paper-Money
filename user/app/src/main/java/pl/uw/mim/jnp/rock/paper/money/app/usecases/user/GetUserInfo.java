package pl.uw.mim.jnp.rock.paper.money.app.usecases.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.uw.mim.jnp.rock.paper.money.api.models.user.UserInfoDto;
import pl.uw.mim.jnp.rock.paper.money.app.services.UserInfoService;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class GetUserInfo {

  private final UserInfoService userInfoService;

  public Mono<UserInfoDto> execute(String username) {
    return userInfoService.getUserInfo(username);
  }
}

package pl.uw.mim.jnp.rock.paper.money.persistence.redis.entries;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@Builder
@RedisHash("LastGameIdEntity")
public class LastGameIdEntity {

  private @Id Long id;
  private @Indexed Long gameId;
}

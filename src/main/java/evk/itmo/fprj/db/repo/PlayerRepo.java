package evk.itmo.fprj.db.repo;

import evk.itmo.fprj.db.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository <PlayerEntity, Integer> {
}

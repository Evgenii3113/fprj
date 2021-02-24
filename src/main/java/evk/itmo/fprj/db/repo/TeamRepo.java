package evk.itmo.fprj.db.repo;

import evk.itmo.fprj.db.entity.TeamEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeamRepo extends PagingAndSortingRepository<TeamEntity, Integer> {
}

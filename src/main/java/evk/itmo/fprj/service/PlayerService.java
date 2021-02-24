package evk.itmo.fprj.service;

import evk.itmo.fprj.db.entity.PlayerEntity;
import evk.itmo.fprj.db.repo.PlayerRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class PlayerService {

    private PlayerRepo playerRepo;

    public PlayerService(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }



    @PostConstruct
    public void init(){
        Iterable<PlayerEntity> all = playerRepo.findAll();
        for (PlayerEntity playerEntity : all) {
            System.out.println(playerEntity.toString());


        }
    }
}

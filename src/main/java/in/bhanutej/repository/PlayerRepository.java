package in.bhanutej.repository;

import org.springframework.data.repository.CrudRepository;

import in.bhanutej.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}

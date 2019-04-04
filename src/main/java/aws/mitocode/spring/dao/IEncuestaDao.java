package aws.mitocode.spring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import aws.mitocode.spring.model.Encuesta;

@Repository
public interface IEncuestaDao extends JpaRepository<Encuesta, Integer> {
	
	@Query(value = "select f from Encuesta f",
			countQuery = "select count(f) from Encuesta f")
	Page<Encuesta> obtenerFeedBacks(Pageable pageable);
}

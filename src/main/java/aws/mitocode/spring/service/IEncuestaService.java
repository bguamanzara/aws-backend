package aws.mitocode.spring.service;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;

import aws.mitocode.spring.model.Encuesta;

public interface IEncuestaService {

	Page<Encuesta> obtenerDatosPaginados(Pageable pageable, String usuario, Collection<GrantedAuthority> ltaRoles);
	void guardarDatos(Encuesta feedback);
	void eliminarDatos(int id);
}

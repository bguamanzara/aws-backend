package aws.mitocode.spring.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aws.mitocode.spring.dto.RespuestaApi;

@RestController
@CrossOrigin
@RequestMapping("api/security")
public class ApiSecurityController {

	@PostMapping(value="token", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaApi> verificarToken(){
		return new ResponseEntity<RespuestaApi>(
				new RespuestaApi("OK",SecurityContextHolder.getContext().getAuthentication().getPrincipal()), HttpStatus.OK);
	}
}

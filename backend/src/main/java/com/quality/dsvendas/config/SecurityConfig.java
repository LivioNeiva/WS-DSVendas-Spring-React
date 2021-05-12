package com.quality.dsvendas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/*
codigo da configuração de segurança cors, o codigo a baixo, e um codigo padrão do framework para liberar o cors
 */

//Passo 1: configuração de segurança: tempo video aula 14:09
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Environment env;
	


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		 vai liberar o aplicativo de gerenciamento do banco de dados h2
		 */
		if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
			http.headers().frameOptions().disable();
		}
		
		/*
		no metodo a baixo nos camamos o cors e informamos q a aplicação nao vai manter estado, e sim sera STATELESS
		pois é uma api rest, e padrao rest predoniza q vc nao mantenha estado no seu back-end
		 */		
		//chamada do cors
		http.cors().and().csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().anyRequest().permitAll();
	}
	
	/*
	instanciamos esse objeto para definir as configuração de cors da minha aplicação, liberamos o acesso ou seja
	o meu front-end vai poder acessar o meu back-end
	 */

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}

/*
https://www.treinaweb.com.br/blog/o-que-e-cors-e-como-resolver-os-principais-erros/
O CORS (Cross-origin Resource Sharing) é um mecanismo utilizado pelos navegadores para compartilhar recursos entre 
diferentes origens. O CORS é uma especificação do W3C e faz uso de headers do HTTP para informar aos navegadores se 
determinado recurso pode ser ou não acessado.
*/

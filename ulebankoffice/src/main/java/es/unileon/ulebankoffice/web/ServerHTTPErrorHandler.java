/**
 * 
 */
package es.unileon.ulebankoffice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Clase controlador para manejar los posibles errores HTTP que se puedan
 * producir en la aplicación y mostrar al usuario una página personalizada
 * 
 * @author Razvan Raducu
 * @see <a href="http://royal.pingdom.com/2009/05/06/the-5-most-common-http-errors-according-to-google/" target="_top">Errores HTTP comunes </a>
 */
@Controller
public class ServerHTTPErrorHandler {

//	@RequestMapping(value = "/error/{errorCode}")
//	public String errorPage(@PathVariable("errorCode") String errorCode){
//		switch(errorCode){
//		case "404":
//			return "redirect:/error404";
//		default:
//			return "index";
//		}
//	}
	
	@RequestMapping(value="/error404")
	public String error404(){
		return "HttpError404";
	}
}
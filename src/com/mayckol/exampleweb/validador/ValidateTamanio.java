/**
 * 
 */
package com.mayckol.exampleweb.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author laion
 *
 */
@FacesValidator("vldTamanio")
public class ValidateTamanio implements Validator{

	@Override
	public void validate(FacesContext contexto, UIComponent componente, Object valor) throws ValidatorException {
		// TODO Auto-generated method stub
		if (valor != null && !valor.equals("")) {
			if (valor.toString().length() < 5) {
				FacesMessage mensaje = new FacesMessage();
				mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
				mensaje.setSummary("Longitud incorrecta, mínimo 5 caracteres");
				throw new ValidatorException(mensaje);
			}
		}
	}

}

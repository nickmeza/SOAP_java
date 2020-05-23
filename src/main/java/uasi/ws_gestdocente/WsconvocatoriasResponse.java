
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsconvocatoriasResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseConvocatorias" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsconvocatoriasResult"
})
@XmlRootElement(name = "wsconvocatoriasResponse")
public class WsconvocatoriasResponse {

    protected ArrayOfClaseConvocatorias wsconvocatoriasResult;

    /**
     * Obtiene el valor de la propiedad wsconvocatoriasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseConvocatorias }
     *     
     */
    public ArrayOfClaseConvocatorias getWsconvocatoriasResult() {
        return wsconvocatoriasResult;
    }

    /**
     * Define el valor de la propiedad wsconvocatoriasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseConvocatorias }
     *     
     */
    public void setWsconvocatoriasResult(ArrayOfClaseConvocatorias value) {
        this.wsconvocatoriasResult = value;
    }

}

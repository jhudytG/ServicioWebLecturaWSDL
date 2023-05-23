
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para leyNewton complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="leyNewton"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="aceleracion" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leyNewton", propOrder = {
    "masa",
    "aceleracion"
})
public class LeyNewton {

    protected float masa;
    protected float aceleracion;

    /**
     * Obtiene el valor de la propiedad masa.
     * 
     */
    public float getMasa() {
        return masa;
    }

    /**
     * Define el valor de la propiedad masa.
     * 
     */
    public void setMasa(float value) {
        this.masa = value;
    }

    /**
     * Obtiene el valor de la propiedad aceleracion.
     * 
     */
    public float getAceleracion() {
        return aceleracion;
    }

    /**
     * Define el valor de la propiedad aceleracion.
     * 
     */
    public void setAceleracion(float value) {
        this.aceleracion = value;
    }

}

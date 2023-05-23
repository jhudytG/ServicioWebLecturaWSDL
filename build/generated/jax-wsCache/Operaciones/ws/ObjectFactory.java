
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Areadetriangulo_QNAME = new QName("http://ws/", "areadetriangulo");
    private final static QName _AreadetrianguloResponse_QNAME = new QName("http://ws/", "areadetrianguloResponse");
    private final static QName _EuroAdolar_QNAME = new QName("http://ws/", "euroAdolar");
    private final static QName _EuroAdolarResponse_QNAME = new QName("http://ws/", "euroAdolarResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _LeyNewton_QNAME = new QName("http://ws/", "leyNewton");
    private final static QName _LeyNewtonResponse_QNAME = new QName("http://ws/", "leyNewtonResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "loginResponse");
    private final static QName _OperacionesBasicas_QNAME = new QName("http://ws/", "operacionesBasicas");
    private final static QName _OperacionesBasicasResponse_QNAME = new QName("http://ws/", "operacionesBasicasResponse");
    private final static QName _Velocidad_QNAME = new QName("http://ws/", "velocidad");
    private final static QName _VelocidadResponse_QNAME = new QName("http://ws/", "velocidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Areadetriangulo }
     * 
     */
    public Areadetriangulo createAreadetriangulo() {
        return new Areadetriangulo();
    }

    /**
     * Create an instance of {@link AreadetrianguloResponse }
     * 
     */
    public AreadetrianguloResponse createAreadetrianguloResponse() {
        return new AreadetrianguloResponse();
    }

    /**
     * Create an instance of {@link EuroAdolar }
     * 
     */
    public EuroAdolar createEuroAdolar() {
        return new EuroAdolar();
    }

    /**
     * Create an instance of {@link EuroAdolarResponse }
     * 
     */
    public EuroAdolarResponse createEuroAdolarResponse() {
        return new EuroAdolarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link LeyNewton }
     * 
     */
    public LeyNewton createLeyNewton() {
        return new LeyNewton();
    }

    /**
     * Create an instance of {@link LeyNewtonResponse }
     * 
     */
    public LeyNewtonResponse createLeyNewtonResponse() {
        return new LeyNewtonResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link OperacionesBasicas }
     * 
     */
    public OperacionesBasicas createOperacionesBasicas() {
        return new OperacionesBasicas();
    }

    /**
     * Create an instance of {@link OperacionesBasicasResponse }
     * 
     */
    public OperacionesBasicasResponse createOperacionesBasicasResponse() {
        return new OperacionesBasicasResponse();
    }

    /**
     * Create an instance of {@link Velocidad }
     * 
     */
    public Velocidad createVelocidad() {
        return new Velocidad();
    }

    /**
     * Create an instance of {@link VelocidadResponse }
     * 
     */
    public VelocidadResponse createVelocidadResponse() {
        return new VelocidadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Areadetriangulo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Areadetriangulo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "areadetriangulo")
    public JAXBElement<Areadetriangulo> createAreadetriangulo(Areadetriangulo value) {
        return new JAXBElement<Areadetriangulo>(_Areadetriangulo_QNAME, Areadetriangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreadetrianguloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreadetrianguloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "areadetrianguloResponse")
    public JAXBElement<AreadetrianguloResponse> createAreadetrianguloResponse(AreadetrianguloResponse value) {
        return new JAXBElement<AreadetrianguloResponse>(_AreadetrianguloResponse_QNAME, AreadetrianguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroAdolar")
    public JAXBElement<EuroAdolar> createEuroAdolar(EuroAdolar value) {
        return new JAXBElement<EuroAdolar>(_EuroAdolar_QNAME, EuroAdolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroAdolarResponse")
    public JAXBElement<EuroAdolarResponse> createEuroAdolarResponse(EuroAdolarResponse value) {
        return new JAXBElement<EuroAdolarResponse>(_EuroAdolarResponse_QNAME, EuroAdolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeyNewton }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LeyNewton }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "leyNewton")
    public JAXBElement<LeyNewton> createLeyNewton(LeyNewton value) {
        return new JAXBElement<LeyNewton>(_LeyNewton_QNAME, LeyNewton.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeyNewtonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LeyNewtonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "leyNewtonResponse")
    public JAXBElement<LeyNewtonResponse> createLeyNewtonResponse(LeyNewtonResponse value) {
        return new JAXBElement<LeyNewtonResponse>(_LeyNewtonResponse_QNAME, LeyNewtonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesBasicas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesBasicas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operacionesBasicas")
    public JAXBElement<OperacionesBasicas> createOperacionesBasicas(OperacionesBasicas value) {
        return new JAXBElement<OperacionesBasicas>(_OperacionesBasicas_QNAME, OperacionesBasicas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesBasicasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesBasicasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operacionesBasicasResponse")
    public JAXBElement<OperacionesBasicasResponse> createOperacionesBasicasResponse(OperacionesBasicasResponse value) {
        return new JAXBElement<OperacionesBasicasResponse>(_OperacionesBasicasResponse_QNAME, OperacionesBasicasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Velocidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Velocidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "velocidad")
    public JAXBElement<Velocidad> createVelocidad(Velocidad value) {
        return new JAXBElement<Velocidad>(_Velocidad_QNAME, Velocidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VelocidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VelocidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "velocidadResponse")
    public JAXBElement<VelocidadResponse> createVelocidadResponse(VelocidadResponse value) {
        return new JAXBElement<VelocidadResponse>(_VelocidadResponse_QNAME, VelocidadResponse.class, null, value);
    }

}

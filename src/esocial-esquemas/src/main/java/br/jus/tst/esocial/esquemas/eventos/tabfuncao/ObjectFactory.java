//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabfuncao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.jus.tst.esocial.esquemas.eventos.tabfuncao package. 
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

    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.jus.tst.esocial.esquemas.eventos.tabfuncao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ESocial }
     * 
     */
    public ESocial createESocial() {
        return new ESocial();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link ESocial.EvtTabFuncao }
     * 
     */
    public ESocial.EvtTabFuncao createESocialEvtTabFuncao() {
        return new ESocial.EvtTabFuncao();
    }

    /**
     * Create an instance of {@link ESocial.EvtTabFuncao.InfoFuncao }
     * 
     */
    public ESocial.EvtTabFuncao.InfoFuncao createESocialEvtTabFuncaoInfoFuncao() {
        return new ESocial.EvtTabFuncao.InfoFuncao();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link TIdeCadastro }
     * 
     */
    public TIdeCadastro createTIdeCadastro() {
        return new TIdeCadastro();
    }

    /**
     * Create an instance of {@link TEmpregador }
     * 
     */
    public TEmpregador createTEmpregador() {
        return new TEmpregador();
    }

    /**
     * Create an instance of {@link TDadosFuncao }
     * 
     */
    public TDadosFuncao createTDadosFuncao() {
        return new TDadosFuncao();
    }

    /**
     * Create an instance of {@link TIdeFuncao }
     * 
     */
    public TIdeFuncao createTIdeFuncao() {
        return new TIdeFuncao();
    }

    /**
     * Create an instance of {@link TPeriodoValidade }
     * 
     */
    public TPeriodoValidade createTPeriodoValidade() {
        return new TPeriodoValidade();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link ReferenceType.DigestMethod }
     * 
     */
    public ReferenceType.DigestMethod createReferenceTypeDigestMethod() {
        return new ReferenceType.DigestMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.CanonicalizationMethod }
     * 
     */
    public SignedInfoType.CanonicalizationMethod createSignedInfoTypeCanonicalizationMethod() {
        return new SignedInfoType.CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.SignatureMethod }
     * 
     */
    public SignedInfoType.SignatureMethod createSignedInfoTypeSignatureMethod() {
        return new SignedInfoType.SignatureMethod();
    }

    /**
     * Create an instance of {@link ESocial.EvtTabFuncao.InfoFuncao.Inclusao }
     * 
     */
    public ESocial.EvtTabFuncao.InfoFuncao.Inclusao createESocialEvtTabFuncaoInfoFuncaoInclusao() {
        return new ESocial.EvtTabFuncao.InfoFuncao.Inclusao();
    }

    /**
     * Create an instance of {@link ESocial.EvtTabFuncao.InfoFuncao.Alteracao }
     * 
     */
    public ESocial.EvtTabFuncao.InfoFuncao.Alteracao createESocialEvtTabFuncaoInfoFuncaoAlteracao() {
        return new ESocial.EvtTabFuncao.InfoFuncao.Alteracao();
    }

    /**
     * Create an instance of {@link ESocial.EvtTabFuncao.InfoFuncao.Exclusao }
     * 
     */
    public ESocial.EvtTabFuncao.InfoFuncao.Exclusao createESocialEvtTabFuncaoInfoFuncaoExclusao() {
        return new ESocial.EvtTabFuncao.InfoFuncao.Exclusao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

}

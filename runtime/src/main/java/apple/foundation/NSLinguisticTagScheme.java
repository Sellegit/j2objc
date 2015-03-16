package apple.foundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSLinguisticTagScheme 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeTokenType")
    protected static native NSString TokenTypeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeLexicalClass")
    protected static native NSString LexicalClassValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeNameType")
    protected static native NSString NameTypeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeNameTypeOrLexicalClass")
    protected static native NSString NameTypeOrLexicalClassValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeLemma")
    protected static native NSString LemmaValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeLanguage")
    protected static native NSString LanguageValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSLinguisticTagSchemeScript")
    protected static native NSString ScriptValue();
    
}

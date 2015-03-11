package apple.security;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Security")
public class SecCertificate 
    extends CFType 
     {

    
    
    protected SecCertificate() {}
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPropertyTypeTitle")
    public static native CFType PropertyTypeTitle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPropertyTypeError")
    public static native CFType PropertyTypeError();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecCertificateGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecCertificateCreateWithData")
    public static native SecCertificate createWithData(CFAllocator allocator, CFData data);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecCertificateCopyData")
    public native CFData copyData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecCertificateCopySubjectSummary")
    public native CFString copySubjectSummary();
    
}

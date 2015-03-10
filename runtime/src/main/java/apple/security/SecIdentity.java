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
public class SecIdentity 
    extends CFType 
     {

    
    
    protected SecIdentity() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecIdentityGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecIdentityCopyCertificate")
    public native int copyCertificate(Todo certificateRef);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecIdentityCopyPrivateKey")
    public native int copyPrivateKey(Todo privateKeyRef);
    
}

package apple.coreservices;


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
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork")
public class CFHTTPAuthentication 
    extends CFType 
     {

    
    
    protected CFHTTPAuthentication() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCreateFromResponse")
    protected static native CFHTTPAuthentication create(CFAllocator alloc, CFHTTPMessage response);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationIsValid")
    protected native boolean isValid(Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationAppliesToRequest")
    public native boolean appliesToRequest(CFHTTPMessage request);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresOrderedRequests")
    public native boolean requiresOrderedRequests();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyRealm")
    public native String getRealm();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyDomains")
    public native NSArray<NSURL> getDomains();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyMethod")
    public native String getMethod();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresUserNameAndPassword")
    public native boolean requiresUserNameAndPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresAccountDomain")
    public native boolean requiresAccountDomain();
    
}

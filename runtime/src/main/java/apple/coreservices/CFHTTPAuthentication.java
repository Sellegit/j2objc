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
@Mapping("CFHTTPAuthenticationRef") @Library("CFNetwork/CFNetwork.h")
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
    public static native CFHTTPAuthentication create(CFAllocator alloc, CFHTTPMessage response);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationIsValid")
    public static native boolean isValid(CFHTTPAuthentication auth, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationAppliesToRequest")
    public static native boolean appliesToRequest(CFHTTPAuthentication auth, CFHTTPMessage request);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresOrderedRequests")
    public static native boolean requiresOrderedRequests(CFHTTPAuthentication auth);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyRealm")
    public static native CFString getRealm(CFHTTPAuthentication auth);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyDomains")
    public static native NSArray<NSURL> getDomains(CFHTTPAuthentication auth);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationCopyMethod")
    public static native CFString getMethod(CFHTTPAuthentication auth);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresUserNameAndPassword")
    public static native boolean requiresUserNameAndPassword(CFHTTPAuthentication auth);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPAuthenticationRequiresAccountDomain")
    public static native boolean requiresAccountDomain(CFHTTPAuthentication auth);
    
}

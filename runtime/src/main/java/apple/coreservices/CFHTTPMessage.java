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
@Mapping("CFHTTPMessageRef") @Library("CFNetwork/CFNetwork.h")
public class CFHTTPMessage 
    extends CFType 
     {

    
    
    protected CFHTTPMessage() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationUsername")
    public static native CFString HTTPAuthenticationUsername();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationPassword")
    public static native CFString HTTPAuthenticationPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationAccountDomain")
    public static native CFString HTTPAuthenticationAccountDomain();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateRequest")
    public static native CFHTTPMessage createRequest(CFAllocator alloc, CFString requestMethod, CFURL url, CFString httpVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateResponse")
    public static native CFHTTPMessage createResponse(CFAllocator alloc, @MachineSizedSInt long statusCode, CFString statusDescription, CFString httpVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateEmpty")
    public static native CFHTTPMessage createEmpty(CFAllocator alloc, boolean isRequest);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateCopy")
    public static native CFHTTPMessage createCopy(CFAllocator alloc, CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageIsRequest")
    public static native boolean isRequest(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyVersion")
    public static native CFHTTPVersion getVersion(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyBody")
    public static native CFData getBody(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageSetBody")
    public static native void setBody(CFHTTPMessage message, CFData bodyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyHeaderFieldValue")
    public static native CFString getHeaderFieldValue(CFHTTPMessage message, CFString headerField);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyAllHeaderFields")
    public static native NSDictionary<NSString, NSString> getAllHeaderFields(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageSetHeaderFieldValue")
    public static native void setHeaderFieldValue(CFHTTPMessage message, CFString headerField, CFString value);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageAppendBytes")
    public static native boolean appendBytes(CFHTTPMessage message, Todo newBytes, @MachineSizedSInt long numBytes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageIsHeaderComplete")
    public static native boolean isHeaderComplete(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopySerializedMessage")
    public static native CFData getSerializedMessage(CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyRequestURL")
    public static native CFURL getRequestURL(CFHTTPMessage request);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyRequestMethod")
    public static native CFString getRequestMethod(CFHTTPMessage request);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageAddAuthentication")
    public static native boolean addAuthentication(CFHTTPMessage request, CFHTTPMessage authenticationFailureResponse, CFString username, CFString password, CFString authenticationScheme, boolean forProxy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageGetResponseStatusCode")
    public static native @MachineSizedSInt long getResponseStatusCode(CFHTTPMessage response);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyResponseStatusLine")
    public static native CFString getResponseStatusLine(CFHTTPMessage response);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageApplyCredentials")
    public static native boolean applyCredentials(CFHTTPMessage request, CFHTTPAuthentication auth, CFString username, CFString password, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageApplyCredentialDictionary")
    public static native boolean applyCredentialDictionary(CFHTTPMessage request, CFHTTPAuthentication auth, CFDictionary dict, Todo error);
    
}

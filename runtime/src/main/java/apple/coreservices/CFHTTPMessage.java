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
public class CFHTTPMessage 
    extends CFType 
     {

    
    
    protected CFHTTPMessage() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationUsername")
    protected static native CFString HTTPAuthenticationUsername();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationPassword")
    protected static native CFString HTTPAuthenticationPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationAccountDomain")
    protected static native CFString HTTPAuthenticationAccountDomain();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateRequest")
    protected static native CFHTTPMessage createRequest(CFAllocator alloc, String requestMethod, NSURL url, CFString httpVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateResponse")
    protected static native CFHTTPMessage createResponse(CFAllocator alloc, @MachineSizedSInt long statusCode, String statusDescription, CFString httpVersion);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateEmpty")
    protected static native CFHTTPMessage createEmpty(CFAllocator alloc, boolean isRequest);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCreateCopy")
    public static native CFHTTPMessage createCopy(CFAllocator alloc, CFHTTPMessage message);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageIsRequest")
    public native boolean isRequest();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyVersion")
    public native CFHTTPVersion getVersion();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyBody")
    public native NSData getBody();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageSetBody")
    public native void setBody(NSData bodyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyHeaderFieldValue")
    public native String getHeaderFieldValue(String headerField);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyAllHeaderFields")
    public native NSDictionary<NSString, NSString> getAllHeaderFields();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageSetHeaderFieldValue")
    public native void setHeaderFieldValue(String headerField, String value);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageAppendBytes")
    protected native boolean appendBytes(@Pointer long newBytes, @MachineSizedSInt long numBytes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageIsHeaderComplete")
    public native boolean isHeaderComplete();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopySerializedMessage")
    public native NSData getSerializedMessage();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyRequestURL")
    public native NSURL getRequestURL();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyRequestMethod")
    public native String getRequestMethod();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageAddAuthentication")
    public native boolean addAuthentication(CFHTTPMessage authenticationFailureResponse, String username, String password, CFHTTPAuthenticationScheme authenticationScheme, boolean forProxy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageGetResponseStatusCode")
    public native @MachineSizedSInt long getResponseStatusCode();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageCopyResponseStatusLine")
    public native String getResponseStatusLine();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageApplyCredentials")
    protected native boolean applyCredentials(CFHTTPAuthentication auth, String username, String password, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHTTPMessageApplyCredentialDictionary")
    protected native boolean applyCredentialDictionary(CFHTTPAuthentication auth, CFDictionary dict, Todo error);
    
}

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





@Library("Foundation") @Mapping("NSHTTPURLResponse")
public class NSHTTPURLResponse 
    extends NSURLResponse 
     {

    
    
    public NSHTTPURLResponse() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithURL:statusCode:HTTPVersion:headerFields:")
    public NSHTTPURLResponse(NSURL url, @MachineSizedSInt long statusCode, String HTTPVersion, NSDictionary<?, ?> headerFields) { }
    @Mapping("initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public NSHTTPURLResponse(NSURL URL, String MIMEType, @MachineSizedSInt long length, String name) { }
    
    
    @Mapping("statusCode")
    public native @MachineSizedSInt long getStatusCode();
    @Mapping("allHeaderFields")
    public native Map<String, String> getAllHeaderFields();
    
    
    
    @Mapping("localizedStringForStatusCode:")
    public static native String getLocalizedStatusCode(@MachineSizedSInt long statusCode);
    
}

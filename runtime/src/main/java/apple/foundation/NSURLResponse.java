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





@Library("Foundation") @Mapping("NSURLResponse")
public class NSURLResponse 
    extends NSObject 
    implements NSCopying {

    
    public static final int UnknownLength = -1;
    
    
    public NSURLResponse() {}
    @Mapping("initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public NSURLResponse(NSURL URL, String MIMEType, @MachineSizedSInt long length, String name) { }
    
    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("MIMEType")
    public native String getMIMEType();
    @Mapping("expectedContentLength")
    public native long getExpectedContentLength();
    @Mapping("textEncodingName")
    public native String getTextEncodingName();
    @Mapping("suggestedFilename")
    public native String getSuggestedFilename();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

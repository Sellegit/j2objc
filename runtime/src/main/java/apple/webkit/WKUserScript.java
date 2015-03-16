package apple.webkit;


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
import apple.uikit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("WebKit/WebKit.h") @Mapping("WKUserScript")
public class WKUserScript 
    extends NSObject 
    implements NSCopying {

    
    
    public WKUserScript() {}
    @Mapping("initWithSource:injectionTime:forMainFrameOnly:")
    public WKUserScript(String source, @Representing("WKUserScriptInjectionTime") @MachineSizedSInt long injectionTime, boolean forMainFrameOnly) { }
    
    
    @Mapping("source")
    public native String getSource();
    @Mapping("injectionTime")
    public native @Representing("WKUserScriptInjectionTime") @MachineSizedSInt long getInjectionTime();
    @Mapping("isForMainFrameOnly")
    public native boolean isForMainFrameOnly();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

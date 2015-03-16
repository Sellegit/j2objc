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

@Library("WebKit/WebKit.h") @Mapping("WKPreferences")
public class WKPreferences 
    extends NSObject 
     {

    
    
    public WKPreferences() {}
    
    
    @Mapping("minimumFontSize")
    public native @MachineSizedFloat double getMinimumFontSize();
    @Mapping("setMinimumFontSize:")
    public native void setMinimumFontSize(@MachineSizedFloat double v);
    @Mapping("javaScriptEnabled")
    public native boolean isJavaScriptEnabled();
    @Mapping("setJavaScriptEnabled:")
    public native void setJavaScriptEnabled(boolean v);
    @Mapping("javaScriptCanOpenWindowsAutomatically")
    public native boolean javaScriptCanOpenWindowsAutomatically();
    @Mapping("setJavaScriptCanOpenWindowsAutomatically:")
    public native void setJavaScriptCanOpenWindowsAutomatically(boolean v);
    
    
    
    
    
}

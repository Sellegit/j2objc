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

@Library("WebKit") @Mapping("WKWebViewConfiguration")
public class WKWebViewConfiguration 
    extends NSObject 
    implements NSCopying {

    
    
    public WKWebViewConfiguration() {}
    
    
    @Mapping("processPool")
    public native WKProcessPool getProcessPool();
    public native void setProcessPool(WKProcessPool v);
    @Mapping("preferences")
    public native WKPreferences getPreferences();
    public native void setPreferences(WKPreferences v);
    @Mapping("userContentController")
    public native WKUserContentController getUserContentController();
    public native void setUserContentController(WKUserContentController v);
    @Mapping("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();
    public native void setSuppressesIncrementalRendering(boolean v);
    @Mapping("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();
    public native void setAllowsInlineMediaPlayback(boolean v);
    @Mapping("mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();
    public native void setMediaPlaybackRequiresUserAction(boolean v);
    @Mapping("mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();
    public native void setMediaPlaybackAllowsAirPlay(boolean v);
    @Mapping("selectionGranularity")
    public native @Representing("WKSelectionGranularity") @MachineSizedSInt long getSelectionGranularity();
    public native void setSelectionGranularity(@Representing("WKSelectionGranularity") @MachineSizedSInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

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
@Library("WebKit/WebKit.h") @Mapping("WKWebViewConfiguration")
public class WKWebViewConfiguration 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public WKWebViewConfiguration() { }

    
    @Mapping("processPool")
    public native WKProcessPool getProcessPool();
    @Mapping("setProcessPool:")
    public native void setProcessPool(WKProcessPool v);
    @Mapping("preferences")
    public native WKPreferences getPreferences();
    @Mapping("setPreferences:")
    public native void setPreferences(WKPreferences v);
    @Mapping("userContentController")
    public native WKUserContentController getUserContentController();
    @Mapping("setUserContentController:")
    public native void setUserContentController(WKUserContentController v);
    @Mapping("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();
    @Mapping("setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean v);
    @Mapping("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();
    @Mapping("setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean v);
    @Mapping("mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();
    @Mapping("setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean v);
    @Mapping("mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();
    @Mapping("setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean v);
    @Mapping("selectionGranularity")
    public native @Representing("WKSelectionGranularity") long getSelectionGranularity();
    @Mapping("setSelectionGranularity:")
    public native void setSelectionGranularity(@Representing("WKSelectionGranularity") long v);

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}

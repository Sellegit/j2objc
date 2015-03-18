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

@Library("WebKit/WebKit.h") @Mapping("WKUserContentController")
public class WKUserContentController 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKUserContentController() { }
    
    
    @Mapping("userScripts")
    public native NSArray<WKUserScript> getUserScripts();
    
    
    
    @Mapping("addUserScript:")
    public native void addUserScript(WKUserScript userScript);
    @Mapping("removeAllUserScripts")
    public native void removeAllUserScripts();
    @Mapping("addScriptMessageHandler:name:")
    public native void addScriptMessageHandler(WKScriptMessageHandler scriptMessageHandler, String name);
    @Mapping("removeScriptMessageHandlerForName:")
    public native void removeScriptMessageHandler(String name);
    
}

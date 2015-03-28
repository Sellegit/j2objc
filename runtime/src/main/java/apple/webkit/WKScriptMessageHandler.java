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


@Library("WebKit/WebKit.h") @Mapping("WKScriptMessageHandler")
public interface WKScriptMessageHandler 
    extends NSObjectProtocol {

    
    


    
    @Mapping("userContentController:didReceiveScriptMessage:")
    void didReceiveScriptMessage(WKUserContentController userContentController, WKScriptMessage message);

    /*<adapter>*/
    /*</adapter>*/
}

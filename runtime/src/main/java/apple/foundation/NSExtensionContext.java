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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation") @Mapping("NSExtensionContext")
public class NSExtensionContext 
    extends NSObject 
     {

    
    
    public NSExtensionContext() {}
    
    
    @Mapping("inputItems")
    public native NSArray<NSExtensionItem> getInputItems();
    
    
    
    @Mapping("completeRequestReturningItems:completionHandler:")
    public native void completeRequest(NSArray<?> items, @Block VoidBooleanBlock completionHandler);
    @Mapping("cancelRequestWithError:")
    public native void cancelRequest(NSError error);
    @Mapping("openURL:completionHandler:")
    public native void openURL(NSURL URL, @Block VoidBooleanBlock completionHandler);
    
}

package apple.iad;


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
import apple.addressbook.*;
import apple.mediaplayer.*;
import apple.avkit.*;



/**
 * @since Available in iOS 7.1 and later.
 */

@Library("iAd") @Mapping("ADClient")
public class ADClient 
    extends NSObject 
     {

    
    
    
    
    
    
    
    
    
    /**
     * @since Available in iOS 7.1 and later.
     */
    @Mapping("determineAppInstallationAttributionWithCompletionHandler:")
    public native void determineAppInstallationAttribution(@Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lookupAdConversionDetails:")
    public native void lookupAdConversionDetails(@Block VoidBlock2<NSDate, NSDate> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("addClientToSegments:replaceExisting:")
    public native void addClientToSegments(List<String> segmentIdentifiers, boolean replaceExisting);
    /**
     * @since Available in iOS 7.1 and later.
     */
    @Mapping("sharedClient")
    public static native ADClient getSharedClient();
    
}

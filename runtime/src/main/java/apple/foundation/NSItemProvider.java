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

@Library("Foundation/Foundation.h") @Mapping("NSItemProvider")
public class NSItemProvider 
    extends NSObject 
    implements NSCopying {

    
    
    public NSItemProvider() {}
    @Mapping("initWithItem:typeIdentifier:")
    public NSItemProvider(Object item, String typeIdentifier) { }
    @Mapping("initWithContentsOfURL:")
    public NSItemProvider(NSURL fileURL) { }
    
    
    @Mapping("registeredTypeIdentifiers")
    public native List<String> getRegisteredTypeIdentifiers();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("previewImageHandler")
    public native @Block("(@Block,,)") VoidBlock3<VoidBlock2<NSObject, NSError>, ObjCClass, NSDictionary<NSString, NSObject>> getPreviewImageHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreviewImageHandler:")
    public native void setPreviewImageHandler(@Block("(@Block,,)") VoidBlock3<VoidBlock2<NSObject, NSError>, ObjCClass, NSDictionary<NSString, NSObject>> v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSExtensionJavaScriptPreprocessingResultsKey")
    public static native String JavaScriptPreprocessingResultsKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSExtensionJavaScriptFinalizeArgumentKey")
    public static native String JavaScriptFinalizeArgumentKey();
    
    @Mapping("hasItemConformingToTypeIdentifier:")
    public native boolean hasItemConformingToTypeIdentifier(String typeIdentifier);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

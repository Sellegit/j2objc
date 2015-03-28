package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIPrinter")
public class UIPrinter 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIPrinter() { }

    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("displayName")
    public native String getDisplayName();
    @Mapping("displayLocation")
    public native String getDisplayLocation();
    @Mapping("supportedJobTypes")
    public native @Representing("UIPrinterJobTypes") long getSupportedJobTypes();
    @Mapping("makeAndModel")
    public native String getMakeAndModel();
    @Mapping("supportsColor")
    public native boolean supportsColor();
    @Mapping("supportsDuplex")
    public native boolean supportsDuplex();

    
    
    @Mapping("contactPrinter:")
    public native void contactPrinter(@Block VoidBooleanBlock completionHandler);
    @Mapping("printerWithURL:")
    public static native UIPrinter create(NSURL url);

}

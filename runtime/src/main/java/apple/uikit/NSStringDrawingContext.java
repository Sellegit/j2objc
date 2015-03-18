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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("NSStringDrawingContext")
public class NSStringDrawingContext 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSStringDrawingContext() { }
    
    
    @Mapping("minimumScaleFactor")
    public native @MachineSizedFloat double getMinimumScaleFactor();
    @Mapping("setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("minimumTrackingAdjustment")
    public native @MachineSizedFloat double getMinimumTrackingAdjustment();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setMinimumTrackingAdjustment:")
    public native void setMinimumTrackingAdjustment(@MachineSizedFloat double v);
    @Mapping("actualScaleFactor")
    public native @MachineSizedFloat double getActualScaleFactor();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("actualTrackingAdjustment")
    public native @MachineSizedFloat double getActualTrackingAdjustment();
    @Mapping("totalBounds")
    public native CGRect getTotalBounds();
    
    
    
    
    
}

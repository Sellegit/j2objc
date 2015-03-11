package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreLocation") @Mapping("CLRegion")
public class CLRegion 
    extends NSObject 
    implements NSCopying {

    
    
    public CLRegion() {}
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initCircularRegionWithCenter:radius:identifier:")
    public CLRegion(CLLocationCoordinate2D center, double radius, String identifier) { }
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("center")
    public native CLLocationCoordinate2D getCenter();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("radius")
    public native double getRadius();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("notifyOnEntry")
    public native boolean notifiesOnEntry();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setNotifyOnEntry:")
    public native void setNotifiesOnEntry(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("notifyOnExit")
    public native boolean notifiesOnExit();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setNotifyOnExit:")
    public native void setNotifiesOnExit(boolean v);
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("containsCoordinate:")
    public native boolean containsCoordinate(CLLocationCoordinate2D coordinate);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

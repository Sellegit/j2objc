package apple.eventkit;


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
import apple.corelocation.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("EventKit/EventKit.h") @Mapping("EKStructuredLocation")
public class EKStructuredLocation 
    extends EKObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public EKStructuredLocation() { }

    
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("geoLocation")
    public native CLLocation getGeoLocation();
    @Mapping("setGeoLocation:")
    public native void setGeoLocation(CLLocation v);
    @Mapping("radius")
    public native double getRadius();
    @Mapping("setRadius:")
    public native void setRadius(double v);

    
    
    @Mapping("locationWithTitle:")
    public static native EKStructuredLocation create(String title);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}

package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 3.0 and later.
 */
@Library("MapKit/MapKit.h")
@Mapping("MKMapType")
public final class MKMapType extends ObjCEnum {
    
    @GlobalConstant("MKMapTypeStandard")
    public static final long Standard = 0L;
    @GlobalConstant("MKMapTypeSatellite")
    public static final long Satellite = 1L;
    @GlobalConstant("MKMapTypeHybrid")
    public static final long Hybrid = 2L;


}

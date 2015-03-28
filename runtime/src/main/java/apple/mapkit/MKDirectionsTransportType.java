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
 * @since Available in iOS 7.0 and later.
 */
@Library("MapKit/MapKit.h")
@Mapping("MKDirectionsTransportType")
public final class MKDirectionsTransportType extends ObjCEnum {
    
    @GlobalConstant("MKDirectionsTransportTypeAutomobile")
    public static final long Automobile = 1L;
    @GlobalConstant("MKDirectionsTransportTypeWalking")
    public static final long Walking = 2L;
    @GlobalConstant("MKDirectionsTransportTypeAny")
    public static final long Any = 268435455L;


}

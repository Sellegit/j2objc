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
 * @since Available in iOS 5.0 and later.
 */
@Library("MapKit/MapKit.h")
@Mapping("MKUserTrackingMode")
public final class MKUserTrackingMode extends ObjCEnum {
    
    @GlobalConstant("MKUserTrackingModeNone")
    public static final long None = 0L;
    @GlobalConstant("MKUserTrackingModeFollow")
    public static final long Follow = 1L;
    @GlobalConstant("MKUserTrackingModeFollowWithHeading")
    public static final long FollowWithHeading = 2L;


}

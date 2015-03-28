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
@Mapping("MKErrorCode")
public final class MKErrorCode extends ObjCEnum {
    
    @GlobalConstant("MKErrorUnknown")
    public static final long Unknown = 1L;
    @GlobalConstant("MKErrorServerFailure")
    public static final long ServerFailure = 2L;
    @GlobalConstant("MKErrorLoadingThrottled")
    public static final long LoadingThrottled = 3L;
    @GlobalConstant("MKErrorPlacemarkNotFound")
    public static final long PlacemarkNotFound = 4L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("MKErrorDirectionsNotFound")
    public static final long DirectionsNotFound = 5L;


}

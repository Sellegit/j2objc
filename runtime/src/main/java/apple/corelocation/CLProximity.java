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
 * @since Available in iOS 7.0 and later.
 */
@Library("CoreLocation/CoreLocation.h")
@Mapping("CLProximity")
public final class CLProximity extends ObjCEnum {
    
    @GlobalConstant("CLProximityUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CLProximityImmediate")
    public static final long Immediate = 1L;
    @GlobalConstant("CLProximityNear")
    public static final long Near = 2L;
    @GlobalConstant("CLProximityFar")
    public static final long Far = 3L;


}

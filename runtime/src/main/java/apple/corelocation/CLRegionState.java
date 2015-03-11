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

@Library("CoreLocation")
@Mapping("CLRegionState")
public final class CLRegionState extends ObjCEnum {
    
    @GlobalConstant("CLRegionStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CLRegionStateInside")
    public static final long Inside = 1L;
    @GlobalConstant("CLRegionStateOutside")
    public static final long Outside = 2L;
    

}

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





@Library("CoreLocation/CoreLocation.h")
@Mapping("CLActivityType")
public final class CLActivityType extends ObjCEnum {
    
    @GlobalConstant("CLActivityTypeOther")
    public static final long Other = 1L;
    @GlobalConstant("CLActivityTypeAutomotiveNavigation")
    public static final long AutomotiveNavigation = 2L;
    @GlobalConstant("CLActivityTypeFitness")
    public static final long Fitness = 3L;
    @GlobalConstant("CLActivityTypeOtherNavigation")
    public static final long OtherNavigation = 4L;
    

}

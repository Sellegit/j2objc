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





@Library("EventKit")
@Mapping("EKEventAvailability")
public final class EKEventAvailability extends ObjCEnum {
    
    @GlobalConstant("EKEventAvailabilityNotSupported")
    public static final long NotSupported = -1L;
    @GlobalConstant("EKEventAvailabilityBusy")
    public static final long Busy = 0L;
    @GlobalConstant("EKEventAvailabilityFree")
    public static final long Free = 1L;
    @GlobalConstant("EKEventAvailabilityTentative")
    public static final long Tentative = 2L;
    @GlobalConstant("EKEventAvailabilityUnavailable")
    public static final long Unavailable = 3L;
    

}

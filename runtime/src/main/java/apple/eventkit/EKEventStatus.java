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





@Library("EventKit/EventKit.h")
@Mapping("EKEventStatus")
public final class EKEventStatus extends ObjCEnum {
    
    @GlobalConstant("EKEventStatusNone")
    public static final long None = 0L;
    @GlobalConstant("EKEventStatusConfirmed")
    public static final long Confirmed = 1L;
    @GlobalConstant("EKEventStatusTentative")
    public static final long Tentative = 2L;
    @GlobalConstant("EKEventStatusCanceled")
    public static final long Canceled = 3L;
    

}

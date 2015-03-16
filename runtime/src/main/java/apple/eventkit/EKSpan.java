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
@Mapping("EKSpan")
public final class EKSpan extends ObjCEnum {
    
    @GlobalConstant("EKSpanThisEvent")
    public static final long ThisEvent = 0L;
    @GlobalConstant("EKSpanFutureEvents")
    public static final long FutureEvents = 1L;
    

}

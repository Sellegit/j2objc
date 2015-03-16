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
@Mapping("EKEntityMask")
public final class EKEntityMask extends ObjCEnum {
    
    @GlobalConstant("EKEntityMaskEvent")
    public static final long Event = 1L;
    @GlobalConstant("EKEntityMaskReminder")
    public static final long Reminder = 2L;
    

}

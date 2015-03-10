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






@Mapping("EKEntityType")
public final class EKEntityType extends ObjCEnum {
    
    @GlobalConstant("EKEntityTypeEvent")
    public static final long Event = 0L;
    @GlobalConstant("EKEntityTypeReminder")
    public static final long Reminder = 1L;
    

}

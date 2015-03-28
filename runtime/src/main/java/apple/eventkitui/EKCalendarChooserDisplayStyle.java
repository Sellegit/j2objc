package apple.eventkitui;


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
import apple.eventkit.*;
import apple.uikit.*;


@Library("EventKitUI/EventKitUI.h")
@Mapping("EKCalendarChooserDisplayStyle")
public final class EKCalendarChooserDisplayStyle extends ObjCEnum {
    
    @GlobalConstant("EKCalendarChooserDisplayAllCalendars")
    public static final long AllCalendars = 0L;
    @GlobalConstant("EKCalendarChooserDisplayWritableCalendarsOnly")
    public static final long WritableCalendarsOnly = 1L;


}

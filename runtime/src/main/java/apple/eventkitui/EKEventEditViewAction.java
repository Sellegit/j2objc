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
@Mapping("EKEventEditViewAction")
public final class EKEventEditViewAction extends ObjCEnum {
    
    @GlobalConstant("EKEventEditViewActionCanceled")
    public static final long Canceled = 0L;
    @GlobalConstant("EKEventEditViewActionSaved")
    public static final long Saved = 1L;
    @GlobalConstant("EKEventEditViewActionDeleted")
    public static final long Deleted = 2L;
    @GlobalConstant("EKEventEditViewActionCancelled")
    public static final long Cancelled = 0L;


}

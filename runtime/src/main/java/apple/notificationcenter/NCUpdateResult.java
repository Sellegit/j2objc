package apple.notificationcenter;


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
import apple.uikit.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("NotificationCenter/NotificationCenter.h")
@Mapping("NCUpdateResult")
public final class NCUpdateResult extends ObjCEnum {
    
    @GlobalConstant("NCUpdateResultNewData")
    public static final long NewData = 0L;
    @GlobalConstant("NCUpdateResultNoData")
    public static final long NoData = 1L;
    @GlobalConstant("NCUpdateResultFailed")
    public static final long Failed = 2L;


}

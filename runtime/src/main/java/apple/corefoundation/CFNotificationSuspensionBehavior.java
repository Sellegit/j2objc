package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation")
@Mapping("CFNotificationSuspensionBehavior")
public final class CFNotificationSuspensionBehavior extends ObjCEnum {
    
    @GlobalConstant("CFNotificationSuspensionBehaviorDrop")
    public static final long Drop = 1L;
    @GlobalConstant("CFNotificationSuspensionBehaviorCoalesce")
    public static final long Coalesce = 2L;
    @GlobalConstant("CFNotificationSuspensionBehaviorHold")
    public static final long Hold = 3L;
    @GlobalConstant("CFNotificationSuspensionBehaviorDeliverImmediately")
    public static final long DeliverImmediately = 4L;
    

}

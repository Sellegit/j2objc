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
@Mapping("CFNotificationPostingOptions")
public final class CFNotificationPostingOptions extends ObjCEnum {
    
    @GlobalConstant("kCFNotificationDeliverImmediately")
    public static final long DeliverImmediately = 1L;
    @GlobalConstant("kCFNotificationPostToAllSessions")
    public static final long PostToAllSessions = 2L;
    

}

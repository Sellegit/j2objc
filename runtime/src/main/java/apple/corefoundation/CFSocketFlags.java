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





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFSocketFlags")
public final class CFSocketFlags extends ObjCEnum {
    
    @GlobalConstant("kCFSocketAutomaticallyReenableReadCallBack")
    public static final long AutomaticallyReenableReadCallBack = 1L;
    @GlobalConstant("kCFSocketAutomaticallyReenableAcceptCallBack")
    public static final long AutomaticallyReenableAcceptCallBack = 2L;
    @GlobalConstant("kCFSocketAutomaticallyReenableDataCallBack")
    public static final long AutomaticallyReenableDataCallBack = 3L;
    @GlobalConstant("kCFSocketAutomaticallyReenableWriteCallBack")
    public static final long AutomaticallyReenableWriteCallBack = 8L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFSocketLeaveErrors")
    public static final long LeaveErrors = 64L;
    @GlobalConstant("kCFSocketCloseOnInvalidate")
    public static final long CloseOnInvalidate = 128L;
    

}

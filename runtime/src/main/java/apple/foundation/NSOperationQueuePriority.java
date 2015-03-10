package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;






@Mapping("NSOperationQueuePriority")
public final class NSOperationQueuePriority extends ObjCEnum {
    
    @GlobalConstant("NSOperationQueuePriorityVeryLow")
    public static final long VeryLow = -8L;
    @GlobalConstant("NSOperationQueuePriorityLow")
    public static final long Low = -4L;
    @GlobalConstant("NSOperationQueuePriorityNormal")
    public static final long Normal = 0L;
    @GlobalConstant("NSOperationQueuePriorityHigh")
    public static final long High = 4L;
    @GlobalConstant("NSOperationQueuePriorityVeryHigh")
    public static final long VeryHigh = 8L;
    

}

package apple.metal;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal/Metal.h")
@Mapping("MTLCommandBufferStatus")
public final class MTLCommandBufferStatus extends ObjCEnum {
    
    @GlobalConstant("MTLCommandBufferStatusNotEnqueued")
    public static final long NotEnqueued = 0L;
    @GlobalConstant("MTLCommandBufferStatusEnqueued")
    public static final long Enqueued = 1L;
    @GlobalConstant("MTLCommandBufferStatusCommitted")
    public static final long Committed = 2L;
    @GlobalConstant("MTLCommandBufferStatusScheduled")
    public static final long Scheduled = 3L;
    @GlobalConstant("MTLCommandBufferStatusCompleted")
    public static final long Completed = 4L;
    @GlobalConstant("MTLCommandBufferStatusError")
    public static final long Error = 5L;
    

}

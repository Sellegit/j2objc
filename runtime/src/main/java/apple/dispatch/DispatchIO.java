package apple.dispatch;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("System")
public class DispatchIO 
    extends DispatchObject 
     {

    
    public static final int STREAM = 0;
    public static final int RANDOM = 1;
    public static final int STOP = 0x1;
    public static final int STRICT_INTERVAL = 0x1;
    
    
    protected DispatchIO() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_create")
    public static native DispatchIO create(@MachineSizedUInt long type, int fd, DispatchQueue queue, @Block VoidBlock1<Integer> cleanup_handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_create_with_path")
    public static native DispatchIO createWithPath(@MachineSizedUInt long type, Todo path, int oflag, short mode, DispatchQueue queue, @Block VoidBlock1<Integer> cleanup_handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_create_with_io")
    public static native DispatchIO createWithIo(@MachineSizedUInt long type, DispatchIO io, DispatchQueue queue, @Block VoidBlock1<Integer> cleanup_handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_read")
    public native void read(long offset, @MachineSizedUInt long length, DispatchQueue queue, @Block VoidBlock3<Boolean, DispatchData, Integer> io_handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_write")
    public native void write(long offset, DispatchData data, DispatchQueue queue, @Block VoidBlock3<Boolean, DispatchData, Integer> io_handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_close")
    public native void close(@MachineSizedUInt long flags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_barrier")
    public native void barrier(@Block Runnable barrier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_get_descriptor")
    public native int getDescriptor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_set_high_water")
    public native void setHighWater(@MachineSizedUInt long high_water);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_set_low_water")
    public native void setLowWater(@MachineSizedUInt long low_water);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_io_set_interval")
    public native void setInterval(long interval, @MachineSizedUInt long flags);
    
}

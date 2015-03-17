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
@Library("dispatch/dispatch.h")
public class DispatchData 
    extends DispatchObject 
     {

    
    
    protected DispatchData() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("_dispatch_data_empty")
    public static native DispatchData Empty();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("_dispatch_data_empty")
    public static native void Empty(DispatchData v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("_dispatch_data_destructor_free")
    public static native DispatchData DestructorFree();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("_dispatch_data_destructor_munmap")
    public static native DispatchData DestructorMunmap();
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create")
    public static native DispatchData create(Todo buffer, @MachineSizedUInt long size, DispatchQueue queue, @Block Runnable destructor);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_get_size")
    public static native @MachineSizedUInt long getSize(DispatchData data);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_map")
    public static native DispatchData createMap(DispatchData data, Todo buffer_ptr, Todo size_ptr);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_concat")
    public static native DispatchData createConcat(DispatchData data1, DispatchData data2);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_subrange")
    public static native DispatchData createSubrange(DispatchData data, @MachineSizedUInt long offset, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_apply")
    public static native boolean apply(DispatchData data, @Block("(,@MachineSizedUInt,,@MachineSizedUInt)") VoidBlock4<DispatchData, Long, Todo, Long> applier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_copy_region")
    public static native DispatchData copyRegion(DispatchData data, @MachineSizedUInt long location, Todo offset_ptr);
    
}

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
    public native @MachineSizedUInt long getSize();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_map")
    public native DispatchData createMap(Todo buffer_ptr, Todo size_ptr);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_concat")
    public native DispatchData createConcat(DispatchData data2);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_create_subrange")
    public native DispatchData createSubrange(@MachineSizedUInt long offset, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_apply")
    public native boolean apply(@Block("(,@MachineSizedUInt,,@MachineSizedUInt)") VoidBlock4<DispatchData, Long, Todo, Long> applier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_data_copy_region")
    public native DispatchData copyRegion(@MachineSizedUInt long location, Todo offset_ptr);
    
}

package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia")
public class CMMemoryPool 
    extends CFType 
     {

    
    
    protected CMMemoryPool() {}
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMMemoryPoolGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMMemoryPoolCreate")
    public static native CMMemoryPool create(CMMemoryPoolOptions options);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMMemoryPoolGetAllocator")
    public native CFAllocator getAllocator();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMMemoryPoolFlush")
    public native void flush();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMMemoryPoolInvalidate")
    public native void invalidate();
    
}

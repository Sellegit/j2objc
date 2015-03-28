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

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSZone 
    extends Object 
     {

    
    
    protected NSZone() {}

    
    
    
    @GlobalFunction("NSDefaultMallocZone")
    public static native NSZone getDefaultMallocZone();
    @GlobalFunction("NSCreateZone")
    public static native NSZone create(@MachineSizedUInt long startSize, @MachineSizedUInt long granularity, boolean canFree);
    @GlobalFunction("NSRecycleZone")
    public static native void recycle(NSZone zone);
    @GlobalFunction("NSSetZoneName")
    public static native void setName(NSZone zone, String name);
    @GlobalFunction("NSZoneName")
    public static native String getName(NSZone zone);
    @GlobalFunction("NSZoneFromPointer")
    public static native NSZone fromPointer(Todo ptr);
    @GlobalFunction("NSZoneMalloc")
    public static native Todo malloc(NSZone zone, @MachineSizedUInt long size);
    @GlobalFunction("NSZoneCalloc")
    public static native Todo calloc(NSZone zone, @MachineSizedUInt long numElems, @MachineSizedUInt long byteSize);
    @GlobalFunction("NSZoneRealloc")
    public static native Todo realloc(NSZone zone, Todo ptr, @MachineSizedUInt long size);
    @GlobalFunction("NSZoneFree")
    public static native void free(NSZone zone, Todo ptr);
    @GlobalFunction("NSPageSize")
    public static native @MachineSizedUInt long getPageSize();
    @GlobalFunction("NSLogPageSize")
    public static native @MachineSizedUInt long getLogPageSize();
    @GlobalFunction("NSRoundUpToMultipleOfPageSize")
    public static native @MachineSizedUInt long roundUpToMultipleOfPageSize(@MachineSizedUInt long bytes);
    @GlobalFunction("NSRoundDownToMultipleOfPageSize")
    public static native @MachineSizedUInt long roundDownToMultipleOfPageSize(@MachineSizedUInt long bytes);
    @GlobalFunction("NSAllocateMemoryPages")
    public static native Todo allocateMemoryPages(@MachineSizedUInt long bytes);
    @GlobalFunction("NSDeallocateMemoryPages")
    public static native void deallocateMemoryPages(Todo ptr, @MachineSizedUInt long bytes);
    @GlobalFunction("NSCopyMemoryPages")
    public static native void copyMemoryPages(Todo source, Todo dest, @MachineSizedUInt long bytes);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction("NSRealMemoryAvailable")
    public static native @MachineSizedUInt long getRealMemoryAvailable();

}

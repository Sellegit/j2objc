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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CFURLEnumerator 
    extends CFType 
     {

    
    
    protected CFURLEnumerator() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorCreateForDirectoryURL")
    public static native CFURLEnumerator createForDirectoryURL(CFAllocator alloc, CFURL directoryURL, CFURLEnumeratorOptions option, CFArray propertyKeys);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorCreateForMountedVolumes")
    public static native CFURLEnumerator createForMountedVolumes(CFAllocator alloc, CFURLEnumeratorOptions option, CFArray propertyKeys);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorGetNextURL")
    public native CFURLEnumeratorResult getNextURL(Todo url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorSkipDescendents")
    public native void skipDescendents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLEnumeratorGetDescendentLevel")
    public native @MachineSizedSInt long getDescendentLevel();
    
}

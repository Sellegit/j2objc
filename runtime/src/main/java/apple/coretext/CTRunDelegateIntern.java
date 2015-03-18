package apple.coretext;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreText/CoreText.h")
 class CTRunDelegateIntern 
    extends CFType 
     {

    
    
    protected CTRunDelegateIntern() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunDelegateGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunDelegateCreate")
    public static native CTRunDelegateIntern create(CTRunDelegateCallbacks callbacks, Todo refCon);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunDelegateGetRefCon")
    public static native @Pointer long getRefCon(CTRunDelegateIntern runDelegate);
    
}

package apple.coregraphics;


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
import apple.uikit.*;

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CGDataConsumerRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGDataConsumer 
    extends CFType 
     {

    
    
    protected CGDataConsumer() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataConsumerGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataConsumerCreateWithURL")
    public static native CGDataConsumer create(CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataConsumerCreateWithCFData")
    public static native CGDataConsumer create(CFMutableData data);

}

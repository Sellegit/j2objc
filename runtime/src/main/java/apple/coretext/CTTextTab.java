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
@Library("CoreText")
public class CTTextTab 
    extends CFType 
     {

    
    
    protected CTTextTab() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabCreate")
    public static native CTTextTab create(CTTextAlignment alignment, double location, CTTextTabOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetAlignment")
    public native CTTextAlignment getAlignment();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetLocation")
    public native double getLocation();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetOptions")
    public native CTTextTabOptions getOptions();
    
}

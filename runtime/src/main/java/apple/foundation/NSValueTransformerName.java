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
public class NSValueTransformerName 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSNegateBooleanTransformerName")
    public static native String NegateBooleanValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSIsNilTransformerName")
    public static native String IsNilValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSIsNotNilTransformerName")
    public static native String IsNotNilValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUnarchiveFromDataTransformerName")
    public static native String UnarchiveFromDataValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSKeyedUnarchiveFromDataTransformerName")
    public static native String KeyedUnarchiveFromDataValue();

}

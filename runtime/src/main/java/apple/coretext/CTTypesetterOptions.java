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
public class CTTypesetterOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCTTypesetterOptionDisableBidiProcessing")
    public static native CFString DisableBidiProcessing();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTTypesetterOptionForcedEmbeddingLevel")
    public static native CFString ForcedEmbeddingLevel();

}

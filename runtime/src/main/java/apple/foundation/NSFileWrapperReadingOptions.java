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



/**
 * @since Available in iOS 4.0 and later.
 */


@Mapping("NSFileWrapperReadingOptions")
public final class NSFileWrapperReadingOptions extends ObjCEnum {
    
    @GlobalConstant("NSFileWrapperReadingImmediate")
    public static final long Immediate = 1L;
    @GlobalConstant("NSFileWrapperReadingWithoutMapping")
    public static final long WithoutMapping = 2L;
    

}

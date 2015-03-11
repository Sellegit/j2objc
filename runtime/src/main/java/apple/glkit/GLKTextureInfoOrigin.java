package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */


@Mapping("GLKTextureInfoOrigin")
public final class GLKTextureInfoOrigin extends ObjCEnum {
    
    @GlobalConstant("GLKTextureInfoOriginUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("GLKTextureInfoOriginTopLeft")
    public static final long TopLeft = 1L;
    @GlobalConstant("GLKTextureInfoOriginBottomLeft")
    public static final long BottomLeft = 2L;
    

}

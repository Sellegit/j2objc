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

@Library("GLKit")
@Mapping("GLKLightingType")
public final class GLKLightingType extends ObjCEnum {
    
    @GlobalConstant("GLKLightingTypePerVertex")
    public static final long Vertex = 0L;
    @GlobalConstant("GLKLightingTypePerPixel")
    public static final long Pixel = 1L;
    

}
